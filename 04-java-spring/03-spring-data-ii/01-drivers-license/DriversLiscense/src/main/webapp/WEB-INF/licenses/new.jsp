<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<h2>New License</h2>
<body>
	<form:form action="/licenses" method="post" modelAttribute="licenses">	
		<div>
	Person: <form:select path="person">
			    <c:forEach items="${persons}" var="person">
           			<form:option value="${person.id}"> ${person.id} : ${person.firstName} ${person.lastName}</form:option>
       			</c:forEach>
			</form:select> 
		</div>
	
	    <div>
	        <form:label path="state">State:</form:label>
	        <form:errors path="state"/>
	        <form:input path="state"/>
	    </div>
	    
	    <div>
	        <form:label path="expiration_date">Expiration Date:</form:label>
	        <form:errors path="expiration_date"/>
	        <form:input path="expiration_date" type="Date"/>
	    </div>
	       <button>Add License</button>
	</form:form>

</body>
</html>