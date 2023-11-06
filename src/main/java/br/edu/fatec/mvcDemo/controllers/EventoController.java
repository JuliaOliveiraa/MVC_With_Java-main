package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
 private static final List<Aluno>
     alunos = new ArrayList<Aluno>();

    public AlunoController() {
        alunos.add(new Aluno("Camila","Segurança",10,10));
        alunos.add(new Aluno("Felipe","Culinaria",5,4));
        alunos.add(new Aluno("Ana Carolina","Viagens",10,9));
    }

    @GetMapping
    public String getAlunos(Model model)
    {
        model.addAttribute("alunos",alunos);
        return "alunos";
    }
}
