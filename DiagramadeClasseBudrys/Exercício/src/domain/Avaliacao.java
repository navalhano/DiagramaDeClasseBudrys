package domain;

public class Avaliacao {
    private double nota1;
    private double nota2;
    private double nota3;

    public Avaliacao(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double media() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public boolean aprovado() {
        return media() >= 6.0;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "media=" + media() +
                ", aprovado=" + aprovado() +
                '}';
    }
}
