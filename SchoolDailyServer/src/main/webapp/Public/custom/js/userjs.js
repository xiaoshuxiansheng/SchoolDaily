
/*jQuery(document).ready(function($) {
	
	alert("你好啊");
})*/
$(document).ready(function(){
$.get("admin/getusers",function(data,status){
	var i;
	for (i in data){
		var tr=
		'<td class="td id">'+i+'</td>'+
		'<td>'+data[i].userId+'</td>'+
		'<td>'+data[i].userPassword+'</td>'+
		'<td>'+data[i].userNickname+'</td>'+
		'<td>'+data[i].userPictrue+'</td>'+
		'<td>'+data[i].userPermission+'</td>'+
		'<td>'+data[i].userIssign+'</td>'+
		'<td>'+data[i].userSigntime+'</td>'+
		'<td>'+
		'<div class="btn-group btn-group-xs">'+
		'<button class="btn btn-transparent eye"><i class="fa fa-eye"></i>'+
		'</button>'+
		'<button class="btn btn-transparent update"><i class="fa fa-pencil"></i>'+
		'</button>'+
		'<button class="btn btn-transparent delete"><i class="fa fa-times"></i>'+
		'</button>'+
		'</div>'+
		'</td>';
		 $("#tabletest").append('<tr>'+tr+'</tr>')
	}
	
	//点击修改按钮
	$('.btn.btn-transparent.update').click(function(){
		$('.theme-popover-mask').fadeIn(100);
		$('.theme-popover').slideDown(200);
		/*$(this).next().slideDown(200);*///为什么这里取又是next
		
		
		//设置信息到控件上面 
		var i=$(this).parents("tr").find(".td.id").text(); 
		 $(".ipt.userid").val(data[i].userId);
		 $(".ipt.password").val(data[i].userPassword);
		 $(".ipt.nickname").val(data[i].userNickname);
		 $(".ipt.pictrue").val(data[i].userPictrue);
		 $(".ipt.permission").val(data[i].userPermission);
		 $(".ipt.issign").val(data[i].userIssign);
		 $(".ipt.signtime").val(data[i].userSigntime);
	})
	
	//提交修改信息
	$('.btn.btn-primary.submit').click(function(){
		var mSerialize=$('.theme-signin.upform').serializeArray();
		var json={};
		for (var i in mSerialize){
			json[mSerialize[i].name]=mSerialize[i]['value'];
		}
		alert(JSON.stringify(json));
		$.ajax({
			type:'POST',
			url:'admin/update',
			contentType:'application/json;charset=UTF-8',
			data:JSON.stringify(json),
			success:function(data,status){
			    if (status=="success"){
			    	alert("修改成功");
			    	} 
			  }	
		});
	})
	
	//点击关闭
	$('.theme-poptit .close').click(function(){
		$('.theme-popover-mask').fadeOut(100);
		$('.theme-popover').slideUp(200);
		//$(this).parent().next().slideUp(200);
	})
	
	
});
});
