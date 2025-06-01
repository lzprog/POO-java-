package EX2;
import java.util.Scanner;

public class CadastroClientes {

    public static void main(String[] args) {
        // VAR
        int n = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[50];
        
        while (n != 4) {
            System.out.println("O que deseja fazer? ");
            System.out.println("1. Cadastrar cliente  2. Buscar pelo nome  3. Exibir dados dos clientes  4. Sair");
            n = sc.nextInt();
            sc.nextLine();

            if (n == 1) {
                System.out.print("Digite o cod: ");
                String cod = sc.nextLine();
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.print("Digite o cpf: ");
                String cpf = sc.nextLine();
                System.out.print("Digite o tel: ");
                String tel = sc.nextLine();

                clientes[i] = new Cliente(cod, nome, cpf, tel);
                i++;
            } else if (n == 2) {
                System.out.print("Digite o nome que deseja buscar: ");
                String busca = sc.nextLine();
                boolean encontrado = false;

                for (int j = 0; j < i; j++) {
                    if (clientes[j] != null && clientes[j].Busca_Cliente(busca)) {
                        System.out.println("Cadastro encontrado!");
                        clientes[j].imprimir();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Cadastro não encontrado!");
                }
            } else if (n == 3) { 
                for (int x = 0; x < i; x++) {
                    if (clientes[x] != null) {
                        clientes[x].imprimir();
                    }
                }
            }
        }
        sc.close();
        System.out.println("FIM!");
    }
}
