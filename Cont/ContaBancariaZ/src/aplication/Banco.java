package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculo;

public class Banco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculo dados = new Calculo();

		int escolha;
		double valor;

		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 > Depositar valor");
			System.out.println("2 > Remover valor");
			System.out.println("3 > Adicionar produto");
			System.out.println("4 > despesas");
			System.out.println("5 > Consultar saldo");
			System.out.println("6 > Encerrar");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite o valor a ser adicionado: ");
				valor = sc.nextDouble();
				dados.addSaldo(valor);

				break;
			case 2:
				System.out.println("Digite o valor a ser removido: ");
				valor = sc.nextDouble();
				dados.removeSaldo(valor);

				break;

			case 3:
				System.out.println("Nome do produto : ");
				String nomeProduto = sc.next();
				dados.setNomeProdutos(nomeProduto);
				System.out.println("Valor do produto : ");
				double valorProduto = sc.nextDouble();
				dados.setValorProduto(valorProduto);
				dados.compraProduto();
				dados.Comparador();
				dados.Despesas(valorProduto);
				break;

			case 4:
				System.out.println(dados.getDepesas());
				break;

			case 5:
				System.out.println("Saldo atual :" + dados.getSaldo());
				break;

			case 6:
				System.out.println("Xauuuuuuuuuu obrigadoooooo.");
				break;
			default:
				System.out.println("Tente novamente.");
				break;
			}
		} while (escolha != 4);

		sc.close();
	}
}
