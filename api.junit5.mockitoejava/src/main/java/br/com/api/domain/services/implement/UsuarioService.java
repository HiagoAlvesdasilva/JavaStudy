package br.com.api.domain.services.implement;

import br.com.api.domain.dto.UsuarioDTO;
import br.com.api.domain.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario findById(Integer id);
    List<Usuario> findAll();
    Usuario create(UsuarioDTO obj);
    Usuario update (UsuarioDTO obj);
    void delete (Integer id);

}
