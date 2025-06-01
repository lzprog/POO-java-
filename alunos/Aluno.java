package EX3;

public class Aluno {
	//VAR
	private String nome = "Leonardo";
	private int idade = 15;
	private String matricula = "969999969";
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Aluno(String nome, int idade, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	
	//métodos
	public String toString() {
		return("nome: "+this.nome + "matricula: "+this.matricula + "idade: "+this.idade);
	}
	
}





