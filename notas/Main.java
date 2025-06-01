package EX7;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		//VAR
		Scanner sc = new Scanner(System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		//op
		String nota1Input = JOptionPane.showInputDialog(null, "NOTA1? (EX: 6.5) ", "Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
		if(nota1Input != null) {
			nota1 = Double.parseDouble(nota1Input);
		}
		String nota2Input = JOptionPane.showInputDialog(null, "NOTA2? (EX: 6.5) ", "Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
		if(nota2Input != null) {
			nota2 = Double.parseDouble(nota2Input);
		}
		
		Notas n = new Notas(nota1, nota2);
		n.calculaMedia(nota1, nota2);
		
		
		JOptionPane.showMessageDialog(null, n.exibirDados(), "Dados: ", JOptionPane.INFORMATION_MESSAGE);

		sc.close();
		

	}

}
