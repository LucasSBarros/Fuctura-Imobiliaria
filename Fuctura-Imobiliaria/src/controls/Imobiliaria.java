package controls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Casa;
import models.Loja;
import models.Predio;

public class Imobiliaria {

	private List<Construcao> construcoes;

	public Imobiliaria() {

		this.construcoes = new ArrayList<>();

	}

	public void adicionarConstrucao(Construcao construcao) {

		construcoes.add(construcao);

		System.out.println("Construção adicionada com Sucesso!");

	}

	public void removerConstrucao(Construcao construcao) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ID do Imóvel que deseja remover: ");
				
		int id = sc.nextInt();
		
		construcoes.remove(construcoes.get(id));

		System.out.println("Construção removida com Sucesso!");

	}

	public void listarConstrucoes() {

			System.out.println(construcoes.toString());
			
	}

	public double informarArea() {

		double areaTotal = 0.0;

		for (Construcao construcao : construcoes) {

			areaTotal += construcao.calcularArea();

		}

		return areaTotal;

	}

	public List<Construcao> getConstrucoes() {
		return construcoes;
	}

	public void setConstrucoes(List<Construcao> construcoes) {
		this.construcoes = construcoes;
	}

}
