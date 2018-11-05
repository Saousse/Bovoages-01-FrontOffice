function calculer() {

    var nb = document.getElementById("nbVoyageurs").value;
    var prix = document.getElementById("prix").value;
    var prixTot = document.getElementById("prixTot");
    var nb = parseInt(nb);
    var prix = parseInt(prix);

    var prixTotTtc = 1.2 * nb * prix;
    prixTot.value = prixTotTtc;
}

function afficherForm() {
    
    let idDest = document.getElementById("idDestination").value;
    let idDate = document.getElementById("idDatesVoyage").value;
    let nbVoyageurs = document.getElementById("nbVoyageurs").value;
    let prixTot = document.getElementById("prixTot").value;
    let container = document.getElementById("inrlog");
    
    let html = "<div id='voyageurs' name='voyageurs'></section><form action='ShowRecapitulatifServlet?idDestination=${destination.id}&idDatesVoyage=${datesVoyage.id }' method='post'>";
    
    html += "<br><div id='servicewrap'><div class='container'>"+
            "<h1>FORMULAIRE DE SAISIE DES VOYAGEURS</h1><p>"+
            "<div class='input-group input-group-sm mb-2'>"+
            "</div></p><div class='row mt'>";
    
    for(let i=2; i<=nbVoyageurs; i++) {
        html +="<div class='col-lg-3 service'><h3>Voyageur&nbsp</h3>"+"<h3>"+i+"</h3>"+"<br>" +
            "<div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-venus-mars'style='font-size:10px;'></i></span><input type='text' class='form-group form-control-lg' name='civilite"+i+"' id='civilite"+i+"' placeholder='Civilité' aria-label='Large' aria-describedby='inputGroup-sizing-lg'></div>" +
            "<div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-address-book'style='font-size:10px;'></i></span><input type='text' class='form-group form-control-lg' name='nom"+i+"' id='nom"+i+"' placeholder='Nom' aria-label='large' aria-describedby='inputGroup-sizing-lg'></div>" +
            "<div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-address-book'style='font-size:10px;'></i></span><input type='text' class='form-group form-control-lg' name='prenom"+i+"' id='prenom"+i+"' placeholder='Prénom' aria-label='large' aria-describedby='inputGroup-sizing-lg'></div>" +
            "<div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-calendar'style='font-size:10px;'></i></span><input type='date' class='form-group form-control-lg' name='dateDeNaissance"+i+"' id='dateDeNaissance"+i+"'aria-label='large' aria-describedby='inputGroup-sizing-lg'></div></div>";
    }
    
    

    container.innerHTML= html;
}