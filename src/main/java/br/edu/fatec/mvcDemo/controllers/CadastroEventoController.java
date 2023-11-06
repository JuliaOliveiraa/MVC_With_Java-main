package br.edu.fatec.mvcDemo.controllers.eventos;

import br.edu.fatec.mvcDemo.models.eventos.Evento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class CadastroEventoController {

    private static final List<Evento> eventos = new ArrayList<>();

    @PostMapping("/cadastrar")
    public String cadastrarEvento(
            @RequestParam String nome,
            @RequestParam String local,
            @RequestParam String data) {

        Evento novoEvento = new Evento(nome, local, data);
        eventos.add(novoEvento);

        return "Evento cadastrado com sucesso!";
    }
}
