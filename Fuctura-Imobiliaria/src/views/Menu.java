package views;

import java.util.Scanner;

import models.Casa;
import models.Loja;
import models.Predio;

import controls.Imobiliaria;

public class Menu {

	Imobiliaria imob = new Imobiliaria();

	Scanner sc = new Scanner(System.in);

	public void interfaceUsuario() {

		System.out.println("Bem vindo a Imobiliaria Fuctura!");

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Adicionar Construção\n"
				+ "Opção 2: Remover Construção\n" + "Opção 3: Listar Construções\n" + "Opção 4: Informar Área Total\n"
				+ "Opção 5: Encerrar\n");

		int opcao = sc.nextInt();

		if (opcao == 1) {

			System.out.println("Que tipo de construção você deseja adicionar ao catálogo?");
			System.out.println("1 - Casa; 2 - Loja; 3 - Prédio");

			int resposta = sc.nextInt();
			sc.nextLine();

			if (resposta == 1) {

				System.out.println("Informe o endereço da Casa:");
				String endereco = sc.nextLine();
				System.out.println("Informe o preço da Casa:");
				double preco = sc.nextDouble();
				System.out.println("Informe a largura da Casa:");
				double largura = sc.nextDouble();
				System.out.println("Informe o comprimento da Casa:");
				double comprimento = sc.nextDouble();
				sc.nextLine();
				System.out.println("Informe uma descrição para da Casa:");
				String descricao = sc.nextLine();

				imob.adicionarConstrucao(new Casa(endereco, preco, largura, comprimento, descricao));

			} else if (resposta == 2) {

				System.out.println("Informe o endereço da Loja:");
				String endereco = sc.nextLine();
				System.out.println("Informe o preço da Loja");
				double preco = sc.nextDouble();
				System.out.println("Informe a largura da Loja");
				double largura = sc.nextDouble();
				System.out.println("Informe o comprimento da Loja");
				double comprimento = sc.nextDouble();
				sc.nextLine();
				System.out.println("Informe uma descrição para a Loja");
				String descricao = sc.nextLine();

				imob.adicionarConstrucao(new Loja(endereco, preco, largura, comprimento, descricao));

			} else if (resposta == 3) {

				System.out.println("Informe o endereço do Prédio:");
				String endereco = sc.nextLine();
				System.out.println("Informe o preço do Prédio");
				double preco = sc.nextDouble();
				System.out.println("Informe a largura do Prédio");
				double largura = sc.nextDouble();
				System.out.println("Informe o comprimento do Prédio");
				double comprimento = sc.nextDouble();
				sc.nextLine();
				System.out.println("Informe uma descrição para o Prédio");
				String descricao = sc.nextLine();

				imob.adicionarConstrucao(new Predio(endereco, preco, largura, comprimento, descricao));

			} else {

				System.out.println("opcao inválida!\n");
				interfaceUsuario();
			}

			interfaceUsuario();

		} else if (opcao == 2) {

			imob.removerConstrucao(null);

			interfaceUsuario();

		} else if (opcao == 3) {

			imob.listarConstrucoes();

			interfaceUsuario();

		} else if (opcao == 4) {

			double areaTotal = imob.informarArea();
			
			System.out.println("Área total dos imóveis cadastrados: " + areaTotal);
			
			interfaceUsuario();

		} else if (opcao == 5) {

			System.out.println("Encerrando ...\n");

		} else {

			System.out.println("Opção inválida!, tente novamente\n");

			interfaceUsuario();

		}

	}

}
