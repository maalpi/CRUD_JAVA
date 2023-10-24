<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Criação de Empresa</title>
<link rel="stylesheet" href="FormEmpresa.css">
</head>
<body>
		<div id="form-cadastro">
		<h2>Atualização de Empresa </h2>
		<form action="${linkServletAlteraEmpresa}" method="post">
			<input type="hidden" name="id" value="${empresa.id}"/>
			<input type="text" name="nome" value="${empresa.nome}" placeholder="Nome"></input>
			<input type="text" name="cnpj" value="${empresa.cnpj}" placeholder="CNPJ"></input>
			<input type="text" name="data" value="$<fmt:formatDate 
					value="${empresa.dataAbertura}" 
					pattern="dd/MM/yyyy"/>" placeholder="Data"></input>
			<button class="botao2" type="submit" value="Atualizar">Atualizar</button>
		</form>
		</div>

</body>
</html>