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
      <th scope="col">EID</th>
      <th scope="col">FNAME</th>
      <th scope="col">LNAME</th>
      <th scope="col">GENDER</th>
      <th scope="col">EMAIL</th>
       <th scope="col">PASSWORD</th>
      <th colspan="2">ACTION</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="employee" items="${elist}">
    <tr>
    	<td><c:out value="${employee.eid}"></c:out></td>
      	<td><c:out value="${employee.fname}"></c:out></td>
      	<td><c:out value="${employee.lname}"></c:out></td>
      	<td><c:out value="${employee.gender}"></c:out></td>
      	<td><c:out value="${employee.email}"></c:out></td>
      	<td><c:out value="${employee.password}"></c:out></td>
      	<td><a href="update?eid=${employee.eid}&fname=${employee.fname}&lname=${employee.lname}&gender=${employee.gender}&email=${employee.email}&password=${employee.password}">Edit</a></td>
      	<td><a href="delete?eid=${employee.eid}">Delete</a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
	
</body>
</html>