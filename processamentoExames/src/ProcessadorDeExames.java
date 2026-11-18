import java.util.List;

public class ProcessadorDeExames {
    public void processar(List<Aprovavel> exames) {
        for (Aprovavel exame : exames) {
            exame.aprovar();
        }
    }
}
