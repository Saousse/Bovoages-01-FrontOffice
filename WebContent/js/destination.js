"use strict";

let xhr = new XMLHttpRequest();

function show(data) {

	let destinations = JSON.parse(data);
	let container = document.getElementById("container");
	let html = "<div class='div6'>";
	html+= "<table>";
	html += "<tr><td>" + destinations.region + "</td>";
	html += " <td>" + destinations.description + "</td>";
	html += "</tr>"
	html += "</table>";
	html += "</div>";
	container.innerHTML = html;

}

function search() {
	let id = document.getElementById("id").value;
	let url = "rest/destinations/id/" + id;
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			show(xhr.responseText);
		}
	}
	xhr.open("GET", url, true);
	xhr.send(null);
}

 function showAddResponse(data){
 alert(data);
 }

document.addEventListener("DOMContentLoaded", function() {
	document.getElementById("btn-id").addEventListener("click", search);

});