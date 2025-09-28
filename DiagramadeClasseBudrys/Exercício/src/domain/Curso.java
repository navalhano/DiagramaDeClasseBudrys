package domain;

public class Curso {
    private String codigo;
    private String nome;
    private Professor coordenador;

    public Curso(String codigo, String nome, Professor coordenador) {
        this.codigo = codigo;
        this.nome = nome;
        this.coordenador = coordenador;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", coordenador=" + coordenador.getNome() +
                '}';
    }
}
