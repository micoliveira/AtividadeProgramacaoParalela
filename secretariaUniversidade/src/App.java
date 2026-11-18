public class App {
    public static void main(String[] args) {
        EstudanteGraduacao graduacao =
                new EstudanteGraduacao("Ana", "2026001", "Sistema de Matrículas");
        EstudantePosGraduacao posGraduacao =
                new EstudantePosGraduacao("Bruno", "2026002", "Computação Paralela");
        EstudanteOuvinte ouvinte =
                new EstudanteOuvinte("Carla", "2026003");

        realizarInscricao(graduacao, "Programação Paralela");
        realizarInscricao(posGraduacao, "Engenharia de Software");

        System.out.println(graduacao + ", projetoConclusao='"
                + graduacao.getProjetoConclusao() + "'}");
        System.out.println(posGraduacao + ", linhaPesquisa='"
                + posGraduacao.getLinhaPesquisa() + "'}");
        System.out.println(ouvinte);
        System.out.println(ouvinte.getNome() + " participa como ouvinte.");
    }

    private static void realizarInscricao(Inscritivel estudante, String disciplina) {
        estudante.inscreverEmDisciplina(disciplina);
    }
}
