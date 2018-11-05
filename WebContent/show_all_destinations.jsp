<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="head.jsp" %>
<%@ include file="nav.jsp" %>
<%@ include file="header.jsp" %>
<body>


	  
	 
    

    
	<!--  All destination  -->
	 <section class="bg-light" id="portfolio">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading text-uppercase">Liste des Voyages</h2>
            <h3 class="section-subheading text-muted">Choisissez la destination que vous souhaitez.</h3>
          </div>
        </div>
        <div class="row">
        <c:forEach items="${destinations}" var="destination">
          <div class="col-md-4 col-sm-6 portfolio-item">
            <a class="portfolio-link"  href="ShowDetailDestinationsServlets?id=${destination.id}">
              <div class="portfolio-hover">
                <div class="portfolio-hover-content">
                  <i class="fas fa-plus fa-3x"></i>
                </div>
              </div>
              <img class="img-fluid" src="images/${destination.images[0]}" alt="${destination.region}">
            </a>
            <div class="portfolio-caption">
              <h4>${destination.region}</h4>
            </div>
          </div>
          
          </c:forEach>
          
        </div>
      </div>
    </section>
    
    
<%@ include file="contact.jsp" %>      
<%@ include file="newsletter.jsp" %>  
<%@ include file="footer.jsp" %>
<%@ include file="script.jsp" %>	

	
</body>

</html>