<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>The Code</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="app.js"></script>
</head>
<body>
	<div>
		<p class="error"><c:out value="${errors}"></c:out></p>
		<p>What is the the code?</p>
		<form method="post" action="/code">
			<input type="text" name="code">
			<button>Test Your Strength</button>
		</form>
	</div>
</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>The Code</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="app.js"></script>
</head>
<body>
	<div>
		<p class="error"><c:out value="${errors}"></c:out></p>
		<p>What is the the code?</p>
		<form method="post" action="/code">
			<input type="text" name="code">
			<button>Test Your Strength</button>
		</form>
	</div>
</body>
>>>>>>> 2f7d9fadc580410673e35d4ea32db23a3d87efb9
</html>