<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

  <div class="container-fluid">
 <a class="navbar-brand" href="#">
      <img src="https://static4.depositphotos.com/1001911/306/v/600/depositphotos_3064562-stock-illustration-chef-emoticon.jpg" alt="" width="80" height="30">
    </a>    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        
      </ul>
      
      
     
    </div>
  </div>
</nav>

      
      
    <h1>search</h1>
    
    <h1>${message}</h1>
  <form action="search"  method="get">
  
 Search By Id <input type="text" name="id"/>
 <input type="submit" value="Search">
  
  </form>
  
  <div>
  <h3> Search Results: </h3>
  developedBy: ${dto.developedBy}<br>
   type: ${dto.type}<br>
   noOfProducts: ${dto.noOfProducts}<br>
    noOfEmployes: ${dto.noOfEmployes}<br>
     name: ${dto.name}<br>
   
  
  </div>

       
 
  
  
  
       
      
       


</body>
</html>