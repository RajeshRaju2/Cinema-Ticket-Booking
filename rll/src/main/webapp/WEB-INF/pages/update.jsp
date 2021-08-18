<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>
 <h1 style="text-align: center;">Update</h1>
<form action="updateUser" method="post">
  <div class="form-group">
    <label for="id">Employee No.:</label>
    <input type="text" class="form-control" id="id" name="userId" value="${param.userId}" readonly="readonly">
  </div>
  <div class="form-group">
    <label for="name">First Name:</label>
    <input type="text" class="form-control" id="name" name="fname" value="${param.fname}">
  </div>
    <div class="form-group">
    <label for="name">Last Name:</label>
    <input type="text" class="form-control" id="name" name="lname" value="${param.lname}">
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
    <input type="email" class="form-control" id="email" name="email" value="${param.email}" readonly="readonly">
  </div>
  
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" name="password" value="${param.password}" readonly="readonly">
  </div>
  
    <div class="form-group">
    <label for="phone">Contact No.:</label>
    <input type="number" class="form-control" id="phone" name="phone" value="${param.phone}" >
  </div>


  <button type="submit" value="updateUser" class="btn btn-primary" style="display: grid;margin: auto;">Submit</button>
</form>
</body>
</html>