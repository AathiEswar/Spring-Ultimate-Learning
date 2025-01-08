<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
		<title>List Todos Page</title>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
	</head>
	<body>
		<div class="container">
			<h1>Your Todos</h1>
			<hr>
			<form method="post">
			    Description : <input name="description" type="text" />
			    <button type="submit" class="btn btn-success" > Submit </button>
			</form>

		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>