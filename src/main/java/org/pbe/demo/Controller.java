package org.pbe.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ServicoUsuario serv;

    @GetMapping("/busca/{nome}")
    List<Usuario> lista(@PathVariable String nome) {
        return serv.bucaTodosComNome(nome);
    }

    @PostMapping("/adiciona")
    long lista(@RequestParam String nome, @RequestParam String sobrenome) {
        return serv.cria(nome, sobrenome);
    }
}
