package EX2;

public class Cliente {
    // VAR
    private String cod;
    private String nome;
    private String cpf;
    private String tel;

    // CONSTRUTOR
    public Cliente(String cod, String nome, String cpf, String tel) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
    }

    // GETTERS AND SETTERS
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // MÉTODO PARA BUSCAR CLIENTE
    public boolean Busca_Cliente(String nomeBuscado) {
        return this.nome.equalsIgnoreCase(nomeBuscado);
    }

    // IMPRIMIR INFORMAÇÕES DO CLIENTE
    public void imprimir() {
        System.out.println("Cod: " + cod);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Tel: " + tel);
    }
}
