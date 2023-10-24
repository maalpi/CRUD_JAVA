package br.com.ifpb.gerenciador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostraEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramID = request.getParameter("id");
		int id = Integer.valueOf(paramID);
		Banco banco = new Banco();
		Empresa emp = banco.buscaEmpresaPeloId(id);
		
		request.setAttribute("empresa", emp);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
	}

	

}
