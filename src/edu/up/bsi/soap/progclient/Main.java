package edu.up.bsi.soap.progclient;

import java.util.Scanner;

import edu.up.bsi.soap.progserver.ProgressaoCalc;
import edu.up.bsi.soap.progserver.ProgressaoCalcService;

public class Main {

	public static ProgressaoCalc progressao;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		progressao = new ProgressaoCalcService().getProgressaoCalcPort();

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

	}
}