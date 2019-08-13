package edu.up.bsi.soap.progclient;

import java.util.List;
import java.util.Scanner;

import edu.up.bsi.soap.progserver.ProgressaoCalc;
import edu.up.bsi.soap.progserver.ProgressaoCalcService;

public class Main {

	public static ProgressaoCalc progressao;

	public static void main(String[] args) {

		progressao = new ProgressaoCalcService().getProgressaoCalcPort();

		int option = 0;

		Scanner sc = new Scanner(System.in);

		while (option != 6) {

			System.out.println("PROGRESSÃO ARITMÉTICA:");
			System.out.println("1 - PA:");
			System.out.println("2 - SAIR:");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Opção 1 selecionada.");
				option = 1;

				System.out.println("Opção 1");
				int qtdNumero = 10;
				int razao = 5;
				int vPa = 0;

				int d = 0;

				int[] tamanhoVetor = new int[qtdNumero];

				tamanhoVetor = progressao.progressArit(qtdNumero, razao, vPa);
				System.out.println("boa");

				for (int i = 0; i < tamanhoVetor.length; i++) {
					System.out.println(tamanhoVetor[i]);
				}

				break;

			case 2:
				System.out.println("Opção 2 selecionada.");
				option = 6;
				System.out.println("Upload Com sucesso!");

				break;

			default:
				break;
			}
		}

	}
}