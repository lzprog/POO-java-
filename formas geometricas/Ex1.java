package EX1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//VAR
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		//INSERIR O DOUBLE COM VIRGULA
		//LEITURA PARA INTERAÇÃO
		System.out.print("Digite a altura r1: ");
		r1.setAltura(sc.nextDouble());
		System.out.print("Digite a largura r1: ");
		r1.setLargura(sc.nextDouble());
		System.out.print("Digite a altura r2: ");
		r2.setAltura(sc.nextDouble());
		System.out.print("Digite a largura r2: ");
		r2.setLargura(sc.nextDouble());
		
		//IMPRESSÃO DE DADOS (INFORMADOS E MANIPULADOS)
		System.out.println("RETANGULO 1 -----------X");
		r1.imprimir();
		r1.CalculaArea();
		r1.CalculaPerimetro();
		System.out.println("RETANGULO 2 -----------X");
		r2.imprimir();
		r2.CalculaArea();
		r2.CalculaPerimetro();
		
		
		sc.close();
		
	}

}



