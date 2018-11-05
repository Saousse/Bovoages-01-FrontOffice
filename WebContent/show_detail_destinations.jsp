<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@ include file="head.jsp"%>
<%@ include file="nav.jsp" %>
<%@ include file="header.jsp" %>

<body>
	<section class="bg-light" id="team">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading text-uppercase">Votre choix :</h2>
          </div>
        </div>
        <div class="row">
          <div class="col-sm-4">
            <div class="team-member">
             <c:forEach items="${destination.images }" var="image">
					<div class="w3-half w3-margin-bottom">
						<div class="w3-display-container">
							<img src="images/${image }" style="width: 150%"> 
						</div>
					</div>
				</c:forEach>
              <h3>${destination.region }</h3>
              <h4 class="text-muted">${destination.description }</h4>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-8 mx-auto text-center">
            <p class="large text-muted">
          <table class="table">
          <thead>
				<tr>
				<th scope="col">Date Aller</th>
				<th scope="col">Date Retour</th>
				<th scope="col">Prix Ht unitaire</th>
				</tr></thead>
            <c:forEach items="${datesVoyages}" var="datesVoyage">
					 <tbody>
						<tr>
							<td>${datesVoyage.dateAller}</td>
							<td>${datesVoyage.dateRetour}</td>
							<td>${datesVoyage.prixHT}€</td>
							<td><a href="ShowCommandeServlets?idDestination=${destination.id}&idDateVoyage=${datesVoyage.id }" role="button">Commander</a></td>
						</tr>
					 </tbody>
				</c:forEach>
			</table>
          </div>
        </div>
      </div>
    </section>
    
    <%@ include file="contact.jsp" %>      
	<%@ include file="footer.jsp"%>
	<%@ include file="script.jsp"%>
</body>
</html>