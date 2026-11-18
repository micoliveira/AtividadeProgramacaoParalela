public class ExameDeSangue implements Aprovavel {
    private final String paciente;

    public ExameDeSangue(String paciente) {
        this.paciente = paciente;
    }

    @Override
    public void aprovar() {
        System.out.println("Exame de sangue de " + paciente + " aprovado.");
    }
}
