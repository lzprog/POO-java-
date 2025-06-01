package EX4;

public class Diretor {
	//VAR 
	private String nome;
	private int exptempo;
	private String local;
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getExptempo() {
		return exptempo;
	}
	public void setExptempo(int exptempo) {
		this.exptempo = exptempo;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	//CONSTRUTORES
	public Diretor() {
		
	}
	public Diretor(String nome, int exptempo, String local) {
		this.nome = nome;
		this.exptempo = exptempo;
		this.local = local;
	}
	//METODOS
	public String toString() {
		return("\n"+"nome: "+nome+"\n"+"experiencia: "+exptempo+" anos\n"+"nacionalidade: "+local);
	}
}
