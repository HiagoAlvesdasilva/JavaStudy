package br.com.api.domain.services.implement;

import br.com.api.domain.dto.UsuarioDTO;
import br.com.api.domain.model.Usuario;
import br.com.api.domain.services.exceptions.DataIntegratyViolationException;
import br.com.api.domain.services.exceptions.ObjectNotFoundException;
import br.com.api.domain.repositories.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário Não Encontrado"));
    }


    public List<Usuario>findAll(){
        return repository.findAll();
    }

    @Override
    public Usuario create(UsuarioDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Usuario.class));
    }

    @Override
    public Usuario update(UsuarioDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Usuario.class));
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    private void findByEmail(UsuarioDTO obj){
        Optional<Usuario> usuario = repository.findByEmail(obj.getEmail());
        if (usuario.isPresent()&& !usuario.get().getId().equals(obj.getId())) {
        throw new DataIntegratyViolationException("Email Ja Cadastrado No Sistema");

        }
    }


}
