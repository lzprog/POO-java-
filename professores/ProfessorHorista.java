package EX6;

public class ProfessorHorista extends Professor {
	//VAR
	private double val;
	private double tempo;
	//getters and setters
	public void setVal(double val) {
		this.val = val;
	}
	public double getVal() {
		return val;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public double getTempo() {
		return tempo;
	}
	//construtor
	public ProfessorHorista() {
		
	}
	public ProfessorHorista(String nome, String matricula, int dia, int mes, int ano, double val, double tempo) {
		super(nome, matricula, dia, mes, ano);
		this.val = val;
		this.tempo = tempo;
	}
	//métodos
	@Override
	public double getSalario() {
		return val*tempo;
	}
	@Override
	public String exibirDados() {
		return("\n"+super.exibirDados()+"\nHora/Aula: R$"+val+"\nCarga Horária: "+tempo+"horas\nSalario: "+getSalario()+"\n");
	}

}
