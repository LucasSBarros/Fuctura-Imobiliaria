package models;

import controls.Construcao;

public abstract class Imovel implements Construcao {

	private String endereco;
	protected String descricao;
	private double preco, largura, comprimento;

	public Imovel(String endereco, double preco, double largura, double comprimento, String descricao) {

		this.endereco = endereco;
		this.preco = preco;
		this.largura = largura;
		this.comprimento = comprimento;
		this.descricao = descricao;
	}

	public abstract double calcularArea();

	public abstract String getDescricao();

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
