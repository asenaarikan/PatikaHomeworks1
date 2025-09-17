package Film_Filtreleme;
import java.util.ArrayList;
public class FilmFiltrelemeTest {
    public static void main(String[] args) {
        ArrayList<Film> filmler = new ArrayList<>();

        filmler.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
        filmler.add(new Film("The Godfather", 1972, "Dram", 9.2));
        filmler.add(new Film("Interstellar", 2014, "Bilim Kurgu", 8.6));
        filmler.add(new Film("The Dark Knight", 2008, "Aksiyon", 9.0));
        filmler.add(new Film("Forrest Gump", 1994, "Dram", 8.8));

        FilmFiltreleme filtre = new FilmFiltreleme();

        System.out.println("IMDb Puanına Göre Sıralama:");
        filtre.yazdir(filtre.imdbSirala(new ArrayList<>(filmler)));

        System.out.println("\nYayın Yılına Göre Sıralama:");
        filtre.yazdir(filtre.yilSirala(new ArrayList<>(filmler)));

        System.out.println("\nBilim Kurgu Filmleri:");
        filtre.yazdir(filtre.turFiltrele(filmler, "Bilim Kurgu"));
    }
}
