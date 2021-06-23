package View;

import java.util.Scanner;

import Controller.FormaController;
import Models.Circulo;
import Models.Forma;
import Models.Retangulo;
import Models.Triangulo;


public class Principal {
	
	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\n-- PROJETO DE PROVA --\n");
			System.out.println("1 - CadastrarCirculo");
			System.out.println("2 - CadastrarRetangulo");
			System.out.println("3 - CadastrarTriangulo");
			System.out.println("4 - ListarCirculos");
			System.out.println("5 - ListarRetangulos");
			System.out.println("6 - ListarTriangulos");
			System.out.println("7 - ListarTodos");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				Circulo Circulo = new Circulo(20);
				FormaController.CadastrarCirculo(Circulo);
				break;
			case 2:
				FormaController.Listar();
				break;
//			case 3:
//				CadastrarTriangulo.Menu();
//				break;
//			case 4:
//				ListarCirculos.Menu();
//				break;
//			case 5:
//				ListaRetangulos.Menu();
//				break;
//			case 6:
//				ListaTriangulos.Menu();
//				break;
//			case 7:
//				ListarTodos.Menu();
//				break;
			case 0:
				System.out.println("\nSaindo...\n");
				break;
			default:
				System.out.println("\nOpção Inválida!");
				break;

			}

		} while (opcao != 0);

		sc.close();

	}

}



