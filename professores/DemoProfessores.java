package EX6;

import java.util.Scanner;

public class DemoProfessores {

	public static void main(String[] args) {
		//var
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos professores deseja cadastrar?");
		int n = sc.nextInt();
		sc.nextLine();
		Professor[] lista = new Professor[n];
		//menu
		int i = 0;
		while(menu != 4) {
			System.out.println("O que deseja? 1.Cadastrar integral\n2.Cadastrar Horista\n3.Exibir lista\n4.Sair");
			menu = sc.nextInt();
			sc.nextLine();
			if(menu == 1) {
				System.out.println("Qual nome do professor? ");
				String nome = sc.nextLine();
				System.out.println("Qual matricula do professor? ");
				String matricula = sc.nextLine();
				System.out.println("Qual dia de nasc. do professor? ");	
				int dia = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual mes de nasc. do professor? ");
				int mes = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual ano de nasc. professor? ");
				int ano = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual salário do professor? ");
				double salario = sc.nextDouble();
				sc.nextLine();
				Professor novo_integral = new ProfessorIntegral(nome, matricula, dia, mes, ano, salario);
				lista[i] = novo_integral;
				i++;
			}
			else if(menu == 2) {
				System.out.println("Qual nome do professor? ");
				String nome = sc.nextLine();
				System.out.println("Qual matricula do professor? ");
				String matricula = sc.nextLine();
				System.out.println("Qual dia de nasc. do professor? ");	
				int dia = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual mes de nasc. do professor? ");
				int mes = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual ano de nasc. professor? ");
				int ano = sc.nextInt();
				sc.nextLine();
				System.out.println("Qual Hora/Aula do professor? ");
				double val = sc.nextDouble();
				sc.nextLine();
				System.out.println("Quantas horas dando aula? ");
				double tempo = sc.nextDouble();
				sc.nextLine();
				Professor novo_horista = new ProfessorHorista(nome, matricula, dia, mes, ano, val, tempo);
				lista[i] = novo_horista;
				i++;
			}
			else if(menu == 3) {
				for(int j = 0; j < i; j++) {
					if(lista[j] != null) {
						System.out.println(lista[j].exibirDados());
					}
				}
			}
		}
		sc.close();
	}
}
