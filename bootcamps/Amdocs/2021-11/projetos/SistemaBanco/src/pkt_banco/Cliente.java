package pkt_banco;

public class Cliente {
	
	protected String nome;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
 