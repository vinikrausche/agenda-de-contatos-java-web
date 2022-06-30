<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css"/>
<title>Novo Conato</title>
</head>
<body>
	<h1>Novo Contato</h1>
	
	<div>
		<form method="POST" action="insert" name="form">
			<label>Nome: </label>
			<input class="input" type="text" id="name" name="nome" placeholder="Nome do contato"/><br/>
			<label>Telefone:</label>
			<input class="input" type="text" id="fone" name="fone" placeholder="Telefone do contato"/><br/>
			<label>Email: </label>
			<input class="input" type="email" id="email" name="email" placeholder="E-mail do contato"/></br>
			<input type="submit" value="salvar" id="submit"/>
		</form>
	</div>
	
	<script src="scripts/valida.js"></script>
</body>
</html>