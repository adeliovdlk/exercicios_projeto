package delio.psw.arquivo;

	import java.io.Serializable;

	public class Politico implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private String partido;
	private String nome;
	private int numero;
	
	public Politico(String partido, String nome, int numero) {
		this.partido = partido;
		this.nome = nome;
		this.numero = numero;
	}
	public Politico() {
		this.partido = "";
		this.nome = "";
		this.numero = 0;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	@Override
	public String toString() {
		return "Politico [partido=" + partido + ", nome=" + nome + ", numero=" + numero + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
