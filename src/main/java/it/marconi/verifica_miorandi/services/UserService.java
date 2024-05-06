package it.marconi.verifica_miorandi.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import it.marconi.verifica_miorandi.domains.Film;

@Service
public class UserService {
   
    private List<Film> listaFilm = new ArrayList<>();

    public List<Film> getListaFilm() {
        return listaFilm;
    }

    public void aggiungiFilm(Film film) {
        listaFilm.add(film);
    }
   
    public void svuotaCatalogo() {
        listaFilm.clear();
    }
   
    public Film getFilmByCodice(String codice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilmByCodice'");
    }
   
}
