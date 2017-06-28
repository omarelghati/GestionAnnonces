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
</head>
<body>
	<!------ Header------------>
	<div class="wrap-box"></div>
	<div class="header">
		<div class="header-top">
			<div class="wrap">
				<div class="right-left">
					<ul>
						
								<div id="login-form-username" style="display: inline-block; margin-right: 15px;">
									<%
										out.print("<label for='modlgn_username' style='font-size: 30px;font-family: verdana;' >"
												+"Hi ! "+ session.getAttribute("nom") + "</label>");
									%>
								</div>
								<div id="login-form-username" style="display: inline-block; margin-right: 30px">
									<%
										out.print("<label  for='modlgn_username' style='font-size: 30px;font-family: verdana;'>"
												+ session.getAttribute("prenom") + "</label>");
												
									%>
									
								</div>
								 <a href="Acceuil.jsp"><input type="submit" name="submit" class="button"
									value="Logout" ></a>

					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="header-bottom">
			<div class="wrap">
				
				<div class="top-nav">
					<ul>
						<li class="active"><a href="Acceuil_auth.jsp">All Ads</a></li>
						<li><a href="Deposer_annonce_auth.jsp">Post your Ad</a></li>
						<li><a href="http://localhost:8081/ProjetStruts/ModAnnonce">Delete Ad</a></li>
						<li><a href="Inscription_auth.jsp">Sign up</a></li>
						<li><a href="contact_auth.jsp">Contact us</a></li>
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
						<div class="col span_2_of_contact">
							<div class="contact-form">
								<h3 style="color:black;">Contact Us</h3>
								<form method="post" action="contact_auth.do">
									<div>
										<span><label>Name</label></span> <span><input name="nom"
											type="text" class="textbox"></span> <span
											style="color: orange;"><html:errors property="nom" /></span>
									</div>
									<div>
										<span><label>Email</label></span> <span><input
											name="email" type="text" class="textbox"></span> <span
											style="color: orange;"><html:errors property="email" /></span>
									</div>
									<div>
										<span><label>Phone number</label></span> <span><input
											name="telephone" type="text" class="textbox"></span> <span
											style="color: orange;"><html:errors
												property="telephone" /></span>
									</div>
									<div>
										<span><label>Description</label></span> <span><textarea
												name="sujet"> </textarea></span> <span style="color: orange;"><html:errors
												property="sujet" /></span>
									</div>
									<div>
										<span><input type="submit" name="conta" value="Submit"></span>
									</div>
								</form>
							</div>
						</div>
						<div class="clear"></div>
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
	</div>
</body>
</html>



