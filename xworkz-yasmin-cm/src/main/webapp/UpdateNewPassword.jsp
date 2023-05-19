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
      </ul>
      
      
      
      
     
    </div>
  </div>
</nav>

      
      
    <h3 style="color: blue;">${userId}</h3>
    
    <div class="container">
     <form action="updatePassword?userId=${userId}" method="post">
  new password <input type="password" class="form-control form-control-lg" placeholder="userId" id="secure" name="password" onchange="onPassword()"> <br>
 
   ConfirmPassword<input class="form-control form-control-lg" type="password"  id="pass"onchange="onPassword()" value="${dto.password}" /> 
		 <input type="checkbox" onclick="showPassword()"> show Password
		<span id="passwordError" style="color: red"></span><br>
          <input type="submit" value="update" id="submitId" disabled="disabled" class="btn-btn-dark btn-lg"/>
   
    </form>
    </div>
   <h2 style="color:blue">please set your new password</h2>
   <br>
   <span style="color: red" id="passwordError"></span>
   
     <script >

     function onPassword() {
			console.log("running onUser")
			var pInput = document.getElementById('secure');
			var pValue = pInput.value;
			var cInput = document.getElementById('pass')
			var cValue = cInput.value;
			console.log(pValue);
			console.log(cValue);
			if (pValue.length > 3 && pValue.length < 30) {

				console.log('valid password');
				
					document.getElementById('submitId').disabled = false;
					document.getElementById('passwordError').innerHTML = '';

				if (cValue != pValue) {
					document.getElementById('passwordError').innerHTML = 'Invalid password,please confirm the entered password,';
					document.getElementById('submitId').disabled = 'disabled';
				}
			}

			else {
				console.log('invalid password');
				document.getElementById('submitId').disabled = 'disabled';

				document.getElementById('passwordError').innerHTML = 'Invalid password  please enter min 3 and max 30';
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