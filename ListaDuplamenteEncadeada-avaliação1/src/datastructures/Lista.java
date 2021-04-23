package datastructures;

import datastructures.interfaces.ILista;
import models.Passageiro;

public class Lista implements ILista<Passageiro> {
	
	private No inicio;
	private No fim;
	private Long tamanho;
	
	public Lista() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0l;
	}

	@Override
	public void incluirNoFim(Passageiro content) {
		No no = new No(content);
		no.setProx(null);
		no.setAnt(null);
		if(isEmpty()) {
			this.inicio = no;
			this.fim = no;
		}
		fim.setProx(no);
		no.setAnt(fim);
		no.setProx(null);
		this.fim = no;
		this.tamanho++;
	}

	@Override
	public void removerNoFim() {
		if(isEmpty()) {
			System.out.println("Lista Vázia");
		} else {
			if(inicio.getProx() == null) {
				inicio = null;
			}
			this.fim = fim.getAnt();
			this.fim.setProx(null);
		}
	}

	
	@Override
	public void exibirLista() {
		No aux = inicio;
		if(isEmpty()) {
			System.out.println("Lista vázia");
		} else {
		while(aux != null) {
			System.out.println(aux.getContent().toString());
			aux = aux.getProx();
			}
		}
	}

	private boolean isEmpty() {
		return inicio == null;
	}
	
}
