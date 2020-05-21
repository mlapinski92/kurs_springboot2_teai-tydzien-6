package pl.lapinski.pracadomowa_tydzien6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.lapinski.pracadomowa_tydzien6.aspect.AddAspect;
import pl.lapinski.pracadomowa_tydzien6.model.Film;
import pl.lapinski.pracadomowa_tydzien6.service.FilmService;

import java.util.List;

@RestController
@RequestMapping(value = "/films")
public class FilmApi {

    private FilmService filmService;

    @Autowired
    public FilmApi(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> getFilms() {
        List<Film> filmList = filmService.getFilmList();
        return filmList;
    }

    @PostMapping
    @AddAspect
    public ResponseEntity<Film> addMovies(@RequestBody Film film) {
        if (filmService.addFilm(film)) {
            return new ResponseEntity<Film>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
