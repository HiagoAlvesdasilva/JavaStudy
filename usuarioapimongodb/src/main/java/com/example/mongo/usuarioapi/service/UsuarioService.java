package com.example.mongo.usuarioapi.service;

import com.example.mongo.usuarioapi.model.Usuario;
import com.example.mongo.usuarioapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obterUsuarioPorId(String id) {
        return usuarioRepository.findById(id);
    }

    public void deletarUsuario(String id) {
        usuarioRepository.deleteById(id);
    }
}
