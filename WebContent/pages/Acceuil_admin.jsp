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
				<div class="top-header-left">
					
				</div>
				<div class="right-left">
					<ul>
						        <div id="login-form-username" style="display: inline-block; margin-right: 15px">
									
									
								</div>
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
									value="Deconnecter" ></a>

					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="header-bottom">
			<div class="wrap">
				
				<div class="top-nav">
					<ul>
						<li class="active" style="margin-right: 30px"><a href="Acceuil_admin.jsp">
								What's new</a></li>
						<li style="margin-right: 30px"><a href="http://localhost:8081/ProjetStruts/ModAnnonce">Delete Ad</a></li>
						<li style="margin-right: 30px"><a href="http://localhost:8081/ProjetStruts/Suppri_membre">Delete member</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!------End Header ------------>
	<!------Content ------------>
	<div class="main">
		<div class="wrap">
			<div class="content-bottom">
				<div class="page-not-found">
					<h1 style="font-size: 120px">Admin page</h1>
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



