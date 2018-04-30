$(document).ready(function(){
	
$.get("admin/getchecks",function(data,status){
	var i;
	for (i in data){
		var tr=
		'<td>'+data[i].id+'</td>'+
		'<td>'+data[i].checkId+'</td>'+
		'<td>'+data[i].checkGrade+'</td>'+
		'<td>'+data[i].checkTime+'</td>'+
		'<td>'+data[i].checkType+'</td>'+
		'<td>'+data[i].studentId+'</td>'+
		'<td>'+data[i].checkMdormitory+'</td>'+
		'<td>'+data[i].checkNdormitory+'</td>'+
		'<td>'+data[i].checkMlesson+'</td>'+
		'<td>'+data[i].checkZlesson+'</td>'+
		'<td>'+data[i].checkNlesson+'</td>'+
		'<td>'+data[i].checkMajor+'</td>'+
		'<td>'+data[i].className+'</td>'+
		'<td>'+data[i].studentName+'</td>'+
		'<td>'+
		'<div class="btn-group btn-group-xs">'+
		'<button class="btn btn-transparent"><i class="fa fa-eye"></i>'+
		'</button>'+
		'<button class="btn btn-transparent"><i class="fa fa-pencil"></i>'+
		'</button>'+
		'<button class="btn btn-transparent"><i class="fa fa-times"></i>'+
		'</button>'+
		'</div>'+
		'</td>';
		 $("#tabletest").append('<tr>'+tr+'</tr>')
	}
});
});