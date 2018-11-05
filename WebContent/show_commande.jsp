<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="head.jsp"%>
<%@ include file="nav.jsp"%>
<%@ include file="header.jsp"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script    src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script    src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script    src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

<body>


    <!-- Page content -->
     <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h3 class="section-heading text-uppercase">Votre sélection:</h3>

        </div>
        <div>
            <div >
                <table class="table">
                    <thead>
                        <tr>

                            <th>Destination</th>
                            <th>Depart</th>
                            <th>Retour</th>
                            <th>Nb voyageurs</th>
                            <th>Prix Unit. HT €</th>
                            <th>Prix Total TTC €</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>

                            <td>${destination.region }</td>
                            <td>${datesVoyage.dateAller }</td>
                            <td>${datesVoyage.dateRetour }</td>

                            <td><select name=nbVoyageurs form="nbform" id="nbVoyageurs"
                                onchange=calculer(),afficherForm() class="nbVoyageurs">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                    <option value="9">9</option>
                            </select></td>
                            <td><input id="prix" disabled="disabled" class="w3-input"
                                value="${datesVoyage.prixHT }" size="5"></td>
                            <td><input id="prixTot" class="w3-input"
                                disabled="disabled" size="5" /></td>

                        </tr>
                    </tbody>
                </table>
            
                <div>
                <form>
                    <h2>Voyageur 1</h2>
                    <h4>Votre nom et le password serons utiliser pour vous crée un compte si vous souhaitez vous connectez pour vérifer vos informations</h4>
            <div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-venus-mars'style='font-size:10px;'></i></span><input type='text' class='form-group form-control-lg' name='civilite"+i+"' id='civilite"+i+"' placeholder='Civilité' aria-label='Large' aria-describedby='inputGroup-sizing-lg'>
            <div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-address-book'style='font-size:10px;'></i></span><input type='text' class='form-group form-control-lg' name='nom"+i+"' id='nom"+i+"' placeholder='Nom' aria-label='large' aria-describedby='inputGroup-sizing-lg'required>
            <div class='form-group input-group-lg mb-3'><span class='form-group'><i class='glyphicon glyphicon-lock'style='font-size:10px;'></i></span><input type='password' class='form-group form-control-lg' name='password"+i+"' id='password"+i+"' placeholder='Password' aria-label='Large' aria-describedby='inputGroup-sizing-lg' required>
            <div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-address-book'style='font-size:10px;'></i></span><input type='text' class='form-group form-control-lg' name='prenom"+i+"' id='prenom"+i+"' placeholder='Prénom' aria-label='large' aria-describedby='inputGroup-sizing-lg'>
            <div class='form-group input-group-lg mb-3'><span class='form-group'><i class='fa fa-calendar'style='font-size:10px;'></i></span><input type='date' class='form-group form-control-lg' name='dateDeNaissance"+i+"' id='dateDeNaissance"+i+"'aria-label='large' aria-describedby='inputGroup-sizing-lg'></div></div></div></div></div>
             
                </form>
                        <div id="inrlog"></div>
                    
                    
                    <input type="hidden" id="idDestination" value="${destination.id }">
                    <input type="hidden" id="idDatesVoyage" value="${datesVoyage.id }">
            </div>
        </div>
        
        
    </div>

    <!-- End page content -->
    </div>
    </div>
     <button type='submit' class='btn btn-primary btn-lg'id='CommandeBtn' href="ShowRecapitulatifServlet?idDestination=${destination.id}&idDatesVoyage=${datesVoyage.id }">Envoyer</button>
                
    <%@ include file="contact.jsp"%>
    <%@ include file="footer.jsp"%>
    <%@ include file="script.jsp"%>

</body>
<!-- Bootstrap core JavaScript -->
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

<script type="text/javascript" src="js/show_commande.js"></script>
</html>

