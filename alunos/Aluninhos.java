package EX3;
import java.util.ArrayList;
import java.util.Scanner;


public class Aluninhos {

	public static void main(String[] args) {
		//var
		int n = 0;
		int achei = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno>lista = new ArrayList<>();
		
		while(n != 5) {
			System.out.println("O que deseja fazer ?");
			System.out.println("1.Cadastro\n2.Remover\n3.Busca\n4.Exibir alunos\n5.Sair");
			n = sc.nextInt();
			sc.nextLine();
			
			if(n == 1) {
				System.out.println("Nome do aluno? ");
				String nome = sc.nextLine();
				System.out.println("Idade do aluno? ");
				int idade = sc.nextInt();
				sc.nextLine();
				System.out.println("Matricula? ");
				String matricula = sc.nextLine();
				Aluno novo_aluno = new Aluno(nome, idade, matricula);
				lista.add(novo_aluno);
			}
			
			else if(n == 2) {
				System.out.println("Matricula para remoção? ");
				String remover = sc.nextLine();
				for(Aluno a: lista) {
					if(a.getMatricula().equals(remover)) {
						lista.remove(a);
					}
				}
			}
			else if(n == 3) {
				
				System.out.println("Matricula para busca? ");
				String buscar = sc.nextLine();
				for(Aluno a: lista) {
					if(a.getMatricula().equals(buscar)) {
						System.out.println("Cadastro encontrado !");
						System.out.println(a);
						achei = 1;
					}
				}
				if(achei == 0) {
					System.out.println("Cadastro não encontrado !");
				}
				achei = 0; // retornando o contador pra origem
			}
			else if(n == 4) {
				for(Aluno a: lista) {
					System.out.println(a);
				}
			}
		}
		sc.close();
		System.out.println("FIM !");
	}

}
