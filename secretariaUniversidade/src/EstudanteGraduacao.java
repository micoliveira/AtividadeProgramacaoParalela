public class EstudanteGraduacao extends Estudante implements Inscritivel {
    private final String projetoConclusao;

    public EstudanteGraduacao(String nome, String matricula, String projetoConclusao) {
        super(nome, matricula);
        if (projetoConclusao == null || projetoConclusao.isBlank()) {
            throw new IllegalArgumentException("O projeto de conclusão não pode ser vazio.");
        }
        this.projetoConclusao = projetoConclusao;
    }

    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    @Override
    public void inscreverEmDisciplina(String disciplina) {
        validarDisciplina(disciplina);
        System.out.println(getNome() + " foi inscrito(a) em " + disciplina + ".");
    }

    private void validarDisciplina(String disciplina) {
        if (disciplina == null || disciplina.isBlank()) {
            throw new IllegalArgumentException("A disciplina não pode ser vazia.");
        }
    }
}
