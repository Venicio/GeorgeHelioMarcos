package financeiro;


public class Conta {
	private String codigo;
	private String descricao;
	private Double valor;
	private String dtVencimento;
	
	private Divida divida = new Divida();
	
	public Conta(){
		
	}
	
	public Conta(String codigo, String descricao, Double valor, String dtVencimento, Divida divida) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.dtVencimento = dtVencimento;
		this.divida = divida;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Divida getDivida() {
		return divida;
	}

	public void setDivida(Divida divida) {
		this.divida = divida;
	}
}
