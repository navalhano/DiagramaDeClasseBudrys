package domain;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private Curso curso;
    private Disciplina prerequisito;

    public Disciplina(String codigo, String nome, int cargaHoraria, Curso curso, Disciplina prerequisito) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
        this.prerequisito = prerequisito;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", curso=" + curso.getNome() +
                ", prerequisito=" + (prerequisito != null ? prerequisito.getNome() : "nenhum") +
                '}';
    }
}
