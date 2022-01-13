package com.dio.base;

public class Main {

	static String nomeMes = "";
	static int numMes = 3;		

	
	public static void main(String[] args) {

		int numMes = 3;		
		if(numMes == 1) {
			nomeMes = "Janeiro";
		} else if(numMes == 2) {
			nomeMes = "Fevereiro";
		} else if(numMes == 3) {
			nomeMes = "Março";
		} else if(numMes == 4) {
			nomeMes = "Abril";
		} else if(numMes == 5) {
			nomeMes = "Maio";
		} else if(numMes == 6) {
			nomeMes = "Junho";
		} else if(numMes == 7) {
			nomeMes = "Julho";
		} else if(numMes == 8) {
			nomeMes = "Agosto";
		} else if(numMes == 9) {
			nomeMes = "Setembro";
		} else if(numMes == 10) {
			nomeMes = "Outubro";
		} else if(numMes == 11) {
			nomeMes = "Novembro";
		} else if(numMes == 12) {
			nomeMes = "Dezembro";
		} else {
			System.out.println("Valor inválido.");
		}
		
		System.out.println("O mês de número " + numMes + " é " + nomeMes + ".");

		if(numMes == 1 || numMes == 8 || numMes == 12) {
			System.out.println("Você está de férias.");
		} else if (numMes >= 1 && numMes <= 12) {
			System.out.println("Você não está de férias.");
		} else {
			System.out.println("Valor inválido.");
		}
	}

}
