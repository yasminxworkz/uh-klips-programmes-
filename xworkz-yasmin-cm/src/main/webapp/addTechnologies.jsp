<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Technologies available</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="120" height="60">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					   
       
        
        
        
         <li class="nav-item">
       
          <a  style="color:white" class="btn btn-outline-warning" aria-current="page" href="LoginSuccess.jsp">Home</a>
        </li>
        
     


			</div>
		</div>
		

		<div class="d-flex">
			<h3 style="color: blue;">welcome ${userId}</h3>

		</div>
		<div class="d-flex">
  
          <a class="navbar-brand" aria-current="page" >
          
      <span> <img src="download?fileName=${dtoPic}" height="70" width="80"> </span>
		
          </a>
        
		</div>
	</nav>

	<h3 style="color: green;">${msg}</h3>

	<div class="col-sm-3" style="margin: 80px 550px">
		<h3 class="form-control form-control-lg bg-danger">add Technologies
			you know</h3>

		<form action="addTechnologies" method="post"  class=" container pt-9 border border-5 border border-dark"
			>


		userId	<input class="form-control form-control-lg" name="userId" id="mail"
				value="${userId}" type="text" /> 
				 <br> 
			   
			TechName<input class="form-control form-control-lg " name="techName" type="text" id="tech"  onchange="onTechName()">
<span id="techError"></span><br>
Language<input class="form-control form-control-lg " name="language" type="text" id="lang"  onchange="onLanguage()" >
<span id="langError"></span><br>
owner<input class="form-control form-control-lg " name="owner" type="text" id="own"  onchange="onOwner()" >
<span id="ownerError"></span><br>
SupportFrom<input class="form-control form-control-lg " name="supportFrom" type="text" id="from"  onchange="onSupportFrom()">
<span id="supportError"></span><br>
SupportTo<input class="form-control form-control-lg " name="supportTo" type="text" id="to"  onchange="onSupportTo()">
<span id="toError"></span><br>
License<input class="form-control form-control-lg " name="license" type="text" id="lic"  onchange="onLicense()" >
<span id="licenseError"></span><br>
openSource<input name="openSource" type="radio" value="yes">yes
<input name="openSource" type="radio" value="no">no<br>
OSType<input class="form-control form-control-lg " name="OSType" type="text" id="os"  onchange="onOSType()">
<span id="osError"></span><br>
<input type="submit"  value="add">
		</form>
	</div>

</body>
</html>
