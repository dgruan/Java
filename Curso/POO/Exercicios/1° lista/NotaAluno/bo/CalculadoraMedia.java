package bo;
import models.DadosEntradaAluno;
import models.DadosSaidaAluno;

public class CalculadoraMedia {
    
    public void calcular(DadosEntradaAluno de, DadosSaidaAluno ds) {
        double media = (de.getNota1() + de.getNota2()) / 2;
        
        ds.setMedia(media);
        
        if(ds.getMedia() >= 6) {
            ds.setResultado("Aprovado!");
        } else{
            ds.setResultado("Reprovado!");
        }
    }
}
