package financeiro;

import java.util.ArrayList;

public class Divida {
	private Integer mes;
	
	private ArrayList<Conta> contas;
	
	public Divida(){
		contas = new ArrayList<>();
	}
	
	public Divida(Integer mes) {
		super();
		this.mes = mes;
		contas = new ArrayList<>();
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public String getListagemContasPagar(){
		Double vlrTotal = 0.0;
		String list = "\n";
		list += "Divida do mês: " + mes + "\n";
		
		String listContas = "";
		int contador = 1;
		for(Conta conta : contas){
			listContas += "\t "+ contador +") Codigo: " + conta.getCodigo() + "\n";
			listContas += "\t    Descricao: " + conta.getDescricao() + "\n";
			listContas += "\t    Valor: " + conta.getValor() + "\n";
			listContas += "-------------------\n\n";
			vlrTotal += conta.getValor();
			
			contador++;
		}
		
		list += "Total a pagar da dívida: " + vlrTotal + "\n";
		list += "Contas: \n\n" + listContas + "\n";
		
		return list;
	}
	
	public void excluirConta(String codigoConta){
		int idxContaRemover = 0;
		
		for(Conta conta: contas){
			if(conta.getCodigo().equals(codigoConta)){
				idxContaRemover = contas.indexOf(conta);
				break;
			}
		}
		
		contas.remove(idxContaRemover);
	}
}
