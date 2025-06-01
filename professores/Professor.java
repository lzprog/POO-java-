package EX6;

public abstract class Professor {
	//VAR
	private String nome;
	private String matricula;
	private Data dtnasc;
	//GETTERS AND SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public Professor() {
		
	}
	public Professor(String nome, String matricula, int dia, int mes, int ano) {
		this.nome = nome;
		this.matricula = matricula;
		this.dtnasc = new Data(dia, mes, ano);
	}
	//MÉTODOS
	public abstract double getSalario();
	public String exibirDados() {
		return("\nNome: "+nome+"\nMatricula: "+matricula+"\nNasc.: "+dtnasc);
	}

}
