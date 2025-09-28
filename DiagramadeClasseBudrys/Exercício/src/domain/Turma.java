package domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String semestre;
    private int ano;
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(String semestre, int ano, Professor professor, Disciplina disciplina) {
        this.semestre = semestre;
        this.ano = ano;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
        a.matricular(this);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "semestre='" + semestre + '\'' +
                ", ano=" + ano +
                ", professor=" + professor.getNome() +
                ", disciplina=" + disciplina.getNome() +
                ", qtdAlunos=" + alunos.size() +
                '}';
    }
}
