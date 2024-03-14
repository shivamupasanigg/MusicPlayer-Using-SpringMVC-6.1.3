<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Side</title>
</head>
<body>
<h1>admin panel</h1>
<form action="insert" method="post" enctype="multipart/form-data">
music name : <input type="text" name="musicname" autocomplete="off"><br>
music :: <input type="file" name="musicaudio"><br>
<input type="submit" value="submit">
</form>
<a href="selectall">list of audios</a>
</body>
</html>