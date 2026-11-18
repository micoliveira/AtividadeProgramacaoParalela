public class EstudantePosGraduacao extends Estudante implements Inscritivel {
    private final String linhaPesquisa;

    public EstudantePosGraduacao(String nome, String matricula, String linhaPesquisa) {
        super(nome, matricula);
        if (linhaPesquisa == null || linhaPesquisa.isBlank()) {
            throw new IllegalArgumentException("A linha de pesquisa não pode ser vazia.");
        }
        this.linhaPesquisa = linhaPesquisa;
    }

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    @Override
    public void inscreverEmDisciplina(String disciplina) {
        if (disciplina == null || disciplina.isBlank()) {
            throw new IllegalArgumentException("A disciplina não pode ser vazia.");
        }
        System.out.println(getNome() + " foi inscrito(a) em " + disciplina + ".");
    }
}
