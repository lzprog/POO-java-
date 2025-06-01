package EX4;

public class Filme {
	//VAR
	private String title;
	private String desc;
	private int tempo;
	private Diretor dir;
	//GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Diretor getDir() {
		return dir;
	}
	public void setDir(Diretor dir) {
		this.dir = dir;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	//CONSTRUTORES
	public Filme() {
		
	}
	public Filme(String title, String desc, int tempo, String nome, int exptempo, String local) {
		this.title = title;
		this.desc = desc;
		this.tempo = tempo;
		dir = new Diretor(nome, exptempo, local);
	}
	//MÉTODOS
	void exibirDuracaoEmHoras() {
		int aux = 0;
		int mins = 0;
		int hours = 0;
		aux = tempo;
		while(tempo > 60) {
			tempo = tempo - 60;
			hours = hours + 1;
		}
		mins = tempo;
		tempo = aux;
		System.out.println("O filme "+title+" possui "+hours+" hora(s) e "+mins+" minuto(s) de duração.");
	}
	
	public String toString() {
		return("\ntitulo: "+title+"\ndescrição: "+desc+"\ntempo: "+tempo+" minutos\ndiretor: "+dir);
	}
	
	public boolean buscaFilme(String busca) {
		return this.title.equalsIgnoreCase(busca);
	}
}	


