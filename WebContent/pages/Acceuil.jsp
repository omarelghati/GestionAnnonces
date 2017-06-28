<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE HTML>
<html>
<head>
<title>MyDeal</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css'>
<link href="css/slider.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
<script type="text/javascript">
	$(window).load(function() {
		$('#slider').nivoSlider();
	});
</script>
</head>
<body>
	<!------ Header ------------>
	<div class="wrap-box"></div>
	<div class="header">
		<div class="header-top">
			<div class="wrap">
				<div class="right-left">
					<ul>
					<%if(session!=null)
						session.invalidate();%>
						<form method="post" name="login" id="login-form" action="logini.do">
							<fieldset class="input">
								<div  id="login-form-username" style="display: inline-block">
									<html:errors property="lemail" />
								</div>
								<div id="login-form-username" style="display: inline-block">
									<label for="modlgn_username">Email (Login)</label> <input
										id="modlgn_username" type="text" name="email" class="inputbox"
										size="18">
								</div>
								<div id="login-form-password" style="display: inline-block">
									<label for="modlgn_passwd">Password</label> <input
										id="modlgn_passwd" type="password" name="password"
										class="inputbox" size="18" >
								</div>
								<input type="submit" name="Submit" class="button" value="Login">
							</fieldset>
						</form>

					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="header-bottom">
			<div class="wrap">
				<div class="top-nav">
					<ul>
						<li class="active"><a href="Acceuil.jsp">All Ads</a></li>
						<li><a href="Deposer_annonce.jsp">Post your Ad</a></li>
						<li><a href="Modifier_annonce.jsp">Delete Ad</a></li>
						<li><a href="Inscription.jsp">Sign up</a></li>
						<li><a href="contact.jsp">Contact us</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!------End Header ------------>
	<!------ Slider ------------>
	<div class="slider">
		<div class="slider-wrapper theme-default">
			<div id="slider" class="nivoSlider">
				<img src="images/image1.jpg" data-thumb="images/1.jpg" alt="" /> <img
					src="images/image2.jpg" data-thumb="images/2.jpg" alt="" /> <img
					src="images/image3.jpg" data-thumb="images/3.jpg" alt="" /> <img
					src="images/image4.jpg" data-thumb="images/4.jpg" alt="" /> <img
					src="images/image5.jpg" data-thumb="images/5.jpg" alt="" />
			</div>
		</div>
	</div>
	<!------End Slider ------------>
	<!------Content ------------>
	<div class="main">
		<div class="wrap">
			<div class="module-title">
				<p class="modulePretext"></p>
			</div>
			<div class="section group">
				
					
				<div class="clear"></div>
			</div>
			<div class="more">
				<a href="http://localhost:8081/ProjetStruts/toffres" class="button"  >Check Ads</a>
			</div>
			<div class="content-bottom"></div>
			<!------End Content ------------>
			<!------footer ------------>
			<div class="footer" >
				<div class="footer-top" >
					<div class="col_1_of_4 span_1_of_footer-lastgrid" align="center">
						<h3>JoinUs</h3>
						<div class="footer-grid-address" >
							<p>Tel.+212651274942</p>
						</div>
						<ul class="follow_icon">
							<li><a href="#" style="opacity: 1;"><img
									src="images/facebook.png" alt=""></a></li>
							<li><a href="#" style="opacity: 1;"><img
									src="images/twitter.png" alt=""></a></li>
							<li><a href="#" style="opacity: 1;"><img
									src="images/feed.png" alt=""></a></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>



