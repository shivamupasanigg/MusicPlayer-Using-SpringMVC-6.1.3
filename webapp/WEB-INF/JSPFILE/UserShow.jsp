<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music List</title>
</head>
<body>
<table border="2">
<tr>
<td>ID</td>
<td>Musicname</td>
<td>Action</td>
</tr>
<c:forEach var="AdminData" items="${AdminData}">
<tr>
<td>${AdminData.id}</td>
<td>${AdminData.musicname}</td>
<td><a href="UserMusic?id=${AdminData.id}">Listen Music</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>