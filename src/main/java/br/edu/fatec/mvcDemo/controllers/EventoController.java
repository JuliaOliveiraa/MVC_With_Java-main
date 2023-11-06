package br.edu.fatec.mvcDemo.controllers.eventos;

import br.edu.fatec.mvcDemo.models.eventos.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/eventos")
public class EventoController {
    private static final List<Evento> eventos = new ArrayList<Evento>();

    public EventoController() {
        eventos.add(new Evento("Conferência de Tecnologia", "Centro de Convenções", "2023-12-10"));
        eventos.add(new Evento("Workshop de Desenvolvimento Web", "Sala de Treinamento", "2023-11-25"));
        eventos.add(new Evento("Hackathon da Fatec", "Laboratório de Informática", "2023-10-05"));
    }

    @GetMapping
    public String getEventos(Model model) {
        model.addAttribute("eventos", eventos);
        return "eventos";
    }
}
