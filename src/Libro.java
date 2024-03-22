public class Libro {
    public String titolo;
    public String autore;
    public int annoPubblicazione;
    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getAutore() {
        return autore;
    }
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                '}';
    }
}
