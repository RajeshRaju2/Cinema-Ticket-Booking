<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>
<form action="search" method="get">
<input type="text" name="searchById" placeholder="Search here">
<button type="submit" class="btn btn-primary">Submit</button>
</form>
${NOTIFICATION}


 <h1 style="text-align: center;">Register</h1>
<form class="reg" action="addUser" method="post">
  <div class="form-group">
    <label for="name">First Name:</label>
    <input type="text" class="form-control" id="name" name="rgfname">
  </div>
    <div class="form-group">
    <label for="name">Last Name:</label>
    <input type="text" class="form-control" id="name" name="rglname">
  </div>
  <div class="form-group">
				<label for="lblgender">Gender </label> <br/>
				<div class="form-check-inline">
				
				<label class="form-check-label" for="lblrdmale"> Male </label>
				<input class="form-check-input" type="radio" name="gender" id="lblgender" value="Male" checked> 
			
				<label class="form-check-label" for="lblrdfemale"> Female </label>
				<input class="form-check-input" type="radio" name="gender" id="lblgender" value="Female"> 
  </div>
  </div>
 
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" id="email" name="rgmail">
  </div>
  
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" name="rgpwd">
  </div>

    <div class="form-group">
      <label for="phone">Contact No.:</label>
      <input type="number" class="form-control" id="phone" name="rgphone">
    </div>

  <button type="submit" class="btn btn-primary" style="display: grid;margin: auto;">Submit</button>
</form>
<br>

  <a href="signin">Login</a>
    
</body>
</html>