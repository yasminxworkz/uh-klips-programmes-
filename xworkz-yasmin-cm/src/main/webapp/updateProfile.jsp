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
<c:forEach items="${errors}" var="e">
<br>
<span style="color: red;">${e.message}
</span>
</c:forEach>
<h1 style="color: green">${message}</h1>
<form action="updateProfile" method="post"  enctype="multipart/form-data">
  
    Email<input class="form-control form-control-lg"  type="email" name="email"   value="${dto.email}" /> 
			
 
 
        userId<input class="form-control form-control-lg " type="text" id="Id"
			name="userId" onchange="onUser()" value="${dto.userId}">
			
			
			mobileNumber<input class="form-control form-control-lg" type="number" name="mobileNumber" id="contact" onchange="onContact()" value="${dto.mobileNumber}" /> 
			<span id="contactError" style="color: red"></span><br> 
			
						
	<div>
								Select Profile Pic :<input type="file" name="profilePicture"
								 id="profilePicture"/> 
									<label class="form-label" for="profilePicture"></label>
                               </div>

<br>
								<button class="btn btn-primary btn-lg btn-block" type="submit">Update</button>


							
</form>

</body>
</html>