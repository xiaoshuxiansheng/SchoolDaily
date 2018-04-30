package com.lightgo.schooldaily.UserMessage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lightgo.schooldaily.ActActivity.ManageActivity;
import com.lightgo.schooldaily.AdminUser.ClassRankActivity;
import com.lightgo.schooldaily.AdminUser.StudentInfoActivity;
import com.lightgo.schooldaily.AdminUser.ToBeProcessActivity;
import com.lightgo.schooldaily.AdminUser.TodayCheckActivity;
import com.lightgo.schooldaily.R;

/**
 * Created by Administrator on 2017/8/9.
 */

public class AdminActivity extends Activity implements View.OnClickListener{
    private ImageView portrait_img;
    private TextView nickname_tex;
    private SharedPreferences SP;

    private LinearLayout ll_one,ll_two,ll_three,ll_four,mLineCheckMenu;
    private Button mEsc = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        /*SimpleDateFormat sDateFormat    =   new    SimpleDateFormat("yyyy-MM-dd    hh:mm:ss");
        String    d    =    sDateFormat.format(new    java.util.Date());*/
        nickname_tex= (TextView) findViewById(R.id.id_user_nickname);
        portrait_img= (ImageView) findViewById(R.id.id_portrait);

        ll_one = (LinearLayout)findViewById(R.id.ll_one);
        ll_two = (LinearLayout)findViewById(R.id.ll_two);
        ll_three = (LinearLayout)findViewById(R.id.ll_three);
        ll_four = (LinearLayout)findViewById(R.id.ll_four);
        mLineCheckMenu= (LinearLayout) findViewById(R.id.check_menu);
        ll_one.setOnClickListener(this);
        ll_two.setOnClickListener(this);
        ll_three.setOnClickListener(this);
        ll_four.setOnClickListener(this);
        mLineCheckMenu.setOnClickListener(this);

        mEsc = (Button)findViewById(R.id.Esc);
        mEsc.setOnClickListener(this);
        admin_info_init();
    }

    private void admin_info_init() {
        SP=getSharedPreferences("test", Activity.MODE_PRIVATE);
        nickname_tex.setText(SP.getString("user_nickname",null));//显示用户名
        Glide.with(this).load(SP.getString("user_portrait",null)).into(portrait_img);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Esc:
                //MainActivity.Is_Login = false;
                //MainActivity.Is_flag = false;
                finish();
                break;
            case R.id.ll_one:   //班级排名
                Intent ClassRankIntent = new Intent(AdminActivity.this, ClassRankActivity.class);
                startActivity(ClassRankIntent);
                break;
            case R.id.ll_two: //今日考勤
                Intent ToDayIntent = new Intent(AdminActivity.this, TodayCheckActivity.class);
                startActivity(ToDayIntent);
                break;
            case R.id.ll_three:   //学生信息a
                Intent StudentInfoIntent = new Intent(AdminActivity.this, StudentInfoActivity.class);
                startActivity(StudentInfoIntent);
                break;
            case R.id.ll_four:    //未处理事件
                Intent ToBeProcessIntent = new Intent(AdminActivity.this, ToBeProcessActivity.class);
                startActivity(ToBeProcessIntent);
                break;
            case R.id.check_menu:
                Intent ToManageInten = new Intent(AdminActivity.this, ManageActivity.class);
                startActivity(ToManageInten);
                break;
            default:
                break;
        }
    }
}
