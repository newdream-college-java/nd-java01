/*
 * jQuery validation 
 * 扩展的验证类型：用户名，邮政编码，大陆身份证号码，大陆手机号码,电话号码 
 * 邮政编码验证
 * Authoer:Kalven  Date:2012-01-15    
 */
 //直接用正则表达式做验证处理
 $.validator.addMethod("reGex",function(value, element, params){
            var expobj = new RegExp(params);//实例化正则对象，参数为传入的正则表达式
            return expobj.test(value);   
  },"验证正则表达式有误");

//验证邮编地址 
$.validator.addMethod("isZipCode",function(value, element) {    
  var zip = /^[0-9]{6}$/;    
  return this.optional(element) || (zip.test(value));
}, "邮政编码输入有误，请输入6位数字");

//短信校验码 
$.validator.addMethod("isMsgCode", function(value, element) {
    var zip = /^[0-9]{6}$/;
    return this.optional(element) || (zip.test(value));
}, "短信校验码输入有误");

//登录密码
$.validator.addMethod("isPwd", function(value, element) {
    var length = value.length;
    return this.optional(element) || (length >= 6 && length <= 20 && (/^\D+\d$/.test(value) || /^[^a-zA-Z]+[a-zA-Z]$/.test(value) || /^\w+\W$/.test(value)));
}, "6-20个字符，请使用字母、数字或符号组合，不能单独使用字母、数字或符号");
    
// 身份证号码验证
$.validator.addMethod("isIdCardNo", function(value, element){
  return this.optional(element) || /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/.test(value)||/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])((\d{4})|\d{3}[X])$/.test(value);
}, "请输入正确的身份证号码！居民身份证号码为15或18位");

// 手机号码验证    
$.validator.addMethod("isMobile", function(value, element) {    
  var length = value.length;
  var mobile=/^(1+\d{10})$/;
  return this.optional(element) || (mobile.test(value));
}, "格式不正确，手机号码为11位数字");

// 电话号码验证    
$.validator.addMethod("isPhone", function(value, element) {    
    var tel = /^(\d{3,4}\)|\d{3,4}-|\s)?\d{8}$/;
  return this.optional(element) || (tel.test(value));    
}, "请正确填写您的电话号码")

// 用户名字符验证
$.validator.addMethod("userName", function(value, element) {
    return this.optional(element) || /^[\u0391-\uFFE5\w]{4,20}$/.test(value);
}, "4-20个字符，可由中英文、数字组成。设置成功后不可更改");

// 真实姓名验证
$.validator.addMethod("realName", function(value, element) {
    return this.optional(element) || /^([\u4e00-\u9fa5]|[a-zA-Z]){2,}$/.test(value);
}, "请输入至少两位中文或字母");

// 联系电话(手机/电话皆可)验证   
$.validator.addMethod("isTel", function(value,element) {   
    var length = value.length;   
    var mobile=/^(1+\d{10})$/;
    var tel = /^\d{3,4}-?\d{7,9}$/;   
    return this.optional(element) || (tel.test(value) || mobile.test(value));   
}, "请正确填写您的联系电话");  

// QQ号码验证 
$.validator.addMethod("qq", function(value, element) { 
var tel = /^[1-9]\d{4,9}$/; 
return this.optional(element) || (tel.test(value)); 
}, "qq号码格式错误"); 

// IP地址验证 
$.validator.addMethod("ip", function(value, element) { 
var ip = /^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/; 
return this.optional(element) || (ip.test(value) && (RegExp.$1 < 256 && RegExp.$2 < 256 && RegExp.$3 < 256 && RegExp.$4 < 256)); 
}, "Ip地址格式错误"); 

// 字母和数字的验证 
$.validator.addMethod("chrnum", function(value, element) { 
var chrnum = /^([a-zA-Z0-9]+)$/; 
return this.optional(element) || (chrnum.test(value)); 
}, "只能输入数字和字母(字符A-Z, a-z, 0-9)"); 

// 中文的验证 
$.validator.addMethod("chinese", function(value, element) { 
var chinese = /^[\u4e00-\u9fa5]+$/; 
return this.optional(element) || (chinese.test(value)); 
}, "只能输入中文"); 

// 下拉框验证 
$.validator.addMethod("selectNone", function(value, element){ 
return value == "请选择"; 
 },"必须选择一项"); 

// 字节长度验证 
$.validator.addMethod("byteRangeLength", function(value, element, param)
{ 
  var length = value.length; 
	for (var i = 0; i < value.length; i++){ 
	 if (value.charCodeAt(i) > 127){length++;} 
	} 
   return this.optional(element) || (length >= param[0] && length <= param[1]); 
},$.validator.format("请确保输入的值在{0}-{1}个字节之间(一个中文字算2个字节)")); 


// 字符最小长度验证（一个中文字符长度为2）
$.validator.addMethod("strMinLength", function(value, element, param) {
	var length = value.length;
		for ( var i = 0; i < value.length; i++){
			if (value.charCodeAt(i) > 127) {
			length++;
		}
	}
return this.optional(element) || (length >= param);
}, $.validator.format("字符长度不能小于{0}"));


// 字符最大长度验证（一个中文字符长度为2）
$.validator.addMethod("strMaxLength", function(value, element, param) {
		var length = value.length;
		for ( var i = 0; i < value.length; i++) {
			if (value.charCodeAt(i) > 127) {
			length++;
		}
	}
	return this.optional(element) || (length <= param);
}, $.validator.format("字符长度不能大于{0}"));

// 两者必填一项
$.validator.addMethod("oneHasValue", function(value, element, param) {
    var flag = false;
    var $input = $(param);
    var nextValue = $input.val();
    if (value.length > 0 || nextValue.length > 0) {
        flag = true;
        if (value.length > 0 && nextValue.length == 0) {
            if ($input.hasClass("i-error")) {
                $input.removeClass("i-error");
                var $tip = $(param + "Tip");
                $tip.removeClass("msg-error");
                $tip.children(".i-error").remove();
            }
        } 
    }
    return flag;
}, "两者必填一项");

// 两者不相等
$.validator.addMethod("isInequality", function(value, element, param) {
    return this.optional(element) || $(param).val() != value;
}, "两者不相等");

// 两者不相等
$.validator.addMethod("isInequalityExt", function (value, element, param) {
    return this.optional(element) || $(param).val() != value;
}, "两者不相等");

//直接用正则表达式验证输入不能为为纯数字 
$.validator.addMethod("rgIsNumber",function(value, element)
{    
  var rgIsNumber = /^\d+$/; 
  return this.optional(element) || (!rgIsNumber.test(value));
}, "字符串不能为纯数字");

//直接用正则表达式验证输入不能为纯字符
$.validator.addMethod("rgIsCap",function(value, element) {    
  var rgIsCap =/^[A-Za-z]+$/;  
  return this.optional(element) || (!rgIsCap.test(value));
}, "字符串不能为纯字母");

//直接用正则表达式验证输入不能为纯符号
$.validator.addMethod("rgIsSign",function(value, element) {    
  var rgIsSign =/^\W+$/;  
  return this.optional(element) || (!rgIsSign.test(value));
}, "只能为字母或数字和下划线");

//匹配下拉框是否选择有值 
$.validator.addMethod("selectNone", function(value, element){ 
    //alert(value == "请选择"||value == ""||value.toLowerCase()== "null");
	return this.optional(element)|| value!= "请选择"&&value!=""&&value.toLowerCase()!= "null"; 
 },"下拉菜单必须选择一项"); 

//验证密码
/*var pattern_d = /^\d+$/;          //全数字  
var pattern_s = /^[A-Za-z]+$/       //全字符  
var pattern_w = /^\w+$/;            //数字或者字符  
var pattern_W = /^\W+$/             //全非数字也非字符  
var pattern_r = /^\w+\W+[\w\W]*\w+$/    //以字母或者数字开头结尾的字符串 
$.validate的optional(element)，用于表单控件的值不为空时才触发验证
当element为空时this.optional(element)=true，用于在该控件为非必填项目时可以通过验证，及条件可以不填但是不能填错格式*/ 
