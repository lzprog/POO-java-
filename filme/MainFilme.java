package EX4;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFilme {

	public static void main(String[] args) {
		//VAR
		Scanner sc = new Scanner(System.in);
		ArrayList<Filme>lista = new ArrayList<>();
		int menu = 0;
		
		while(menu != 4) {
			System.out.println("\nO QUE DESEJA FAZER?\n1.Cadastro\n2.Busca\n3.Mostrar Lista\n4.Sair\n");
			menu = sc.nextInt();
			sc.nextLine();
			if(menu == 1) {
				System.out.println("Qual nome do filme? ");
				String title = sc.nextLine();
				System.out.println("Qual descrição do filme? ");
				String desc = sc.nextLine();
				System.out.println("Qual tempo do filme em minutos? ");
				int tempo = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual nome do diretor filme? ");
				String namedir = sc.nextLine();
				System.out.println("Quanto tempo de experiência em anos? ");
				int tempodir = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual local de origem do diretor do filme? ");
				String localdir = sc.nextLine();
				Filme novo_filme = new Filme(title, desc, tempo, namedir, tempodir, localdir);
				lista.add(novo_filme);
			}
			else if(menu == 2) {
				System.out.println("Qual nome do filme para busca? ");
				String busca = sc.nextLine();
				int cont = 0;
				for(Filme f:lista) {
					if(f.buscaFilme(busca) == true) {
						System.out.println(f);
						cont = 1;
					}
				}
				if(cont == 0) {
					System.out.println("\nCadastro não encontrado !\n");
				}
			}
			else if(menu == 3) {
				for(Filme f:lista) {
					System.out.println(f.getTitle());
					f.exibirDuracaoEmHoras();
				}
			}
		}
		System.out.println("FIM");
		sc.close();
	}

}
