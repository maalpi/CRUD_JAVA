<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Criação de Empresa</title>
<link rel="stylesheet" href="FormEmpresa.css">
</head>
<body>
		<div id="form-cadastro">
			<h2 class="header">Cadastro de Empresa </h2>
			<form action="${linkServletNovaEmpresa}" method="post">
				 <input type="text" name="nome" placeholder="Nome"></input>
				 <input type="text" name="cnpj" placeholder="CNPJ"></input>
				 <input type="text" name="data" placeholder="Data"></input>
			
				<button class="botao2" type="submit" value="cadastrar">Cadastrar</button>
			</form>
		</div>

</body>
</html>