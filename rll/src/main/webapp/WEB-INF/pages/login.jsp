<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>
<h1 style="margin-bottom:20px;">Login here</h1>
<form action="sgn" method="post">

<div class="form-group">
    <label for="lgmail"><b>Email</b></label>
    <input type="email" placeholder="Enter your Mail Id" name="lgmail" required>

    <label for="lgpassword"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="lgpassword" required>
  </div> 
 
    <button type="submit" class="btn btn-primary">Login</button>
   
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  <br>
  <br>
<div class="form-group">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
${NOTIFICATION}
</body>
</html>