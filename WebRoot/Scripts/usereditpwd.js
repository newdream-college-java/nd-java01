$(document).ready(function() {
	//定义form
	var formValid = $("#form").validate({
		onkeyup : false,
		onsubmit : false,
		rules : {
			password : {
				required : true,
				minlength : 6,
				equalNo : "#oldPassword"
			},
			confirm_password : {
				required : true,
				equalTo : "#password"
			},
			oldPassword : {
				required : true,
				remote : {// 验证邮箱是否存在
					type : "GET",
					url : "/user/checkPwd.sc", // 验证ajax提交页--只许返回true或false
					data : {
						oldPassword : function() {
							return $("#oldPassword").val();
						}
					}
				}
			}
		},
		messages : {
			oldPassword : {
				required : "原密码不能为空",
				remote   :  "请输入正确密码"
			},
			password : {
				required : "新密码不能为空",
				minlength : "新密码不能小于6位字符",
				equalNo : "新密码不能与旧密码相同"
			},
			confirm_password : {
				required : "请再次输入您的账户密码",
				equalTo : "二次密码输入不一至"
			}
		}
	});

    var options = { 
    		type : "post",
    		url : "/user/editPwd.sc?time=" + (new Date()).getTime(),
            success:function(responseText, statusText){
				var result = $.parseJSON(responseText);
				if (result.success) {
					alert("修改成功:" + result.msg);
					window.location="/user/infoPage.html";
				} else {
					alert("修改失败:" + result.msg);
				}					
			} 
        }; 
	
    // bind to the form's submit event 
    $('#form').submit(function() { 
        $(this).ajaxSubmit(options); 
        return false; 
    }); 
	
	$("#btn_submit").click(function() {
		if (formValid.form()) {
			$("#form").submit();
		}
	});
	
	$("#btn_cancel").click(function() {
		$("oldPassword").val("");
		$("password").val("");
		$("confirm_password").val("");
	});
	//密码强弱验证
    $('#password')
		.keyup(
				function() {
					O_color = "#ccc";
					L_color = "#FF9900";
					M_color = "#FF9900";
					H_color = "#ff9900";
					var strongRegex = new RegExp(
							"^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).*$",
							"g");
					var mediumRegex = new RegExp(
							"^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$",
							"g");
					var enoughRegex = new RegExp(
							"(?=.{5,}).*", "g");
					if (false == enoughRegex.test($(this)
							.val())) {
						Mcolor = Hcolor = O_color;
						Lcolor = L_color;
					} else if (strongRegex.test($(this)
							.val())) {
						Lcolor = Mcolor = M_color;
						Hcolor = H_color;
					} else if (mediumRegex.test($(this)
							.val())) {
						Lcolor = Mcolor = M_color;
						Hcolor = O_color;
					} else {
						Mcolor = Hcolor = O_color;
						Lcolor = L_color;
					}
					$("#one").css("background-color",Lcolor);
					$("#two").css("background-color",Mcolor);
					$("#three").css("background-color",Hcolor);
					return true;
				});
});


