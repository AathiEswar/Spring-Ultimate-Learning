<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>List Todos Page</title>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
	</head>
	<body>
		<div class="container">
			<h1>Your Todos</h1>
			<hr>
			<form:form method="post" modelAttribute="todo">
			    Description : <form:input path="description" type="text" required="required"/>
			     <form:input path="id" type="hidden" />
			     <form:input path="done" type="hidden" />
			    <button type="submit" class="btn btn-success" > Submit </button>

			    <form:errors path="description" />
			</form:form>

		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>