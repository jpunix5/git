//row insert
function userCreate(tableName) {
	var user = $("#Insert_Form").serialize();
	
	console.log("1111111");
	console.log(user);	
	
//	if('test_users' == tableName){
//		urladd = "/ajaxwrite.do";
//	}else if('test_board' == tableName){
//		urladd = "/ajaxwriteboard.do";
//	};
	
	$.ajax({
		type: "GET",
		url: "/ajaxInsert",
//		url: urladd,
		data : user,
		datatype : json,
		success: function () {
			
		}
		
	});
};