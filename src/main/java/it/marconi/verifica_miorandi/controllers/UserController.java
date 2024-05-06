package it.marconi.verifica_miorandi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.marconi.verifica_miorandi.domains.Film;
import it.marconi.verifica_miorandi.services.UserService;


@Controller
@RequestMapping("/films")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String catalogoFilm(Model model) {
        List<Film> catalogoFilm = userService.getListaFilm();
        model.addAttribute("catalogoFilm", catalogoFilm);
        model.addAttribute("nuovoFilm", new Film());
        return "catalogo";
    }

    @PostMapping("/films/nuovo")
    public String aggiungiFilm(@ModelAttribute("nuovoFilm") Film nuovoFilm) {
        userService.aggiungiFilm(nuovoFilm);
        return "redirect:/films";
    }

    @GetMapping("/films/{codice}")
    public String dettagliProdotto(@PathVariable String codice, Model model) {
        Film film = userService.getFilmByCodice(codice);
        model.addAttribute("film", film);
        return "dettaglioFilm";
    }


}


