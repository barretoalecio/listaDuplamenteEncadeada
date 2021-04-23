package main;

import java.util.Scanner;

import datastructures.Lista;
import models.Passageiro;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.incluirNoFim(new Passageiro("Mikaelle"));
		lista.incluirNoFim(new Passageiro("Larissa"));
		lista.exibirLista();
		lista.removerNoFim();
		System.out.println("\n");
		lista.exibirLista();
		lista.removerNoFim();
		System.out.println("\n");
		lista.exibirLista();
	}
}
