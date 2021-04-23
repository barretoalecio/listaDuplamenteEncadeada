package entitie;

import tui.Passageiro;

public class ListaDuplamenteEncadeada {

	public Passageiro primeiro = null;
	public Passageiro ultimo = null;
	public Integer contador = 0;
	
	public void incluirEsquerda(String cadastroNome) {
		Passageiro passageiro = new Passageiro();
		passageiro.nome = cadastroNome;
		
		if (contador == 0) {
			primeiro = passageiro;
			ultimo = passageiro;
			passageiro.anterior = null;
		} else {
			passageiro.proximo = primeiro;
			primeiro = passageiro;
		}
		contador++;
	}
	
	public void incluirDireita(String cadastroNome) {
		Passageiro passageiro = new Passageiro();
		passageiro.nome = cadastroNome;
		Passageiro extra;
		
		if (contador == 0) {
			primeiro = passageiro;
			ultimo = passageiro;
			passageiro.anterior = null;
		} else {
			extra = ultimo;
			extra.proximo = passageiro;
			passageiro.anterior = extra;
			passageiro.proximo = null;
			ultimo = passageiro;
		}
		contador++;
	}
	
	public void exibirLista() {
		Passageiro auxiliar = primeiro;
		
		System.out.println("Conteúdo da lista encadeada: ");
		
		if(auxiliar != null) {
			while(auxiliar != null) {
				System.out.println("Nome do passageiro: " + auxiliar.nome);
				auxiliar = auxiliar.proximo;
			}
		} else {
			System.out.println("A lista de passageiros está vazia!");
		}
	}
	
	public void removerPassageiro(String removerNome) {
		Passageiro passageiroAnterior = null;
		Passageiro ponteiro;
		
		if(primeiro == null) {
			System.out.println("A lista de passageiros está vazia!");
		} else if (primeiro.nome == removerNome) {
			if (primeiro.proximo != null) {
				primeiro.proximo.anterior = null;
				primeiro = primeiro.proximo;
			} else {
				primeiro = null;
				System.out.println("Passageiro removido!");
			} 
		} else if (primeiro.nome != removerNome && primeiro.proximo == null) {
			System.out.println("O passageiro não foi encontrado na lista!");
		}
		
		ponteiro = primeiro;
		
		while(ponteiro.proximo != null && ponteiro.nome != removerNome) {
			passageiroAnterior = ponteiro;
			ponteiro = ponteiro.proximo;
		}
		if(ponteiro.nome == removerNome) {
			passageiroAnterior.proximo = passageiroAnterior.proximo.proximo;
			
			if(passageiroAnterior.proximo != null) {
				passageiroAnterior.proximo.anterior = passageiroAnterior;
			} else {
				ultimo = passageiroAnterior;
				ponteiro = null;
			}
		} else {
			System.out.println("O passageiro não foi encontrado na lista!");
		}
	}
}
