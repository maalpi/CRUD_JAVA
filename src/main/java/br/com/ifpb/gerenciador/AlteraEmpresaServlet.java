package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraEmpresaServlet
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlteraEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramNomeEmpresa = (String) request.getParameter("nome");
		String paramCnpjEmpresa = (String) request.getParameter("cnpj");
		String paramData = (String) request.getParameter("data");
		String paramID = (String) request.getParameter("id");
		Integer id = Integer.valueOf(paramID);
		
		Date dataAbertura = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramData);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		Banco banco = new Banco();
		Empresa emp = banco.buscaEmpresaPeloId(id);
		emp.setNome(paramNomeEmpresa);
		emp.setCnpj(paramCnpjEmpresa);
		emp.setDataAbertura(dataAbertura);
		
		response.sendRedirect("listaEmpresas");
		
		
	}

}
