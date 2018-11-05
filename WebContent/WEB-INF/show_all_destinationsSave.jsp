<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion contacts</title>
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
      <li><a href="http://www.nyan.cat/">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>
	<c:if test="${empty destinations }">
		<h2>Aucune destination à afficher :-(</h2>
	</c:if>
	<c:if test="${not empty destinations }">
		<h2>Liste de vos Destinations</h2>
		<table id="tableau">

			<c:forEach items="${destinations}" var="destination">
				<tr>
					<td><img alt="image" src="images/${destination.image}" class="img-thumbnail"></td>
					<td>${destination.region}</td>
					<td><a href="ShowDetailDestinationsServlets?id=${destination.id}" class="btn btn-info" role="button">En savoir plus</a></td>

				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<footer>Copyright 2018
	</footer>
</body>
</html>