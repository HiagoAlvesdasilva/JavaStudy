package br.com.api.infrastructure.adapter.input.config;

import br.com.api.domain.model.Usuario;
import br.com.api.domain.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Bean
    public CommandLineRunner startDB() {
        return args -> {
            Usuario u1 = new Usuario(null, "Hiago", "email1@gmail.com", "Masternt01");
            Usuario u2 = new Usuario(null, "Irineu", "email2@gmail.com", "Masternt02");
            Usuario u3 = new Usuario( null, "Arthur", "email3@gmail.com", "Masternt03");
            usuarioRepository.saveAll(List.of(u1, u2, u3));
        };
    }
}
