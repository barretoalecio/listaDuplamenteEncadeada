package tui;

public class Passageiro {
	
	public Passageiro anterior = null;
	public Passageiro proximo = null;
	public String nome;
	
	public Passageiro getAnterior() {
		return anterior;
	}
	public void setAnterior(Passageiro anterior) {
		this.anterior = anterior;
	}
	public Passageiro getProximo() {
		return proximo;
	}
	public void setProximo(Passageiro proximo) {
		this.proximo = proximo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
