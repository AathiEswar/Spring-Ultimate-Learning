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

			    <form:label path="description"> Description </form:label>
			    <form:input path="description" type="text" required="required"/>

                <form:label path="localDate"> Date </form:label>
                <form:input path="localDate" type="text" required="required"/>

                <div class="mb-3">
                    <form:label path="done" for="status" cssClass="form-label">
                        Update Status:
                    </form:label>
                    <form:select
                        path="done"
                        id="status"
                        cssClass="form-select w-25"
                    >
                        <form:option value="true">True</form:option>
                        <form:option value="false">False</form:option>
                    </form:select>
                </div>


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