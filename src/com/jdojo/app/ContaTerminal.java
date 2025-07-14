package com.jdojo.app;
import java.util.Scanner;
public class ContaTerminal{
	public static void main(String args[]) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, digite o número da agência: ");
		int Numero = scanner.nextInt();
		System.out.println("Digite o código da agência: ");
		String Agencia = scanner.next();	
		System.out.println("Digite o seu nome: ");
		scanner.nextLine();
		String Nome = scanner.nextLine();
		double Saldo = 237.48;
		System.out.println("\n");
		var Resposta = "Olá " + Nome +", obrigado por criar uma conta em nosso banco. \nSua agência é " + Agencia +", conta " + Numero + " e seu saldo de " + Saldo + " já está disponível para saque.";
		System.out.println(Resposta);
		scanner.close();
	}
}