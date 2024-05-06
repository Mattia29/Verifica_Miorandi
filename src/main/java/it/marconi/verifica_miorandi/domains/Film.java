package it.marconi.verifica_miorandi.domains;

public class Film {
    private String codice;
    private String titolo;
    private String genere;
    private int anno;
    private int voto;

    public Film() {
        this.codice = codice;
        this.titolo = titolo;
        this.genere = genere;
        this.anno = anno;
        this.voto = voto;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    
}