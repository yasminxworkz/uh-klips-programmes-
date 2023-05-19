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
<style>
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
          <a style="color:white" class="btn btn-outline-warning" aria-current="page" href="save.jsp">Register</a>
        </li>
       
         <li class="nav-item">
          <a style="color:white" class="btn btn-outline-warning" aria-current="page" href="index.jsp">Home</a>
        </li>
        
      </ul>
      
      
      
      
     
    </div>
  </div>
</nav>


    <h1 style="color: blue;">SignIn page</h1>
    
    <br>
    <br>
      <h2 style="color: blue;">${resetMsg}</h2>
      <h1 style="color: red">${message}</h1>
 
     <div class="container">
    <form action="SignIn" method="get">
   
  UserId <input type="text" class="form-control form-control-lg" placeholder="userId" id="Id" name="userId" onchange="onUser()"> <br>
    Password      <input type="password" class="form-control form-control-lg" placeholder="password" name="password" id="pass"><br>
           <input type="checkbox" onclick="showPassword()"> show Password
          <input type="submit" value="signUp" >
   
    </form>
    <a style="color: blue" href="forgotPassword.jsp">forgotPassword?</a>
     </div>
     <script >

function onUser() {
	console.log("running onUser")
	var userInput=document.getElementById('Id');
	var userValue=userInput.value;
	console.log(userValue);
	if(userValue!=null && userValue!="" && userValue.length>3 && userValue.length<30)
		{
		console.log('valid user');
		var agrement=document.getElementById('agreement');
		if(agrement.checked){
			document.getElementById('submitId').disabled=false;
		}
		document.getElementById('nameError').innerHTML='';
		}
	
	else{
		console.log('invalid user');
		document.getElementById('submitId').disabled='disabled';
	
	document.getElementById('nameError').innerHTML='Invalid userId, please enter min 3 and max 30';
	}
	
	
}

function showPassword() {
    var temp = document.getElementById("pass");
    if (temp.type === "password") {
        temp.type = "text";
    }
    else {
        temp.type = "password";
    }
}

</script >


</body>
</html>