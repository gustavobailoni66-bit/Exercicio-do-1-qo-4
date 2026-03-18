package aulaCondicional;

import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		// Cadastro (dados do usuário)
		System.out.print("Cadastre um CPF: ");
		String cpfCorreto = ler.nextLine();

		System.out.print("Cadastre uma senha: ");
		String senhaCorreta = ler.nextLine();

		System.out.print("Digite o saldo inicial: ");
		double saldo = ler.nextDouble();
		ler.nextLine(); // limpar buffer

		// Login
		System.out.print("\nDigite o CPF: ");
		String cpf = ler.nextLine();

		System.out.print("Digite a senha: ");
		String senha = ler.nextLine();

		if (cpf.equals(cpfCorreto) && senha.equals(senhaCorreta)) {

		System.out.print("Digite o valor do saque: ");
		double saque = ler.nextDouble();

		if (saque <= saldo) {
		saldo -= saque;
		System.out.println("Saque realizado com sucesso!");
		System.out.println("Saldo restante: " + saldo);
		} else {
		System.out.println("Saldo insuficiente.");
		}

		} else {
		System.out.println("CPF ou senha incorretos.");
		}

		ler.close();
}
}