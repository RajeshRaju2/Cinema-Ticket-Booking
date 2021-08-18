<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Home</title>
</head>
<body>

	<table class="table">
  <thead class="thead-light">
    <tr>      
      <th scope="col">USERID</th>
      <th scope="col">FNAME</th>
      <th scope="col">LNAME</th>
      <th scope="col">GENDER</th>
      <th scope="col">EMAIL</th>
       <th scope="col">PASSWORD</th>
       <th scope="col">CONTACT NO.</th>
      <th colspan="2">ACTION</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="user" items="${ulist}">
    <tr>
    	<td><c:out value="${user.userId}"></c:out></td>
      	<td><c:out value="${user.fname}"></c:out></td>
      	<td><c:out value="${user.lname}"></c:out></td>
      	<td><c:out value="${user.gender}"></c:out></td>
      	<td><c:out value="${user.email}"></c:out></td>
      	<td><c:out value="${user.password}"></c:out></td>
      	<td><c:out value="${user.phone}"></c:out></td>
      	<td><a href="update?userId=${user.userId}&fname=${user.fname}&lname=${user.lname}&gender=${user.gender}&email=${user.email}&password=${user.password}&phone=${user.phone}">Edit</a></td>
      	<td><a href="delete?userId=${user.userId}">Delete</a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
	
</body>
</html>