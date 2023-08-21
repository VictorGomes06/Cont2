package util;

public class Calculo {
	private double saldo;
	private double deposito;
	private String nomeProdutos;
	private double valorProduto;
	private double despesas;

	// Método para adcionar valor
	public void addSaldo(double saldo) {
		this.saldo += saldo;

	}

	// Método para remover saldo
	public void removeSaldo(double saldo) {
		this.saldo -= saldo;
	}

	public void compraProduto() {
		if (valorProduto <= saldo) {
			saldo -= valorProduto;
		}
	}

	public void Comparador() {
		if (valorProduto > saldo) {
			System.out.println("saldo insufisiente ");
		} else {
			compraProduto();
		}
	}

	public double VerificarSaldo() {
		if (saldo <= 0) {
			System.out.println("saldo insufisiente :");
		}
		return VerificarSaldo();
	}

	public void Despesas(double valorProduto) {
		despesas += valorProduto;
	}

	public double TotalDespesas() {
		return despesas;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public double getDepesas() {
		return despesas;
	}

	public void setDepesas(double depesas) {
		this.despesas = depesas;
	}

	public String getNomeProdutos() {
		return nomeProdutos;
	}

	public void setNomeProdutos(String nomeProdutos) {
		this.nomeProdutos = nomeProdutos;
	}

}
