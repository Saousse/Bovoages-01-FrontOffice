 $(document).ready(function() {
   $(".add_field_button").on('click', function() {
     var counter = parseInt($('#nbvoyageurs').val(), 10);
	var str = "";
     for (var i = 1; i < counter; i++) {
       str += '<br>';
    	   str += '<h3>Voyageur '+(i+1)+'</h3>';
    	   str += '<div> Civilité: <input type="text" name="myCiv'+i+'" style="">';
    	   str += 'Nom: <input type="text" name="selNom'+i+'">' ;
    	   str += 'Prénom: <input type="text" name="selPre'+i+'" style="">' ;
    	   str += 'Date de Naissance: <input type="date" name="selDat'+i+'" style="">\ ';  
    	   str += '</div>';
     } 
     $("#inrlog").empty().append(str);
   })
 });
 
 function afficherForm() {
		
		let idDV = document.getElementById("idDV").value;
		console.log(idDV);
		let idD = document.getElementById("idD").value;
		console.log(idD);
		let nbVoy = document.getElementById("nb").value;
		let container = document.getElementById("formVoyageurs");
		
		let html = "<form action='GetInfosVoyageServlet?nbVoy="+nbVoy+"&idDV="+idDV+"&idD="+idD+"' method='post'>";
		
		html += "<br><h2>Qui voyage?</h2><table><tr><th>Voyageur</th><th>Civilité</th><th>Nom</th><th>Prénom</th><th>Date de Naissance</th></tr>";
		
		for(let i=1; i<=nbVoy; i++) {
			html +="<tr><td>"+i+"</td><td><select name='civilite"+i+"' id='civilite"+i+"'>" +
				"<option value='Mr'>Mr</option><option value='Mme'>Mme</option></select></td>" +
				"<td><input type='text' name='nom"+i+"' id='nom"+i+"' placeholder='Nom'></td>" +
				"<td><input type='text' name='prenom"+i+"' id='prenom"+i+"' placeholder='Prénom'></td>" +
				"<td><input type='date' name='birth"+i+"' id='birth"+i+"'></td></tr>";
		}
		html +="</table><br><div id='client'>Client : <input name='nomClient' id='nomClient' placeholder='Nom'></div><br>" +
				"<button type='submit' id='buttComm'>Commander</button></form>";
		
		console.log(html);
		container.innerHTML= html;
	}