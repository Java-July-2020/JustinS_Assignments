<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Show Person</title>
</head>
<body>
	<h1>Persons</h1>
	<a href="/persons/new">Create a New Driver</a>
	<table class="table table-dark">
	<thead>
		<tr>
			<td>ID</td>
			<td>First Name</td>
			<td>Last Name</td>
		</tr>
	</thead>
	<tbody><c:forEach items="${persons}" var="person">
		<tr>
			<td><a href="/persons/${person.id}">${person.id}</a></td>
			<td>${person.firstName}</td>
			<td>${person.lastName}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	
</body>
</html>