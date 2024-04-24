package models;

import java.util.Scanner;

public class Casa extends Imovel {

	public Casa(String endereco, double preco, double largura, double comprimento, String descricao) {
		super(endereco, preco, largura, comprimento, descricao);
	}

	@Override
	public double calcularArea() {

		return (getComprimento() * getLargura());
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "\nEndereco da Casa: " + getEndereco() + "\nPreco: " + getPreco() + "\nDescricao: " + getDescricao()
				+ "\nComprimento: " + getComprimento() + "\nLargura: " + getLargura() + "\nArea: " + calcularArea()
				+ "\n";
	}

}
