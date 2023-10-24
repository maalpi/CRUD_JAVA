package br.com.ifpb.gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RemoveEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramID = request.getParameter("id");
		int id = Integer.valueOf(paramID);
		System.out.println("Removendo a empresa ID - " + id);
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		response.sendRedirect("listaEmpresas");
	}

	

}
