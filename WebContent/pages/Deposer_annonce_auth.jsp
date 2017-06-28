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

						<div id="login-form-username"
							style="display: inline-block; margin-right: 15px;">
							<%
								out.print("<label for='modlgn_username' style='font-size: 30px;font-family: verdana;' >"
										+"Hi ! "+ session.getAttribute("nom") + "</label>");
							%>
						</div>
						<div id="login-form-username"
							style="display: inline-block; margin-right: 30px">
							<%
								out.print("<label  for='modlgn_username' style='font-size: 30px;font-family: verdana;'>"
										+ session.getAttribute("prenom") + "</label>");
							%>

						</div>
						<a href="Acceuil.jsp"><input type="submit" name="submit"
							class="button" value="Logout"></a>

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
						<div class="grid_1_of_4 images_1_of_4">
							<div style="width: 700px">
								<div class="contact-form">
									<h3 style=" font-size: 36px">Add your Ad</h3>
									</br> </br>
									<form method="post" action="deposer.do" enctype="multipart/form-data">
										<div>
											<span><label>Title</label></span> <span><input
												name="titre" type="text" class="textbox"></span> <span
												style="color: orange;"><html:errors property="titre" /></span>
										</div>
										<div>
											<span><label>City</label></span> <span><select
												name="ville" class="textbox" style="width: 400px; height: 40px">
													<option selected="selected" value="choisir">--
														Choose your city --</option>
													<option value="Settat">Settat</option>
													<option value="Casablanca">Casablanca</option>
													<option value="Rabat">Rabat</option>
													<option value="Agadir">Agadir</option>
													<option value="Al Hoceïma">Al Hoceïma</option>
													<option value="Beni Mellal">Beni Mellal</option>
													<option value="El Jadida">El Jadida</option>
													<option value="Fès">Fès</option>
													<option value="Kénitra">Kénitra</option>
													<option value="Khouribga">Khouribga</option>
													<option value="Lâayoune">Lâayoune</option>
													<option value="Marrakech">Marrakech</option>
													<option value="Meknès">Meknès</option>
													<option value="Mohammédia">Mohammédia</option>
													<option value="Mohammédia">Nador</option>
													<option value="Oujda">Oujda</option>
													<option value="Safi">Safi</option>
													<option value="Salé">Salé</option>
													<option value="Tanger">Tanger</option>
													<option value="Tétouan">Tétouan</option>
											</select></span> <span style="color: orange;"><html:errors
													property="ville" /></span>
										</div>
										<div>
											<span><label>Cathegorie</label></span> <span><select
												name="cathegorie" class="textbox" style="width: 400px; height: 40px">
												<option selected="selected" value="choix">-- Choose the category --</option>
					<optgroup label="Vehicule">
						<option value="Voitures d'occasion">Used cars</option>
						<option value="Voitures neuves">New cars</option>
						<option value="Motos">Motors</option>
						<option value="Camions et techniques
															spéciales">Trucks</option>
						<option value="Nautisme">Boats</option>
						<option value="Pièces et Accessoires">Accessory</option>
					</optgroup>
					<optgroup label="House">
						<option value="Electroménager">Domestic appliances</option>
						<option value="Meubles et Interieur">Furniture</option>
						<option value="Kits Cuisine">Kitchen</option>
						<option value="Réparation et Construction">Construction</option>
						<option value="Plantes">Plants</option>
					</optgroup>
					<optgroup label="Pets & Animals">
						<option value="Chiens">Dogs</option>
						<option value="Chats">Cats</option>
						<option value="Oiseaux">Birds</option>
						<option value="Aquarium">Fish</option>
						<option value="Autres Animaux">Others</option>
						<option value="Accessoires Animaux">Accessory</option>
					</optgroup>
					<optgroup label="House">
						<option value="Appartements">Appartement</option>
						<option value="Chambres">Room</option>
						<option value="Maisons et Chalets">Houses</option>
						<option value="Terrains">Field</option>
						<option value="Garages et Parkings">Parking</option>
						<option value="Immobilier commercial">
							Commercial</option>
					</optgroup>
					<optgroup label="Things">
						<option value="Vêtements et Accessoires">Adult Clothes</option>
						<option value="Enfants vêtements et
															Chaussures">Kids Clothes</option>
						<option value="Articles pour enfants et
															Jouets">Toys</option>
						<option value="Montres et Bijoux">Watch & jewelry</option>
						<option value="Beauté et Santé">Beauty</option>
					</optgroup>
					<optgroup label="Electronic">
						<option value="Audio et Vidéo">Audio&Video</option>
						<option value="Consoles de jeux et Logiciels">Gaming</option>
						<option value="Ordinateurs de bureau">PersonalComputer Fix</option>
						<option value="Ordinateurs portables">Laptop</option>
						<option value="Matériel de bureau">Desk</option>
						<option value="Tablettes et E-books">E-books</option>
						<option value="Téléphones">Phones</option>
						<option value="Marchandises pour ordinateur">Computer Stuff</option>
						<option value="Photo Technique">Photos</option>
					</optgroup>
					<optgroup label="Hobbies">
						<option value="Billets et Voyages">Tickets</option>
						<option value="Vélos">Bike</option>
						<option value="Vélos">Books</option>
						<option value="Collections">Collection</option>
						<option value="Instruments de musique">Instruments</option>
						<option value="Chasse et Pêche">Hunting</option>
						<option value="Sports et Loisirs">Sports</option>
					</optgroup>
					<optgroup label="Entreprise">
						<option value="Emploi">Jobs</option>
						<option value="Emploi">Services</option>
						<option value="Equipements d'entreprise">Equipements</option>
					</optgroup>
											</select></span><span
												style="color: orange;"><html:errors property="cathegorie" /></span>
										</div>
										<div>
											<span><label>Image</label></span> <span><input type="file" name="image" size="50" /></span> <span
												style="color: orange;"><html:errors property="image" /></span>
										</div>
                                         <div>
											<span><label>Price(DHS)</label></span> <span><input
												name="prix" type="text" class="textbox"></span> <span
												style="color: orange;"><html:errors property="prix" /></span>
										</div>
										<div>
											<span><label>Description</label></span> <span><textarea
													name="description"> </textarea></span> <span
												style="color: orange;"><html:errors
													property="description" /></span>
										</div>

										<div>
											<span><input type="submit" value="Submit"></span>
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



