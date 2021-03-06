<%@page import="COM.rsa.jsafe.an"%>
<%@page import="model.Annonce"%>
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
<link href="css/style1.css" rel="stylesheet" type="text/css"  />
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
<jsp:useBean id="annonces" class="java.util.ArrayList" scope="session" />
<jsp:useBean id="n" type="java.lang.Integer" scope="session" />
<jsp:useBean id="nbre_pg" type="java.lang.Integer" scope="session" />
	<!------ Header------------>
	<div class="wrap-box"></div>
	<div class="header">
		<div class="header-top">
			<div class="wrap">
				<div class="right-left">
					<ul>
						
								<div id="login-form-username" style="display: inline-block; margin-right: 15px;">
									<%
										out.print("<label for='modlgn_username' style='font-size: 30px;font-family: verdana; ' >"
												+"Hi ! "+ session.getAttribute("nom") + "</label>");
									%>
								</div>
								<div id="login-form-username" style="display: inline-block; margin-right: 30px">
									<%
										out.print("<label  for='modlgn_username' style='font-size: 30px;font-family: verdana; '>"
												+ session.getAttribute("prenom") + "</label>");
												
									%>
									
								</div>
								 <a href="pages/Acceuil.jsp"><input type="submit" name="submit" class="button"
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
						<li class="active"><a href="pages/Acceuil_auth.jsp">All Ads</a></li>
						<li><a href="pages/Deposer_annonce_auth.jsp">Post your Ad</a></li>
						<li><a href="http://localhost:8081/ProjetStruts/ModAnnonce">Delete Ad</a></li>
						<li><a href="pages/Inscription_auth.jsp">Sign up</a></li>
						<li><a href="pages/contact_auth.jsp">Contact us</a></li>
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
	
						
	
	<table>     
		<%
			for (int i = 0; i < annonces.size(); i++) {
				Annonce an = (Annonce)annonces.get(i);
		%>
		<tr class="bdd">
		<a  href="consult?id=<%=an.getIdA() %>">
			<div class="bd">
				<td class='time'><%=an.getDate().toGMTString()%></td>
			</div>
			
			<div class="bd">
				<td class='categ'>
				<%=an.getCathegorie()%><br> <i class='spec'><%=an.getTitre()%>, <%=an.getVille()%></i></td>
			</div>
			<div class="bd">
				<td class='prix'><%=an.getPrix()%> DH</td>
			</div>
			</a>
			<div class="bd">
				<td ><a href="http://localhost:8081/ProjetStruts/supprim?id=<%=an.getIdA() %>"><input class='button' style="height:40px; width: 150px" type="button" value="Delete"></a></td>
			</div>
			
		</tr>       
		<%
			}
		%>
		
	</table>	
	 <%
			for(int i=1;i <= nbre_pg.intValue(); i++){
		%>
				<a href="toffres?page=<%=i %>">page<%=i %></a>
		<%
			}
		%>				
						</div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<!------End Content ------------>
			<div class="footer">
				<div class="footer-top">
					
					<div class="clear"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>



