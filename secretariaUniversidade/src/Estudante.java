public abstract class Estudante {
    private final String nome;
    private final String matricula;

    protected Estudante(String nome, String matricula) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("A matrícula não pode ser vazia.");
        }

        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{nome='" + nome + "', matricula='" + matricula + "'}";
    }
}
