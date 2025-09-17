package Film_Filtreleme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilmFiltreleme {


    // IMDb puanına göre sıralayan metot

    public ArrayList<Film> imdbSirala(ArrayList<Film> filmler) {
        Collections.sort(filmler, new Comparator<Film>() {

            @Override
            public int compare(Film f1, Film f2) {
                return Double.compare(f2.getImdbPuani(), f1.getImdbPuani());
            }
        });
        return filmler;
    }

    // Yayın yılına göre sıralayan metot

    public ArrayList<Film> yilSirala(ArrayList<Film> filmler) {
        Collections.sort(filmler, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return Integer.compare(f1.getYayinYili(), f2.getYayinYili());
            }
        });
        return filmler;
    }

    // Türüne göre filtreleme metodu

    public ArrayList<Film> turFiltrele(ArrayList<Film> filmler, String tur) {
        ArrayList<Film> filtreli = new ArrayList<>();
        for (Film f : filmler) {
            if (f.getTur().equalsIgnoreCase(tur)) {
                filtreli.add(f);
            }
        }
        return filtreli;
    }

    // Listeyi ekrana yazdırma metodu

    public void yazdir(ArrayList<Film> filmler) {
        for (Film f : filmler) {
            System.out.println(f);
        }
    }
}
