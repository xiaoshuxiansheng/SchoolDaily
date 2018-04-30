$(document).ready(function(){
	
$.get("admin/getstudents",function(data,status){
	var i;
	for (i in data){
		var tr=
		'<td class="td id">'+i+'</td>'+
		'<td>'+data[i].studentId+'</td>'+
		'<td>'+data[i].studentName+'</td>'+
		'<td>'+data[i].studentPhone+'</td>'+
		'<td>'+data[i].studentIdcard+'</td>'+
		'<td>'+data[i].studentIssign+'</td>'+
		'<td>'+data[i].studentSigntime+'</td>'+
		'<td>'+data[i].studentPictrue+'</td>'+
		'<td>'+data[i].studentKpl+'</td>'+
		'<td>'+data[i].studentVocate+'</td>'+
		'<td>'+data[i].studentClass+'</td>'+
		'<td>'+data[i].studentMajor+'</td>'+
		'<td>'+data[i].studentGrade+'</td>'+
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
		 $(".ipt.studentid").val(data[i].studentId);
		 $(".ipt.name").val(data[i].studentName);
		 $(".ipt.phone").val(data[i].studentPhone);
		 $(".ipt.idcard").val(data[i].studentIdcard);
		 $(".ipt.issign").val(data[i].studentIssign);
		 $(".ipt.signtime").val(data[i].studentSigntime);
		 $(".ipt.pictrue").val(data[i].studentPictrue);
		 $(".ipt.kpl").val(data[i].studentKpl);
		 $(".ipt.vocate").val(data[i].studentVocate);
		 $(".ipt.class").val(data[i].studentClass);
		 $(".ipt.major").val(data[i].studentMajor);
		 $(".ipt.grade").val(data[i].studentGrade);
	})
	
	//提交修改信息
	//{"studentid":"14790106","name":"大明","phone":"17674352451","idcard":"4331221995042222341121","issign":"0",
	//"signtime":"0","pictrue":"","kpl":"99","vocate":"0","class":"二班","major":"计算机科学与技术","grade":"2015级","submit":"提交 "}
	$('.btn.btn-primary.submit').click(function(){
		var mSerialize=$('.theme-signin.upform').serializeArray();
		var json={};
		for (var i in mSerialize){
			json[mSerialize[i].name]=mSerialize[i]['value'];
		}
		alert(JSON.stringify(json));
		$.ajax({
			type:'POST',
			url:'admin/updatestudent',
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