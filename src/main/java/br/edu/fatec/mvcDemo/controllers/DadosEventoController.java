package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/alunos")
public class DadosController {
    private static final List<Aluno>
            alunos = new ArrayList<Aluno>();

    public DadosController() {
        alunos.add(new Aluno("Camila","Segurança",10,10));
        alunos.add(new Aluno("Felipe","Culinaria",5,4));
        alunos.add(new Aluno("Ana Carolina","Viagens",10,9));
    }

    @GetMapping
    public List<Aluno> getAlunos()
    {
        return alunos;
    }
}
