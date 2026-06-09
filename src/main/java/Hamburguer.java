package main.java;

public class Hamburguer {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Hamburguer() {
        avaliacao = new AvaliacaoConceito();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public float getNota() {
        return persistencia.getNota();
    }
}
