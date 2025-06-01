package EX51;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//VAR
		Scanner sc = new Scanner(System.in);
		ArrayList<Transporte>lista = new ArrayList<>();
		int menu = 0;
		int aux = 0;

		while(menu != 5) {
			//MENU
			System.out.println("\nO que deseja fazer? ");
			System.out.println("1.Adicionar onibus\n2.Adicionar metro\n3.Adicionar bicicleta\n4.Exibir Dados\n5.Sair\n");
			menu = sc.nextInt();
			sc.nextLine();
			//OPÇÕES
			if(menu == 1) {
				String type = "Ônibus";
				System.out.println("\n1.Local\n2.Intermunicipal\n");
				aux = sc.nextInt();
				sc.nextLine();
				boolean inter = false;
				if(aux == 2) {
					inter = true;
				}
				Transporte novo_onibus = new Onibus(type, inter);
				lista.add(novo_onibus);
			}
			else if(menu == 2) {
				String type = "Metro";
				System.out.println("\nQuantas estações percorridas? ");
				int cont = sc.nextInt();
				sc.nextLine();
				Transporte novo_metro = new Metro(type, cont);
				lista.add(novo_metro);
			}
			else if(menu == 3) {
				String type = "Bicicleta compartilhada";
				System.out.println("\nQuantas horas de uso? ");
				double tempo = sc.nextDouble();
				sc.nextLine();
				Transporte novo_bicicleta = new Bicicleta(type, tempo);
				lista.add(novo_bicicleta);
			}
			else if(menu == 4) {
				for(Transporte t: lista) {
					t.calculaTarifa();
					System.out.print(t.exibirDetalhes());
				}
			}
		}
		sc.close();
		System.out.println("FIM");
	}
}
