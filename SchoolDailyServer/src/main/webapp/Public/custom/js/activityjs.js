$(document).ready(function(){
	
$.get("admin/getactivitys",function(data,status){
	var i;
	for (i in data){
		var tr=
		'<td>'+data[i].id+'</td>'+
		'<td>'+data[i].activityId+'</td>'+
		'<td>'+data[i].activityTitle+'</td>'+
		'<td>'+data[i].activityContent+'</td>'+
		'<td>'+data[i].activityTime+'</td>'+
		'<td>'+data[i].activityCreater+'</td>'+
		'<td>'+data[i].studentId+'</td>'+
		'<td>'+data[i].activityState+'</td>'+
		'<td>'+data[i].activityData+'</td>'+
		'<td>'+data[i].activityPlace+'</td>'+
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