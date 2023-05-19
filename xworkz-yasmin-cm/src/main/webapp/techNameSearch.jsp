<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   <!-- it is the import statement of jstl. jstl is imported to use special tags like foreach loop -->
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
 .container{
 width: 560px;
 }


</style>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

  <div class="container-fluid">
 <a class="navbar-brand" href="#">
      <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="30">
    </a>    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
  <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="save.jsp">register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="SignIn.jsp">SignIn</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="LoginSuccess.jsp">update</a>
        </li>
      </ul>
      
      
      
      
     
    </div>
  </div>
</nav>
<h1 style="color: red">${message}</h1>
<form action="findByTech" method="get">

search By Technology<input type="text" name="techName"/>


<input type="submit" value="view Technology Name">
</form>
<div>
<table class="table table-bordered">
<tr>
<th class="table-dark">userId</th>
<th class="table-dark">techName</th>
<th class="table-dark">language</th>
<th class="table-dark">owner</th>
<th class="table-dark">supportFrom</th>
<th class="table-dark">supportTo</th>
<th class="table-dark">license</th>
<th class="table-dark">openSource</th>
<th class="table-dark">OSType</th>

<c:forEach items="${list}" var="n">
<tr>
<td>${n.userId}</td>
<td>${n.techName}</td>
<td>${n.language}</td>
<td>${n.owner}</td>
<td>${n.supportFrom}</td>
<td>${n.supportTo}</td>
<td>${n.license}</td>
<td>${n.openSource}</td>
<td>${n.OSType}</td>
</tr>

</c:forEach>



</table>

</div>
</body>
</html>