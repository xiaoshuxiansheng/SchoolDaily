package com.lightgo.schooldaily.UserMessage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;


import com.lightgo.schooldaily.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Administrator on 2017/8/8.
 */

public class LoginActivity extends Activity implements View.OnClickListener,Handler.Callback{
    private  SharedPreferences mySharedPreferences;
    private  SharedPreferences.Editor editor;
    private ImageView mLogin = null;
    private EditText mUserName = null;
    private EditText mPassWord = null;
    private Handler mHandler = null;
    private UserInfo userInfo = null;
    private JSONObject Json = null;
    public static String UserName = null;
    private String pathAPI ="http://192.168.98.1:8080/ad/login";// "http://192.168.198.1:12582/SchoolDaily/public/index.php/Admin/logincontroller/login";
    public class UserInfo{
        String UserName;
        String PassWord;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login1);
        LoginActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
         mySharedPreferences = getSharedPreferences("test", Activity.MODE_PRIVATE);
         editor = mySharedPreferences.edit();
        mLogin = (ImageView)findViewById(R.id.mLogin);
        mUserName = (EditText)findViewById(R.id.mUserName);
        mPassWord = (EditText)findViewById(R.id.mPassWord);
        mPassWord.setInputType(0x81);
        mLogin.setOnClickListener(this);
        mHandler = new Handler(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mLogin:
                    userInfo = new UserInfo();
                    userInfo.UserName = mUserName.getText().toString();
                    userInfo.PassWord = mPassWord.getText().toString();
                    Message message = new Message();
                    message.what = 0;
                    message.obj = userInfo;
                    mHandler.sendMessage(message);
            default:
                break;
        }
    }

    @Override
    public boolean handleMessage(Message message) {
        switch (message.what){
            case 0:
                UserInfo muserInfo = (UserInfo) message.obj;
                UserName = muserInfo.UserName;
                String mPassWord = muserInfo.PassWord;
                GetInfo(UserName,mPassWord);
                break;
            case 1:
                try {
                    JSONObject json=new JSONObject((String) message.obj);
                    int user_permission=json.getInt("userPermission");
                    String user_nickname=json.getString("userNickname");
                    String user_portrait=json.getString("userPictrue");
                    String user_password=json.getString("userPassword");
                    String user_id=json.getString("userId");

                editor.putString("user_id",user_id);
                editor.putString("user_portrait",user_portrait);
                editor.putString("user_nickname", user_nickname);
                editor.putString("user_password", user_password);
                editor.putInt("user_permission", user_permission);
                editor.commit();
                Receive(user_permission);//判断用户类型以及跳转页面
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
        return false;
    }
    private void Receive(int user_permission){
        switch (user_permission){
            case 1:  //到管理员的个人中心

                Intent intent = new Intent(LoginActivity.this,AdminActivity.class);
                startActivity(intent);
                finish();
                break;
            case 2:

                Intent sintent = new Intent(LoginActivity.this,StudentActivity.class);
                startActivity(sintent);
                finish();
                break;
            default:
                break;
        }
    }
    private void GetInfo(String mUserName,String mPassWord){
        Json = new JSONObject();
        try {
            Json.put("user_id",mUserName);
            Json.put("user_password",mPassWord);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        new Thread()
        {
            @Override
            public void run()
            {
                String s = httpUrlConnection(pathAPI, Json.toString());
                Log.d("qwe111",s);
                Message msg = new Message();
                msg.what=1;
                msg.obj=s;
                mHandler.sendMessage(msg);
            }
        }.start();
    }
    private String httpUrlConnection( String uriAPI,String requestString){
        StringBuffer sb = new StringBuffer();
        try{
            //建立连接
            URL url=new URL(uriAPI);
            HttpURLConnection httpConn=(HttpURLConnection)url.openConnection();
            String param =  "UserInfo="+ URLEncoder.encode(requestString,"UTF-8");
            //设置请求属性
            //获得数据字节数据，请求数据流的编码，必须和下面服务器端处理请求流的编码一致
            httpConn.setDoOutput(true);   //需要输出
            httpConn.setDoInput(true);   //需要输入
            httpConn.setUseCaches(false);
            httpConn.setRequestMethod("POST");
            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpConn.setRequestProperty("Connection", "Keep-Alive");
            httpConn.setRequestProperty("Charset", "UTF-8");
            httpConn.connect();
            //建立输出流，并写入数据
            DataOutputStream outputStream = new DataOutputStream( httpConn.getOutputStream());
            outputStream.writeBytes(param);
            outputStream.close();
            //获得响应状态
            int responseCode = httpConn.getResponseCode();
            if(HttpURLConnection.HTTP_OK == responseCode){//连接成功
                String readLine=new String();
                BufferedReader responseReader;
                responseReader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
                while ((readLine = responseReader.readLine()) != null) {
                    sb.append(readLine).append("\n");
                }
                responseReader.close();
                return sb.toString();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return sb.toString();
    }
}