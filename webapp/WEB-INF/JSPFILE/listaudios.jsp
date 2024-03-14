<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Audio</title>
</head>
<body>
<h1>List Audio</h1>
		  <table>
			<tr>
			  <th>ID</th>
			</tr>
			<c:forEach var="listalldata" items="${listalldata}">
			<tr>
			  <td>${listalldata.id}</td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table class="table">
			<tr>
			  <th>Audios</th>
			</tr>
			<c:forEach var="Audios" items="${Audios}">
			<tr>
			  <td><audio controls>
  				  <source src="data:audio/mp3;base64,${Audios}" type="audio/mp3"></audio></td>
			</tr>
			</c:forEach>
		  </table>
	  
		  <table>
			<tr>
			  <th>Music Name</th>
			  <th>Actions</th>
			</tr>
			<c:forEach var="listalldata" items="${listalldata}">
			<tr>
			  <td>${listalldata.musicname}</td>
			  <td><a href="edit?id=${listalldata.id}">update</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="delete?id=${listalldata.id}">delete</a></td>
			</tr>
			</c:forEach>
		  </table>
</body>
</html>