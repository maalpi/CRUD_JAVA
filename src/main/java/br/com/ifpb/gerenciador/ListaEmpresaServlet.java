package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		RequestDispatcher rd = 
				req.getRequestDispatcher("/ListaEmpresas.jsp");
		req.setAttribute("listaEmpresas", lista);
		rd.forward(req, resp);
	}

}
