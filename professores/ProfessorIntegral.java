package EX6;

public class ProfessorIntegral extends Professor {
	//VAR
	private double salario;
	//getters and setters 
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public ProfessorIntegral() {
		
	}
	public ProfessorIntegral(String nome, String matricula, int dia, int mes, int ano, double salario) {
		super(nome, matricula, dia, mes, ano);
		this.salario = salario;
	}
	//métodos
	@Override
	public String exibirDados() {
		return("\n"+super.exibirDados()+"\nSalario: "+salario);
	}

}
