<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ include file="head.jsp" %>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<body class="w3-light-grey">
<%@ include file="head.jsp"%>
<%@ include file="nav.jsp"%>
<%@ include file="header.jsp"%>

	<!-- Page content -->
	<div class="w3-content" style="max-width: 1100px;">

		<div class="w3-container w3-margin-top">
			<h3>Récapitulatif:</h3>

		</div>
		<div class="w3-container">
			<div class="w3-container w3-margin-top w3-table-all">
				<div class=" w3-table th">
					<table class="table">
					<thead>
						<tr>
							<th>Destination</th>
							<th>Date Aller</th>
							<th>Date Retour</th>
							<th>Nb voyageurs</th>
							<th>Prix Total TTC €</th>
							<th></th>
							</tr>
						</thead>
						<tbody>
						<tr>

							<td>${destination.region }</td>
							<td>${datesVoyage.dateAller }</td>
							<td>${datesVoyage.dateRetour }</td>
							<td>${nbvoyageurs}</td>
						</tr>
						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
	
<%@ include file="script.jsp" %>	
</body>
</html>