package domain;

public class Professor extends Pessoa {
    private String titulacaoMaxima;

    public Professor(String nome, String endereco, String telefone, String titulacaoMaxima) {
        super(nome, endereco, telefone);
        this.titulacaoMaxima = titulacaoMaxima;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome=" + getNome() +
                ", titulacaoMaxima='" + titulacaoMaxima + '\'' +
                '}';
    }
}
