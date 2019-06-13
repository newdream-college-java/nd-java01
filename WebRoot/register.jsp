<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

<meta charset="utf-8" />

<title>用户注册-全国汽车票预订平台_长途汽车线路时刻表_汽车票查询_</title>
<link href="" type="image/x-icon" />
<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
<meta name="description"
	content="12308是中国道路运输协会与全国站场工委合作共建平台，提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:400-6841-110." />
<link rel="stylesheet" href="Css/loginbase.css">
<link rel="stylesheet" href="Css/login.css">
<link rel="stylesheet" href="Css/validate.css">
<script src="Scripts/jquery.js"></script>
<script src="Scripts/newreg.js"></script>
</head>
<body class="reg_body">

	<div class="header nobg">

		<div class="header-container">

			<div class="logo">

				<a href="index.jsp">12308首页</a>

			</div>

			<div class="navigation color3">
				<a href="javascript:void(0)" target="_blank"> 客服中心</a>
			</div>

		</div>

	</div>

	<!--中间部份-->

	<div class="content">

		<div class="content-container">

			<div class="content-header">
				<h2>注册新会员</h2>
				<p>
					已有12308帐号，<a href="login.jsp" target="_blank">直接登录</a>
				</p>
			</div>



			<!--ul class="signup_header clearfix">

     	<li class="current"><a><i></i>用手机注册</a></li>

		<li><a href="/register/registerByMail.sc"><i></i>用邮箱注册</a></li>  

        </ul-->


			
				<!--用手机注册--->

				<div class="signup_box">

					<form method="post" id="formPublic" action="registerServlet" onsubmit="return verify();">

						<div class="pub-form reg-form">

							<div class="fm-li pbot-5">

								<span class="fm-label"><label for="txt_userName">手机号码:</label></span>

								<input type="text" value="" name="phone" id="txt_Phone" onfocus="phone_focus();"
									class="i-input w240">

								<div class="msg-info" id="msg_phone">

									<div class="msg-weak msg-attention" id="msg_phone_div">
										<i></i> <label id="msg_phone_div_l" class="valid" style="display: inline-block">友情提示：请输入您的手机号码</label>

									</div>

								</div>

							</div>



							<div class="fm-li">

								<span class="fm-label"><label for="txt_password1">登录密码:</label></span>

								<input type="password" value="" name="txt_password1"
									id="txt_password1" class="i-input w240" onfocus="pwd_focus();">

								<!--<div class="qiangdu"><span id="one" class="strong strong1">弱</span><span id="two" class="strong strong2">中</span><span id="three" class="strong strong3">强</span></div>-->

								<div class="qiangdu">

									<span class="strong strong1" id="one">弱</span><span
										class="strong strong2" id="two">中</span><span
										class="strong strong3" id="three">强</span>

								</div>

								<div id="txt_password1Tip" class="msg-info">

									<div class="msg-weak msg-attention" id="msg_pwd">
										<i></i> <label id="msg_pwd_l" class="valid" style="display: inline-block">友情提示：请输入大于6位数字和字母</label>

									</div>

								</div>

							</div>

							<div class="fm-li pbot-5">

								<span class="fm-label"><label for="txt_password2">确认密码:</label></span>

								<input type="password" value="" name="txt_password2"
									id="txt_password2" class="i-input w240" onfocus="re_pwd_focus();">

								<div id="txt_password2Tip" class="msg-info">

									<div class="msg-weak msg-attention" id="msg_re_pwd">
										<i></i> <label id="re_msg_pwd_l" class="valid" style="display: inline-block">提示：请再次输入您的账户密码</label>

									</div>

								</div>

							</div>



							<div class="fm-li pbot-5">

								<span class="fm-label"><label for="txt_input6">验证码</label></span>

								<div class="dinbl">

									<input type="text" value="" name="handverifyCode"
										id="handverifyCode" class="i-input w80 left" onfocus="handverifyCode_focus();"> <img
										style="margin-left: 10px;" id="randomImg"
										src="Picture/96c052412c86488b97fb89f409d97b4a.gif" /> <span
										style="cursor: pointer; color: #317ee7; margin-left: 10px;"
										id="changePage" onclick="changeImg()">看不清，换一组</span>



								</div>

								<div class="msg-info">

									<div id="handverifyCodeTip" class="msg-weak msg-attention">
										<i></i> <label id="handverifyCodeTip_l" class="valid">提示：请输入内容</label>

									</div>

								</div>

							</div>



							<!--div class="fm-li pbot-5">

          <span class="fm-label"><label for="txt_input6">短信校验码：</label></span>

             <div class="dinbl"><input type="text" value="" name="verifyCode" id="verifyCode" class="i-input w80 left"><input type="button" class="hqyzm_btn" id="sendCodeBtn" value="免费获取验证码"></div>

        </div-->



							<div class="fm-li">

								<span class="fm-label"><label for="txt_input6"></label> </span>

								<p class="lo_p padbot15">

									<label for="remeber_me"><input type="checkbox"
										checked="true" id="remeber_me" name="remeber_me"
										class="lo_check"><span><a
											href="javascript:void(0);" class="tsl c666"
											id="agreement-content1">我已看过并同意<b>《12308服务条款》</b></a> </span></label>

								</p>

								<div style="display: block;" id="showContent"
									class="agreement-content agreement-content1">

									<p>

										12308网用户注册协议 <br>1.确认与接纳 <br>用户在使用12308提供的各项服务的同时，即意味着承诺接受与此项服务相关的规则。12308有权根据需要不定时地制定、修改本协议或各类规则，如本协

										议有任何变更，12308将在网站上刊载公告，通知用户。如用户不同意相关变更，必须停止使用12308。经修订的协议一经在12308公布后，立即自动

										生效。各类规则会在发布后生效，亦成为本协议的一部分。您登录或继续使用12308将表示您接受经修订的"协议"。除另行明确声明外，任何使"服务"范围

										扩大或功能增强的新内容均受本协议约束。除非经12308同意与个别用户另行签订书面协议以外，本协议将不在任何情况下因用户的要求而作出变更。

										请用户务必在注册之前认真阅读全部服务协议内容，如有任何疑问，可向12308咨询。用户通过注册程序阅读本服务条款并点击"同意"或"接受"按钮即完成

										注册，或以任何行为实际使用、享受12308的服务，即表示用户与12308已达成协议，自愿接受本协议的所有内容。如用户不同意本协议的条件，则不能使

										用12308的服务以及注册成为12308用户。 <br>2.服务保护条款 <br>12308服务仅供能够根据相关法律订立具有法律约束力合约的自然人或公司使用。因此，用户应为具备完全民事行为能力的自然人或合法存续的公司。用户违反本项条件，12308可随时拒绝向其提供服务，若因此给12308或第三方造成损失，用户承担全部赔偿责任。

										<br>3.价格保护条款 <br>您因进行交易，向12308获取有偿服务而发生的所有应纳税赋，以及一切硬件、软件、服务及其他方面的费用均由您负责支付。

										<br>4．用户注册 <br>1、注册 <br>考虑到12308用户服务的重要性，您同意在注册时提供真实、完整及准确的个人资料，并及时更新。

										如您提供的资料不准确，或12308有合理的理由认为该资料不真实、不完整、不准确，12308有权暂停或终止您的注册身份，并拒绝您使用本网站的服务。

										<br>2、用户隐私保护 <br>注册时，请您选择填写用户名和密码，并按页面提示提交相关信息。您对用户名和密码有保密的义务，并对该用户名和密码下发生的所有活动承担责任。

										<br>您同意： <br>如发现任何人未经授权使用您的会员注册名或密码，或发生违反保密规定的任何其他情况，您应当立即通知12308。

										<br>确保您在每个上网时段结束时，以正确步骤离开网站。12308不能也不会对您因未能遵守本款规定而发生的任何损失负责。

										<br>同时，尊重用户的隐私是12308的基本政策，因此，12308承诺不会向任何第三方披露、转让、出租或者出售交易用户名单、交易记录

										等涉及消费者个人信息的数据以及用户保存在12308各项服务中的非公开内容。除因法律法规的要求或政府部门的行政行为或司法机关的司法行为以外，"12308

										网"将不在任何情况下违反上述承诺。 <br>5.交易系统 <br>1、系统完整性。 <br>您同意，您不得使用任何装置、软件或程序干预或试图干预12308网站的正常运作或正在12308网站上进行的任何交易。您不得采取任何将不合理或不合比例的庞大负载加诸12308网络结构的行为。

										<br>2、不作商业性利用。 <br>您同意，您不得对任何资料作商业性利用，但是在经12308授权事先书面批准的情况下复制在12308网站上展示的任何资料除外。

										<br>6.终止或访问限制 <br>您同意12308可自行全权决定以任何理由

										(包括但不限于12308认为您已违反本协议的条款和精神，或以不符合本协议的条款和精神的方式行事) 终止您的服务密码、帐户

										(或其任何部份)

										或您对12308的使用，并删除您在使用12308中提交的"个人信息"。12308同时可自行全权决定，随时停止提供服务或其任何部份。

										<br>7.违约责任承担 <br>在不限制其他补救措施的前提下，发生下述任一情况，12308可暂时中止或永久终止您的会员资格，删除您的任何现有个人信息，以及您在网站上展示的任何其他资料：

										<br>（1）您违反本协议 <br>（2）12308无法核实或鉴定您向12308提供的任何资料 <br>（3）12308相信您的行为可能会使您、12308用户或通过12308提供服务的服务供应商发生任何法律责任。在不限制任何其他补救措施的前提下，12308可暂停或终止您的帐户。

										<br>8.服务"按现状"提供。 <br>12308会尽一切努力使您在使用12308的过程中得到良好的服务。遗憾的是，12308不能随时预见到任何技术上的问题或其他困难。该等困难可能会导

										致数据损失或其他服务中断。为此，您明确理解和同意，您使用12308的风险由您自行承担。12308以"按现状"和"按可得到"的基础提供。12308

										明确声明不作出任何种类的所有明示或暗示的保证。 赔偿 <br>您同意，因您违反本协议或经在此提及而纳入本协议的其他文件，或因您违反了法律或侵害了第三方的权利，而使第三方对12308及其子公

										司、分公司、董事、职员、代理人提出索赔要求，您必须赔偿12308及其子公司、分公司、董事、职员、代理人因此而发生的损失（包括司法费用和其他专业人

										士的费用）。 <br>10.无代理关系 <br>您与12308仅为独立订约人关系。本协议无意结成或创设任何代理、合伙、合营、雇用与被雇用或特许权授予与被授予关系。

										<br>11.链接 <br>12308或第三者均可提供与其他万维网网站或资源的链接。由于12308并不控制该等网站和资源，您承认并同意，12308并不对该

										等外在网站或资源的可用性负责，且不认可该等网站或资源上或可从该等网站或资源获取的任何内容、宣传、产品、服务或其他材料，也不对其负责或承担任何责

										任。您进一步承认和同意，对于任何因使用或信赖从此类网站或资源上获取的此类内容、宣传、产品、服务或其他材料而造成（或声称造成）的任何直接或间接损

										失，12308均不承担责任。 <br>12.通知 <br>除非另有明确规定，任何通知应以电子邮件形式发送，(就12308而言)

										电子邮件地址为 lyc@12308.com或 (就您而言)

										发送到您在登记过程中向12308提供的电子邮件地址，或有关方指明的该等其他地址。在电子邮件发出十二 (12)

										小时后，通知应被视为已送达。 <br>13.不可抗力 <br>对于因12308合理控制范围以外的原因，包括但不限於自然灾害、罢工或骚乱、暴动、战争行为、政府行为、通讯或其他设施故障或严重伤亡事故等，致使12308延迟或未能履约的，12308不对您承担任何责任。

										<br>14.转让 <br>12308转让本协议无需经您同意。 <br>15.其他规定 <br>本协议构成您和12308之间的全部协议，规定了您对12308的使用，并取代您和12308先前订立的任何书面或口头协议。本协议各

										方面应受中华人民共和国法律的管辖。倘若本协议任何条款或规定被裁定为无效或不可强制执行，并不影响其余条款和规定的效力，其余条款和规定仍应执行。条款

										标题仅为方便参阅而设，并不以任何方式界定、限制、解释或描述该条款的范围或限度。12308未就您或其他人士的某项违约行为采取行动，并不表明"12308

										网"撤回就任何继后或类似的违约事件采取行动的权利。 <br>16.争议解决 <br>因本协议或12308服务所引起或与其有关的任何争议应提交12308办公地点所在地的人民法院进行诉讼。



									</p>

								</div>

							</div>

							<div class="fm-li">

								<span class="fm-label"><label for="txt_input6"></label></span>

								<!--input type="submit" name="" value="同意协议并注册" class="btnagree" id="btn_submit"/-->

								<input type="submit" value="同意协议并注册"
									style="background: url(Images/login.png) no-repeat 0px -240px; width: 242px; height: 35px; color: white; font-size: 15px;" />

							</div>
					</form>


				</div>


			<div class="regist-right">

				<h2>注册遇到的问题</h2>

				<p>
					<b>1.为什么系统提示我的手机号已被使用？</b><br /> 答：出现此系统提示，表示您已经注册过，建议您直接登录。

				</p>

				<p>
					<b>2.为什么要验证手机号？</b><br /> 答：验证您的手机号能够更好的保障您的购票权益。



				</p>

				<p>
					<b>3.注册手机无法获取到验证码</b><br /> 答：无法获取的验证码，可以偿试切换成邮箱注册。

				</p>



			</div>

		</div>

		<!--/用手机注册--->



	</div>

</div>

	<div class="footer">

		<div class="footer-container">

			<div class="copyrights">Copyright © 2010-2013 12308.com，All
				Rights Reserved粤ICP备14020827号</div>

		</div>

	</div>

</body>
</html>