<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">

<title>Insert title here</title>

<style type="text/css">
a{
  
   margin-right:50px;
   
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
 <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="30">
    </a>    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
    </div>
    <form class="d-flex">
         <a href="index.jsp">mainpage </a>
      </form>
  </div>
</nav>
<form action="play" method="post">
<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label" >name</label>
   <input type="text" class="form-control" name="name" >
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">cruise</label>
   <input type="text" class="form-control" name="cruise" >
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">EntryFee</label>
   <input type="number" class="form-control" name="EntryFee">
  </div>
<div>
FreeFood<input type="radio"  name="FreeFood" value="yes" >yes
<input type="radio"  name="FreeFood"  value="no">no
</div>
<div>
FreeAlcohol<input type="radio"  name="FreeAlcohol"  value="yes">yes
<input type="radio"  name="FreeAlcohol" value="no" >no
</div>
<div>
<input type="submit" value="submit">

</div>


</form>

</body>
</html>