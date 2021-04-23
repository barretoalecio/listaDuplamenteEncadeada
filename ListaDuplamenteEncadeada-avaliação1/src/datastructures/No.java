package datastructures;

import models.Passageiro;

public class No {
	private No ant;
	private No prox;
	private Passageiro content;

	 public No(Passageiro content2) {
	        this.content = content2;
	        this.ant = null;
	        this.prox = null;
	 }

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public Passageiro getContent() {
		return content;
	}

	public void setContent(Passageiro content) {
		this.content = content;
	}
	 
	 
}
