package br.com.api.resources;

import br.com.api.domain.dto.UsuarioDTO;
import br.com.api.domain.model.Usuario;
import br.com.api.domain.services.implement.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

    public static final String ID = "/{id}";
    @Autowired
    private ModelMapper mapper;

    @Autowired
    @Qualifier("usuarioServiceImpl")
    private UsuarioService service;

    @GetMapping
    public ResponseEntity <List<UsuarioDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll().
                stream().map(x -> mapper.map(x,UsuarioDTO.class)).
                collect(Collectors.toList()));
    }

    @GetMapping(value = ID)
    public ResponseEntity<UsuarioDTO> findById(@PathVariable Integer id) {
        Usuario usuario = service.findById(id);
        return ResponseEntity.ok().body(mapper.map(usuario, UsuarioDTO.class));
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> create(@RequestBody UsuarioDTO obj){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("{/id}").buildAndExpand(service.create(obj).getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = ID)
    public ResponseEntity<UsuarioDTO> update(@PathVariable Integer id, @RequestBody UsuarioDTO obj){
        obj.setId(id);
        Usuario newObj = service.update(obj);
        return ResponseEntity.ok().body(mapper.map(newObj ,UsuarioDTO.class));

    }


    @DeleteMapping(value = ID)
    public ResponseEntity <UsuarioDTO> delete (@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
