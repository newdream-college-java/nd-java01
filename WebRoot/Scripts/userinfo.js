$(document).ready(
		function() {
			$('#sendCodeBtn').removeAttr("disabled");
			$('#sendCodeBtn').attr('class','hqyzm_btn color1'); 
			
			$("#divNickname_fy").click(function() {
				if($("#divNickname_fy").text()=='修改'){
					$("#divNickname_fy").text("取消");
				}else{
					$("#divNickname_fy").text("修改");
				}
				$("#divNickname").toggle();
				$("#divChangeNickname").toggle();

			});
			$("#divMobile_fy").click(function() {
				if($("#divMobile_fy").text()=='修改'){
					$("#divMobile_fy").text("取消");
				}else{
					$("#divMobile_fy").text("修改");
				}
				$("#divMobile").toggle();
				$("#divChangeMobile").toggle();
			});
			$("#divEmail_fy").click(function() {
				if($("#divEmail_fy").text()=='修改'){
					$("#divEmail_fy").text("取消");
				}else{
					$("#divEmail_fy").text("修改");
				}
				$("#divEmail").toggle();
				$("#divChangeEmail").toggle();
			});
			$("#cancNickname").click(function() {
				if($("#divNickname_fy").text()=='修改'){
					$("#divNickname_fy").text("取消");
				}else{
					$("#divNickname_fy").text("修改");
				}
				$("#divNickname").toggle();
				$("#divChangeNickname").toggle();
			});
			$("#cancMobile").click(function() {
				if($("#divMobile_fy").text()=='修改'){
					$("#divMobile_fy").text("取消");
				}else{
					$("#divMobile_fy").text("修改");
				}
				$("#mobilePhone").val($("#mobilePhoneCheck").val());
				$("#divMobile").toggle();
				$("#divChangeMobile").toggle();
			});
			$("#cancEmail").click(function() {
				if($("#divEmail_fy").text()=='修改'){
					$("#divEmail_fy").text("取消");
				}else{
					$("#divEmail_fy").text("修改");
				}
				$("#mail").val($("#mailCheck").val());
				$("#divEmail").toggle();
				$("#divChangeEmail").toggle();
			});

			var options = {
				type : "post",
				contentType : "application/x-www-form-urlencoded;charset=utf-8", //重要是这个定义字符编码
				url : "/user/update.sc?time=" + (new Date()).getTime(),
				success : function(responseText, statusText) {
					var result = $.parseJSON(responseText);
					if (result.success) {
						alert("修改成功");
						location.reload();
					} else {
						alert("修改失败:" + result.msg);
					}
				}
			};

			// bind to the form1's submit event
			$('#form1').submit(function() {
				$(this).ajaxSubmit(options);
				return false;
			});
			
			// bind to the form2's submit event
			$('#form2').submit(function() {
				$(this).ajaxSubmit(options);
				return false;
			});
			
			// bind to the form3's submit event
			$('#form3').submit(function() {
				$(this).ajaxSubmit(options);
				return false;
			});

			$("#submit1").click(function() {
				var year = $("#birth_year").find("option:selected").text();
				var month = $("#birth_month").find("option:selected").text();
				var day = $("#birth_day").find("option:selected").text();
				var birthday = year + '-' + month + '-' + day;
				$("#birthday").val(birthday);
				$("#gender").val($('input[name="gender"]:checked').val());
				$("#form1").submit();
			});

			$("#submit2").click(function() {
				if ($("#form2").valid())
					$("#form2").submit();
			});

			$("#submit3").click(function() {
				if($("#mail").val() != '' && $("#mailCheck").val() == $("#mail").val()){
					$("#form3").submit();
				}else{
					if ($("#form3").valid()){
						$("#form3").submit();
					}
				}
			});

			$("#form2").validate({
				onkeyup : false,
				onsubmit : false,
				rules : {
					mobilePhone : {
						required : true,
						isMobile : true
					},
					verifyCode : {
						required : true
					}
				},
				messages : {
					mobilePhone : {
						required : "请输入绑定手机号码"
					},
					verifyCode : {
						required : "请输入手机验证码"
					}
				}
			});	
			
			
			$("#form3").validate({
				onkeyup : false,
				onsubmit : false,
				rules : {
					mail : {
						required : true,
						email : true,
						remote : {// 验证邮箱是否存在
							type : "POST",
							url : "/register/checkMailValidate.sc", // 验证ajax提交页--只许返回true或false
							data : {
								mail : function() {
									return $("#mail").val();
								}
							}
						}
					}
				},
				messages : {
					mail : {
						required : "请输入绑定邮箱",
						email : "绑定邮箱地址格式不正确",
						remote  :  "邮箱已存在"
					}
				}
			});			
			
			// 发送短信验证码
			$('#sendCodeBtn').click(
					function() {
						if($("#mobilePhone").val()==""){
							alert("手机号码不能为空");
							return false;
						}
						
						$('#sendCodeBtn').attr("disabled", true);
						$('#sendCodeBtn').attr('class','hqyzm_btn color1 disable'); 
						timeBtn($('#sendCodeBtn'),"免费获取验证码",60);
						jQuery.ajax({
							type : "POST",
							dataType : "text",
							cache : false,
							url : "/verifyCode/sendCodemobileBind.sc?mobilePhone="
									+ $("#mobilePhone").val(),
							success : function(msg) {
								var result = $.parseJSON(msg);
								if (result.success) {
									alert("发送成功请注意查看短信");
								} else {
									alert("发送失败:" + result.msg);
								}
							}
						});
						
					});
			
		});
