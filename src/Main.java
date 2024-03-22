import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Libro[] libri = {
                new Libro("Libro1 toast", "Autore1", 2000),
                new Libro("Libro2", "Autore2", 2000),
                new Libro("Libro3", "Autore2", 2002),
                new Libro("Libro4", "Autore3", 2003),
                new Libro("Libro5", "Autore4", 2004)
        };
        stampaLibri(libri);
        ricercaPerAnno(libri, 2000);
        ricercaPerAutore(libri, "Autore2");
        ricercaPerParola(libri, "toast");
    }

    public static void stampaLibri(Libro[] libri) {
        for (Libro libro : libri) {
            System.out.println(libro + "\n");
        }
    }
    public static void ricercaPerAnno(Libro[] libri, int anno) {
        System.out.println("Libri pubblicati nell'anno - " + anno + ":");
        for (Libro libro : libri) {
            if (libro.getAnnoPubblicazione() == anno) {
                System.out.println(libro);
            }
        }
        System.out.println();
    }
    public static void ricercaPerAutore(Libro[] libri, String autore) {
        System.out.println("Libri pubblicati dall'Autore - " + autore + ":");
        for (Libro libro : libri) {
            if (Objects.equals(libro.getAutore(), autore)) {
                System.out.println(libro);
            }
        }
        System.out.println();
    }
    public static void ricercaPerParola(Libro[] libri, String parolaChiave) {
        System.out.println("Libri con parola chiave - " + parolaChiave + ":");
        for (Libro libro : libri) {
            if (libro.getTitolo().toLowerCase().contains(parolaChiave.toLowerCase())) {
                System.out.println(libro);
            }
        }
        System.out.println();
    }
}