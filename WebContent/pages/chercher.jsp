
<form method="POST" action="chercher.do">
	<table>
		<tr>
			<td><input type="text" name="titre" style="height: 20px"/></td>
			<td><select name="categorie" class="textbox"
				style="width: 300px; height: 30px">
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
					<optgroup label="Animaux">
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
			</select></td>
			<td><select name="City" class="textbox"
				style="width: 200px; height: 30px">
					<option selected="selected" value="choisir">Choose a city--</option>
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
			</select></td>
		<td><input type="hidden" name="page" value="1"/></td>
			<td><input type="submit" value="Search" /></td>
		</tr>
	</table>
</form>