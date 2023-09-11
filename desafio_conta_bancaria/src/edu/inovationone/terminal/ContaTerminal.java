package edu.inovationone.terminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Por favor, digite o número da Conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Por favor, digite o número da Agência: ");
		String numeroAgencia = sc.next();
		sc.nextLine();
		System.out.print("Por favor, digite o nome do cliente: ");
		String nomeCLiente = sc.nextLine();
		System.out.print("Digite o valor de depósito inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá "+ nomeCLiente + ", obrigado por criar uma conta em nosso banco, sua"
				+ " agencia é "+ numeroAgencia + ", conta "+numeroConta+" e seu saldo "+ saldo + 
				" já está disponível para saque");
		
		sc.close();
	}

}
