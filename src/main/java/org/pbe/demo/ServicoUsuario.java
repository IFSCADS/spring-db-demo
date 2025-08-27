package org.pbe.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoUsuario {

    @Autowired
    UsuarioRepository usuarioRepository;

    public long cria(String nome, String sobrenome) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSobrenome(sobrenome);

        usuario = usuarioRepository.save(usuario);
        return usuario.getId();
    }

    public Usuario bucaPorNome(String nome) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        Example<Usuario> exemplo = Example.of(usuario);

        return usuarioRepository.findOne(exemplo).orElse(null);
    }

    public List<Usuario> bucaTodosComNome(String nome) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        Example<Usuario> exemplo = Example.of(usuario);

        return usuarioRepository.findAll(exemplo);
    }
}
