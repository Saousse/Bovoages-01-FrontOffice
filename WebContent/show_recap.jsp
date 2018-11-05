<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="head.jsp"%>

<body>

	<!-- Page content -->
	<div class="w3-content" style="max-width: 1100px;">
		<div class="w3-container w3-margin-top">
			
			<div class="w3-container w3-margin-top">
				<h3>Votre Choix:</h3>
				<h6>
					<strong>${destination.region }</strong>
				</h6>
				<p>${destination.description }</p>
			</div>
			<div class="w3-row-padding w3-text-white w3-large">
				<c:forEach items="${destination.images }" var="image">
					<div class="w3-half w3-margin-bottom">
						<div class="w3-display-container">
							<img src="images/${image}" style="width: 100%"> <span
								class="w3-display-bottomleft w3-padding">${destination.region }</span>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<div class="w3-container w3-margin-top w3-table-all">
			<div class=" w3-table th">
				<table>
					<tr>
						<th>Date Aller</th>
						<th>Date Retour</th>
						<th>Prix Ht unitaire</th>
						<th></th>
					</tr>
					<c:forEach items="${datesVoyages }" var="datesVoyage">
						<tr>
							<td>${datesVoyage.dateAller}</td>
							<td>${datesVoyage.dateRetour}</td>
							<td>${datesVoyage.prixHT}€</td>
							<td><a href="ShowCommandeServlets?idDestination=${destination.id}&idDateVoyage=${datesVoyage.id }"
								role="button">Commander</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
				
		<!-- End page content -->
	</div>
	<%@ include file="footer.jsp"%>
	<%@ include file="script.jsp"%>
</body>
</html>