function changeImg() {
	$("#randomImg").attr("src", "/randomKey?t=" + Math.random())
}
$(document)
		.ready(
				function() {
					getCookie("hsendc");
					function s() {
						var x = $.trim($("#handverifyCode").val());
						if (x.length == 0) {
							alert("验证码不能为空!");
							return false
						}
						return true
					}
					var n = $("#txt_Phone");
					var w = $("#txt_mail");
					var g = $("#msg_Phone");
					var j = $("#txt_password1");
					var d = $("#txt_password1Tip");
					var m = $("#txt_password2");
					var f = $("#txt_password2Tip");
					var u = $("#verifyCode");
					String.prototype.trim = function() {
						return this.replace(/^\s\s*/, "").replace(/\s\s*$/, "")
					};
					function v(x) {
						return /^(1+\d{10})$/.test(x)
					}
					function t(x) {
						return /^((([a-z]|\d|[!#\$%&\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))$/
								.test(x)
					}
					function o(x) {
						return /^[a-z0-9]{6,48}$/.test(x)
					}
					function q(x) {
						if (x >= 48 && x <= 57) {
							return 1
						}
						if (x >= 65 && x <= 90) {
							return 2
						}
						if (x >= 97 && x <= 122) {
							return 4
						} else {
							return 8
						}
					}
					function e(x) {
						modes = 0;
						for (i = 0; i < 4; i++) {
							if (x & 1) {
								modes++
							}
							x >>>= 1
						}
						return modes
					}
					function a(x) {
						if (x.length <= 4) {
							return 0
						}
						Modes = 0;
						for (i = 0; i < x.length; i++) {
							Modes |= q(x.charCodeAt(i))
						}
						return e(Modes)
					}
					function k(x, y) {
						O_color = "#ccc";
						L_color = "#FF9900";
						M_color = "#FF9900";
						H_color = "#ff9900";
						if (x == null || x == "") {
							Lcolor = Mcolor = Hcolor = O_color
						} else {
							S_level = a(x);
							switch (S_level) {
							case 0:
								Lcolor = Mcolor = Hcolor = O_color;
							case 1:
								Lcolor = L_color;
								Mcolor = Hcolor = O_color;
								break;
							case 2:
								Lcolor = Mcolor = M_color;
								Hcolor = O_color;
								break;
							default:
								Lcolor = Mcolor = Hcolor = H_color
							}
						}
						l("one").style.background = Lcolor;
						l("two").style.background = Mcolor;
						l("three").style.background = Hcolor;
						return
					}
					function p() {
						if (!o(j.val())) {
							d.show().find("label").html("请输入大于6位数字和字母");
							d.find("div").eq(0).attr("class",
									"msg-weak msg-error");
							j.css("border-color", "red");
							return true
						} else {
							d.show().find("label").html("请记住它");
							d.find("div").eq(0)
									.attr("class", "msg-weak msg-ok");
							j.css("border-color", "#d6d6d6");
							k(j.val(), "1");
							return true
						}
					}
					function b() {
						if (!v(n.val())) {
							g.find("label").html("请输入您正确的手机号码");
							g.show().find("div").eq(0).attr("class",
									"msg-weak msg-error");
							g.show();
							n.css("border-color", "red");
							g.attr("isSubmit", "0");
							return false
						} else {
							var x = false;
							$
									.ajax({
										type : "POST",
										dataType : "json",
										async : false,
										url : "../register/checkMobilePhone.sc?mobilePhone="
												+ n.val().trim(),
										success : function(y) {
											if (parseInt(y) == 1) {
												g.find("label").html(
														"可以使用这个手机号码");
												g
														.show()
														.find("div")
														.eq(0)
														.attr("class",
																"msg-weak msg-ok");
												n
														.css("border-color",
																"#d6d6d6");
												x = true
											} else {
												g
														.find("label")
														.html(
																"该手机号码已经存在，马上&nbsp;<a style='color:#0081cc;' href='http://passport.12308.com/login'>登录</a>");
												g
														.show()
														.find("div")
														.eq(0)
														.attr("class",
																"msg-weak msg-error");
												n.css("border-color", "red");
												x = false
											}
										}
									});
							return x
						}
					}
					function h() {
						if (!t(w.val())) {
							g.find("label").html("请输入您正确的邮箱");
							g.show().find("div").eq(0).attr("class",
									"msg-weak msg-error");
							g.show();
							w.css("border-color", "red");
							g.attr("isSubmit", "0");
							return false
						} else {
							var x = false;
							$
									.ajax({
										type : "POST",
										dataType : "json",
										async : false,
										url : "../register/checkMail.sc?mail="
												+ w.val().trim(),
										success : function(y) {
											if (parseInt(y) == 1) {
												g.find("label")
														.html("可以使用这个邮箱");
												g
														.show()
														.find("div")
														.eq(0)
														.attr("class",
																"msg-weak msg-ok");
												w
														.css("border-color",
																"#d6d6d6");
												x = true
											} else {
												g
														.find("label")
														.html(
																"该邮箱已经存在，马上&nbsp;<a style='color:#0081cc;' href='http://passport.12308.com/login'>登录</a>");
												g
														.show()
														.find("div")
														.eq(0)
														.attr("class",
																"msg-weak msg-error");
												w.css("border-color", "red");
												x = false
											}
										}
									});
							return x
						}
					}
					function r() {
						if (m.val().length == 0 || j.val().length == 0
								|| m.val() != j.val()) {
							m.css("border-color", "red");
							f.show().find("label").html("两个密码不一致");
							f.find("div").eq(0).attr("class",
									"msg-weak msg-error");
							f.show();
							return false
						} else {
							f.show().find("label").html("确认密码正确");
							m.css("border-color", "#d6d6d6");
							f.find("div").eq(0)
									.attr("class", "msg-weak msg-ok");
							return true
						}
					}
					function c() {
						if (u.val().length == 0) {
							u.css("border-color", "red");
							return false
						} else {
							u.css("border-color", "#d6d6d6");
							return true
						}
					}
					var l = function(x) {
						return document.getElementById(x)
					};
					$(function() {
						n.blur(function() {
							b()
						});
						w.blur(function() {
							h()
						});
						j.bind("keyup blur", function() {
							p()
						});
						w.bind("focus", function() {
							g.find("label").html("提示:请输入邮箱");
							g.show().find("div").eq(0).attr("class",
									"msg-weak msg-attention");
							g.show();
							w.css("border-color", "#d6d6d6")
						});
						n.bind("focus", function() {
							g.find("label").html("提示:请输入手机号");
							g.show().find("div").eq(0).attr("class",
									"msg-weak msg-attention");
							g.show()
						});
						j.bind("focus", function() {
							d.find("label").html("提示:请输入密码");
							d.show().find("div").eq(0).attr("class",
									"msg-weak msg-attention");
							d.show();
							j.css("border-color", "#d6d6d6")
						});
						m.bind("focus", function() {
							f.find("label").html("提示:请再次输入密码");
							f.show().find("div").eq(0).attr("class",
									"msg-weak msg-attention");
							f.show();
							m.css("border-color", "#d6d6d6")
						});
						u.bind("focus", function() {
							u.css("border-color", "#d6d6d6")
						});
						u.blur(function() {
							c()
						});
						m.bind("keyup blur", function() {
							r()
						});
						var x = 180;
						function y(z) {
							setTimeout(function() {
								if (x > 0) {
									x = x - 1;
									z.val("倒计时:" + x);
									y(z)
								} else {
									x = 180;
									z.removeAttr("disabled");
									z.val("免费获取验证码")
								}
							}, 1000)
						}
						$("#sendCodeBtn")
								.click(
										function() {
											if (b() && s()) {
												$
														.ajax({
															type : "POST",
															dataType : "text",
															cache : false,
															async : false,
															url : "/verifyCode/sendCodemobile.sc?mobilePhone="
																	+ n.val()
																	+ "&authCode="
																	+ $(
																			"#handverifyCode")
																			.val(),
															success : function(
																	z) {
																var z = $
																		.parseJSON(z);
																if (!z.success) {
																	alert("提交失败:"
																			+ z.msg);
																	return
																} else {
																	$(this)
																			.attr(
																					"disabled",
																					"disabled");
																	$(
																			"#verifyCodeTip")
																			.show();
																	$(
																			"#sendCodeBtn")
																			.val(
																					"倒计时:"
																							+ x);
																	$(
																			"#sendCodeBtn")
																			.attr(
																					"disabled",
																					true);
																	var A = new Date()
																			.getTime();
																	SetCookie(
																			"hsendc",
																			n
																					.val()
																					+ "_"
																					+ j
																							.val()
																					+ "_"
																					+ m
																							.val()
																					+ "_"
																					+ $(
																							"#handverifyCode")
																							.val()
																					+ "_"
																					+ A);
																	y($("#sendCodeBtn"))
																}
															}
														})
											}
										});
						$("#sendMailCodeBtn")
								.click(
										function() {
											$(this)
													.attr("disabled",
															"disabled");
											if (h()) {
												$
														.ajax({
															type : "POST",
															dataType : "text",
															cache : false,
															url : "/verifyCode/sendCodeByMail.sc?mail="
																	+ w.val(),
															success : function(
																	z) {
															}
														});
												$("#verifyCodeTip").show();
												$("#sendMailCodeBtn").val(
														"倒计时:" + x);
												y($("#sendMailCodeBtn"))
											}
										});
						$("#btn_Mailsubmit")
								.click(
										function() {
											var z = $("#remeber_me").prop(
													"checked");
											if (h() && p() && r() && c() && z) {
												$
														.ajax({
															type : "POST",
															dataType : "json",
															url : "../register/submitByMail.sc?mail="
																	+ w
																			.val()
																			.trim()
																	+ "&password="
																	+ j.val()
																	+ "&verifyCode="
																	+ $(
																			"#verifyCode")
																			.val()
																	+ "&source=mySelf",
															success : function(
																	A) {
																if (A != undefined
																		&& A.success == true) {
																	window.location.href = "../register/registerSuccess.sc?userName="
																			+ w
																					.val()
																					.trim()
																} else {
																	alert("注册失败! "
																			+ A.msg)
																}
															}
														})
											}
										});
						$("#btn_submit")
								.click(
										function() {
											var z = $("#remeber_me").prop(
													"checked");
											if (b() && p() && r() && c() && z) {
												$(this).attr("disabled",
														"disabled");
												$
														.ajax({
															type : "POST",
															dataType : "json",
															url : "../register/submitByMobile.sc?mobilePhone="
																	+ n
																			.val()
																			.trim()
																	+ "&password="
																	+ j.val()
																	+ "&verifyCode="
																	+ $(
																			"#verifyCode")
																			.val()
																	+ "&source=mySelf",
															success : function(
																	A) {
																if (A != undefined
																		&& A.success == true) {
																	window.location.href = "../register/registerSuccess.sc?userName="
																			+ n
																					.val()
																					.trim()
																} else {
																	alert("注册失败! "
																			+ A.msg)
																}
																$("#btn_submit")
																		.attr(
																				"disabled",
																				false)
															}
														})
											}
										});
						$("#agreement-content1")
								.click(
										function() {
											var z = $("#showContent").css(
													"display") == "none" ? "block"
													: "none";
											$("#showContent").css("display", z)
										})
					})
				});
function SetCookie(a, c) {
	var b = 30;
	var d = new Date();
	d.setTime(d.getTime() + 60 * 3000);
	document.cookie = a + "=" + escape(c) + ";expires=" + d.toGMTString()
}
function getCookie(c) {
	var h = document.cookie.split("; ");
	for ( var b = 0; b < h.length; b++) {
		var j = h[b].split("=");
		if (j[0] == c) {
			$("#sendCodeBtn").attr("disabled", true);
			var g = unescape(j[1]);
			$("#txt_Phone").val(g.split("_")[0]);
			$("#txt_password1").val(g.split("_")[1]);
			$("#txt_password2").val(g.split("_")[2]);
			$("#handverifyCode").val(g.split("_")[3]);
			var k = g.split("_")[4];
			var e = new Date().getTime();
			var f = (e - k) / 1000;
			var a = 180 - Math.ceil(f);
			getCode($("#sendCodeBtn"), a);
			return unescape(j[1])
		}
	}
}
function getCode(b, a) {
	setTimeout(function() {
		if (a > 0) {
			a = a - 1;
			b.val("倒计时:" + a);
			getCode(b, a)
		} else {
			a = 180;
			b.removeAttr("disabled");
			b.val("免费获取验证码")
		}
	}, 1000)
};