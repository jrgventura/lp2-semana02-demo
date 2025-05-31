<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Pagina JPA - Maven - Servlet</h1>

	<form id="myForm" action="AutenticacionServlet" method="post">
		<div class="mb-3">
			<label for="nombre" class="form-label">Nombre:</label>
			<input type="text" class="form-control" name="txtName" required>
		</div>

		<button type="submit" >Enviar datos</button>
	</form>

</body>
</html>