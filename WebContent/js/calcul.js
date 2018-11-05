function calculer() {

        var nb = document.getElementById("nbvoyageurs").value;
        var prix = document.getElementById("prix").value;
        var resultat = document.getElementById("resultat");
        var nb = parseInt(nb);
        var prix = parseInt(prix);

        var prixtot = 1.2* nb * prix;
	                resultat.value = prixtot;
}

function init() {
        document.getElementById("btnCalculer").onclick = calculer;

}

init();