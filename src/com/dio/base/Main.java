package com.dio.base;

public class Main {

	static int numMes = 3;
	static String nomeMes;
	
	static String nomeDia = "Terça-feira";
	static int numDia;
	
	static int n = 4;
	static String mensagem;

	public static void main(String[] args) {

		// 01) Descobrir o nome do mês
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

		// 02) Descobrir se está de férias
		
		if(numMes == 1 || numMes == 8 || numMes == 12) {
			System.out.println("Você está de férias.");
		} else if (numMes >= 1 && numMes <= 12) {
			System.out.println("Você não está de férias.");
		} else {
			System.out.println("Valor inválido.");
		}
		
		// 03) Descobrir o número do dia
		
		switch(nomeDia) {
		case "Domingo":
			numDia = 1;
			break;
		case "Segunda-feira":
			numDia = 2;
			break;
		case "Terça-feira":
			numDia = 3;
			break;
		case "Quarta-feira":
			numDia = 4;
			break;
		case "Quinta-feira":
			numDia = 5;
			break;
		case "Sexta-feira":
			numDia = 6;
			break;
		case "Sábado":
			numDia = 7;
			break;
		default:
			System.out.println("Valor inválido.");
			break;
		}
		
		System.out.println("O dia " + nomeDia + " é o dia de número " + numDia + ".");
		
		// 04) Exercício com switch-case
		
		switch(n) {
		case 1:
			mensagem = "Certo";
			break;
		case 2:
			mensagem = "Certo";
			break;
		case 3:
			mensagem = "Certo";
			break;
		case 4:
			mensagem = "Errado";
			break;
		case 5:
			mensagem = "Talvez";
			break;
		default:
			System.out.println("Valor inválido.");
		}
		
		System.out.println(mensagem);
	}

}
