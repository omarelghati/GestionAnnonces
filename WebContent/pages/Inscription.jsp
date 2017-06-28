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
<!------ Light Box ------>
<link rel="stylesheet" href="css/swipebox.css">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script src="js/ios-orientationchange-fix.js"></script>
<script src="js/jquery.swipebox.min.js"></script>
<script type="text/javascript">
	jQuery(function($) {
		$(".swipebox").swipebox();
	});
</script>
<!------ Eng Light Box ------>
</head>
<body>
	<!------ Header------------>
	<div class="wrap-box"></div>
	<div class="header">
		<div class="header-top">
			<div class="wrap">
				<div class="right-left">
					<ul>
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
						<li><a href="Modifier_annonce.jsp">Modify Ad</a></li>
						<li><a href="Inscription.jsp">Sign up</a></li>
						<li><a href="contact.jsp">Contact us</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!------ End Header ------------>
	<!------Content ------------>
	<div class="main">
		<div class="wrap">
			<div class="about">
				<div class="services">
					<div class="section group">
						<div class="grid_1_of_4 images_1_of_4">
							<div style="width: 700px">
								<div class="contact-form">
									<h3 style=" font-size: 36px">SIGN UP </h3>
									</br> </br>
									<form method="post" action="inscription.do">
										<div>
											<span><label>Family Name</label></span> <span><input
												name="nom" type="text" class="textbox"></span> <span
												style="color: orange;"><html:errors property="nom" /></span>
										</div>
										<div>
											<span><label>First Name</label></span> <span><input
												name="prenom" type="text" class="textbox"></span> <span
												style="color: orange;"><html:errors property="prenom" /></span>
										</div>
										<div>
											<span><label>Password</label></span> <span><input
												name="mdp" type="password" class="textbox"></span> <span
												style="color: orange;"><html:errors property="pass" /></span>
										</div>
										<div>
											<span><label>Confirm</label></span> <span><input
												name="vmdp" type="password" class="textbox"></span> <span
												style="color: orange;"><html:errors property="vpass" /></span>
										</div>
										<div>
											<span><label>E-Mail</label></span> <span><input
												name="email" type="email" class="textbox"></span> <span
												style="color: orange;"><html:errors property="email" /></span>
										</div>
										<div>
											<span><label>Phone Number</label></span> <span><input
												name="telephone" type="text" class="textbox"></span> <span
												style="color: orange;"> <html:errors property="tel" /></span>
										</div>

										<div>
											<span><input type="submit" name="valider"
												value="S'inscrire"></span>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
			</div>
			<!------End Content ------------>
			<div class="footer">
				<div class="footer-top">
					<div class="col_1_of_4 span_1_of_footer-lastgrid">
						<h3>JoinUs</h3>
						<div class="footer-grid-address">
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
</body>
</html>
