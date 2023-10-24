package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NovaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NovaEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeEmpresa = (String) req.getParameter("nome");
		String cnpjEmpresa = (String) req.getParameter("cnpj");
		String paramData = (String) req.getParameter("data");
		
		Date dataAbertura = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramData);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		Empresa emp = new Empresa(nomeEmpresa, cnpjEmpresa);		
		emp.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(emp);
		req.setAttribute("nomeEmpresa", nomeEmpresa);
		
		resp.sendRedirect("listaEmpresas");

		//chamar o JSP = NovaEmpresaCriada.jsp
		//RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
		//rd.forward(req, resp);
		
	}

}
