package br.edu.fatec.mvcDemo.controllers.eventos;

import br.edu.fatec.mvcDemo.models.eventos.Evento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class DadosEventoController {

    private static final List<Evento> eventos = new ArrayList<>();

    public DadosEventoController() {
        eventos.add(new Evento("Conferência de Tecnologia", "Centro de Convenções", "2023-12-10"));
        eventos.add(new Evento("Workshop de Desenvolvimento Web", "Sala de Treinamento", "2023-11-25"));
        eventos.add(new Evento("Hackathon da Fatec", "Laboratório de Informática", "2023-10-05"));
    }

    @GetMapping
    public List<Evento> getEventos() {
        return eventos;
    }
}
