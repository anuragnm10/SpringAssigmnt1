<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
p {
	color: white;
	background-color: black;
	padding: 10px;
}

.heading {
	padding: 80px;
	font-size: 40px;
	font-family: cursive;
	background-color: #7d7296;
	color: #1f3c59;
}

.bg-dark {
    background-color: #1f1c17!important;
}
</style>
</head>
<body style="height: 92vh; overflow: hidden;">

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Bookess</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link active" href="login">Login</a>
					</li>
					<li class="nav-item"><a class="nav-link active" href="register">Register</a>
					</li>
					<li style="margin-left: 155vh;" class="nav-item"><a
						class="nav-link active" style="font-weight: bolder" href="homepage"><i class="fa fa-book"></i>&nbsp; Books</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div style="text-align: center;">
		<img src="resources/images/book.jpeg" style="max-width: 100%;">
	</div>




</body>
</html>