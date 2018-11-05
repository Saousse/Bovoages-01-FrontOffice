<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Commande</title>
<link rel="stylesheet" href="css/contact.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<header>
		<img alt="Haut_de_banniere" src="images/img_haut_page.jpg" width="1000" height="364" class="img-thumbnail">
	</header>
	<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BoVoyage</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="ShowAllDestinationsServlets">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>
	<table id="tableau">
		<tr>
			<th>Destination</th>
			<th>Depart</th>
			<th>Retour</th>
			<th>Nb personnes</th>
			<th>Prix Total TTC</th>
			<th></th>
		</tr>
		<tr>
			<c:forEach items="${destinations}" var="destination">
				<td>${destination.region }</td>
			</c:forEach>
			<c:forEach items="${datesVoyages}" var="datesVoyage">
				<td>${datesVoyage.dateAller }</td>
				<td>${datesVoyage.dateRetour }</td>
			
			<td><select><option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
			</select></td>
			<td>${datesVoyage.prixHT }</td>
			</c:forEach>
			<td><a href="" class="btn btn-info" role="button">Commander</a></td>
		</tr>
	</table>
</body>
</html>