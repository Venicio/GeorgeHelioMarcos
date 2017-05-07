package pessoal;

import java.util.ArrayList;

import financeiro.Conta;
import financeiro.Divida;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	
	private ArrayList<Divida> dividas;
	
	public Usuario(){
		
	}
	
	public Usuario(String nome, String email, String senha, String cpf) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.dividas = new ArrayList<>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Divida> getDividas() {
		return dividas;
	}
	
	public Divida getDivida(int mes) {
		Divida dividaMes = null;
		
		for (Divida divida : dividas) {
			if(divida.getMes().equals(mes)){
				dividaMes = divida;
				break;
			}
		}
		
		return dividaMes;
	}

	public void setDividas(ArrayList<Divida> dividas) {
		this.dividas = dividas;
	}
	
	public Conta getContaPorCodigo(String codigo){
		Conta encontrada = null;
		
		for (Divida divida : dividas) {
			for (Conta conta : divida.getContas()) {
				if(conta.getCodigo().equals(codigo)){
					encontrada = conta;
				}
			}
		}
		
		return encontrada;
	}
}