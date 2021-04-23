package main;

import entitie.ListaDuplamenteEncadeada;
import java.util.Scanner;

public class Principal {

	static ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String dado;
		char operacao, tipo = 'e';

		do {
			System.out.println("Para incluir digite [i] \nPara remover digite [r]");
			do {
				dado = scanner.nextLine();
				operacao = dado.charAt(0);
				operacao = Character.toLowerCase(operacao);
			} while (operacao != 'i');
			if (operacao == 'i') {
				do {
					System.out.println("Digite [e] para esquerda"
							+ "\nDigite [d] para direita");
					dado = scanner.nextLine();
					tipo = dado.charAt(0);
					tipo = Character.toLowerCase(tipo);
				} while (tipo != 'e' && tipo != 'd');
			} 
			switch(operacao) {
			case 'i': {
				System.out.println("Informe o nome do passageiro: ");
				dado = scanner.nextLine();
				if (tipo == 'e') {
					lista.incluirEsquerda(dado);
				} else {
					lista.incluirDireita(dado);
				} break;
			}
			case 'r': {
				System.out.println("Informe o nome do passageiro que deseja remover: ");
				dado = scanner.nextLine();
				lista.removerPassageiro(dado);
				break;
			}
			} 
		} while(operacao != 'f');
		lista.exibirLista();
		System.exit(0);
	}

}
