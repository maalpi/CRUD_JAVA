<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty empresa}">		
	        <p>Empresa ${nomeEmpresa} Criada com sucesso!</p>	   
    </c:if>	
<section id = 'container'>
        <h1>Tarefas</h1>
        <p class = 'relogio'>
            <input type="text" class = "input-tarefa"/>
            <button class = 'btn-tarefa'>Adicionar Nova Tarefa</button>
        </p>
        <ul class = 'tarefas'>
			<c:forEach items="${listaEmpresas}" var="empresa">		
			<li>${empresa.id} - ${empresa.nome} 
			- <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">editar</a>
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remover</a>
			</li>
		</c:forEach>
        </ul>
   </section>
<a href="/gerenciador/formNovaEmpresa.jsp">Criar Nova Empresa</a>
</body>
</html>