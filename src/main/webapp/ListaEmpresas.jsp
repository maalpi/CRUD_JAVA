<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
<link rel="stylesheet" href="ListaEmpresa.css">
</head>
<body>	
	<c:if test="${not empty empresa}">		
	        <p>Empresa ${nomeEmpresa} Criada com sucesso!</p>	   
    </c:if>	
	
	
	<section class="section">
		<div class="main-content tabel">
			<h1>Lista de empresas</h1>
			<a href="/gerenciador/formNovaEmpresa.jsp" class="botao" target="_blank">Criar Empresa </a>

		
			<div class="box">
				<table class="tabela">
					<thead>
					<tr>
						<th>ID</th>
						<th>NOME</th>
						<th>DATA</th>
						<th>AÇÕES</th>
					</tr>
					</thead>
					<c:forEach items="${listaEmpresas}" var="empresa">
						<tr>
							<td>${empresa.id}</td>
							<td>${empresa.nome}</td>
							<td><fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></td>
							<td><a href="/gerenciador/mostraEmpresa?id=${empresa.id}" class="botao2" >editar</a>
								<a href="/gerenciador/removeEmpresa?id=${empresa.id}" class="botao2">remover</a>	
							</td>
						</tr>
					</c:forEach>
					</table>
			</div>
		</div>
	</section>
	
	
	
</body>
</html>