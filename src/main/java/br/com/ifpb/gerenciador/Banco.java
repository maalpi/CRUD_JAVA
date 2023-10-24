package br.com.ifpb.gerenciador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	public static List<Empresa> listaEmpresas = new ArrayList<Empresa>();;

	static {
		Empresa IFPB = new Empresa("IFPB", "12345");
		Empresa LATIN = new Empresa("LATIN", "54321");
		listaEmpresas.add(IFPB);
		listaEmpresas.add(LATIN);
	}

	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);

	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}
	
	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = listaEmpresas.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa emp : listaEmpresas) {
			if(emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

}
