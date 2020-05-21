package pl.lapinski.pracadomowa_tydzien6.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.lapinski.pracadomowa_tydzien6.model.Film;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    private List<Film> filmList;

    public FilmService() {
        this.filmList = new ArrayList<>();
        filmList.add(new Film("Green Mile", "Frank Darabont", 1999));
        filmList.add(new Film("Forrest Gump", "Robert Zemeckis", 1994));
        filmList.add(new Film("Requiem for a Dream", "Darren Aronofsky", 2000));
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public boolean addFilm(@RequestBody Film film) {
        filmList.add(film);
        return true;
    }
}
