<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Music</title>
</head>
<body>
<h1>Edit Music</h1><br>
<form action="update" method="post" enctype="multipart/form-data">
<input type="hidden" name="id" value="${getbyid.id}">
music name : <input type="text" name="name" value="${getbyid.musicname}" autocomplete="off"><br>
music :: <input type="file" name="audio"><br>
<input type="submit" value="submit">
</form>
</body>
</html>