import domain.*;

public class App {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos", "Rua A", "9999-9999", "Doutor");
        Curso curso = new Curso("C01", "Ciência da Computação", prof);

        Disciplina d1 = new Disciplina("D01", "Algoritmos Malignos", 60, curso, null);
        Disciplina d2 = new Disciplina("D02", "Estruturas de Cubos", 60, curso, d1);

        Aluno a1 = new Aluno("Ana", "Rua Balistico", "8787-8883", 123);
        Aluno a2 = new Aluno("Pedro", "Rua C", "7777-7777", 456);

        Turma turma = new Turma("1º Semestre", 2025, prof, d2);
        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        Avaliacao av = new Avaliacao(7.0, 8.0, 6.0);

        System.out.println(prof);
        System.out.println(curso);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(turma);
        System.out.println(av);
    }
}
