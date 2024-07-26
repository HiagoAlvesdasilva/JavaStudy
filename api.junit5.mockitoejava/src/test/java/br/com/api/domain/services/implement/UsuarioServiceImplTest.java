package br.com.api.domain.services.implement;
import br.com.api.domain.dto.UsuarioDTO;
import br.com.api.domain.model.Usuario;
import br.com.api.domain.repositories.UsuarioRepository;
import br.com.api.domain.services.exceptions.DataIntegratyViolationException;
import br.com.api.domain.services.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;


@SpringBootTest
class UsuarioServiceImplTest {

    public static final int ID = 1;
    public static final String NAME = "Hiago Teste";
    public static final String EMAIL = "emailteste@gmail.com";
    public static final String PASSWORD = "senhateste";
    public static final int INDEX = 0;
    public static final String EMAIL_JA_CADASTRADO_NO_SISTEMA = "Email Ja Cadastrado No Sistema";
    public static final String USUARIO_NAO_ENCONTRADO = "Usuário Não Encontrado";
    public static final String OBJETO_NAO_ENCONTRADO = "Objeto Não Encontrado";

    @InjectMocks
    private UsuarioServiceImpl service;

    @Mock
    private UsuarioRepository repository;

    @Mock
    private ModelMapper mapper;

    private Usuario usuario;
    private UsuarioDTO usuarioDTO;
    private Optional<Usuario> optionalUsuario;

    private void startUsuario(){
        usuario = new Usuario(ID, NAME, EMAIL, PASSWORD);
        usuarioDTO = new UsuarioDTO(ID, NAME, EMAIL, PASSWORD);
        optionalUsuario = Optional.of(new Usuario(ID, NAME, EMAIL, PASSWORD));
    }


    @BeforeEach
    void setUp() {
        openMocks(this);
        startUsuario();
    }

    @Test
    void findByIdRetornandoObjetc() {
        when(repository.findById(anyInt())).thenReturn(optionalUsuario);

        Usuario response = service.findById(ID);

        assertNotNull(response);
        assertEquals(Usuario.class,response.getClass());
        assertEquals(ID, response.getId());
        assertEquals(NAME, response.getName());
        assertEquals(EMAIL, response.getEmail());
        assertEquals(PASSWORD, response.getPassword());

    }

    @Test
    void findByIdRetornandoExecption(){
        when(repository.findById(anyInt())).thenThrow(new ObjectNotFoundException(USUARIO_NAO_ENCONTRADO));

        try {
            service.findById(ID);
        }catch (Exception ex){
            assertEquals(ObjectNotFoundException.class, ex.getClass());
            assertEquals(USUARIO_NAO_ENCONTRADO, ex.getMessage());
        }
    }

    @Test
    void findAllRertornandoListaDeUsuarios() {
        when(repository.findAll()).thenReturn(List.of(usuario));

        List <Usuario> response = service.findAll();
        assertNotNull(response);
        assertEquals(1, response.size());
        assertEquals(Usuario.class, response.get(INDEX).getClass());

        assertEquals(ID, response.get(INDEX).getId());
        assertEquals(NAME, response.get(INDEX).getName());
        assertEquals(EMAIL, response.get(INDEX).getEmail());
        assertEquals(PASSWORD, response.get(INDEX).getPassword());
    }

    @Test
    void createCriandoUmUsuarioComSocesso() {
        when(repository.save(any())).thenReturn(usuario);

        Usuario response = service.create(usuarioDTO);

        assertNotNull(response);
        assertEquals(Usuario.class , response.getClass());
        assertEquals(ID, response.getId());
        assertEquals(NAME, response.getName());
        assertEquals(EMAIL, response.getEmail());
        assertEquals(PASSWORD, response.getPassword());

    }

    @Test
    void createFalhaAoTentarCadastrarEmailJaExistente() {
        when(repository.findByEmail(anyString())).thenReturn(optionalUsuario);

        try {
            optionalUsuario.get().setId(2);
            service.create(usuarioDTO);
        } catch (Exception ex){

            assertEquals(DataIntegratyViolationException.class, ex.getClass());
            assertEquals(EMAIL_JA_CADASTRADO_NO_SISTEMA, ex.getMessage());
        }
    }


    @Test
    void updateAtulizandoComSucesso() {
        when(repository.save(any())).thenReturn(usuario);

        Usuario response = service.update(usuarioDTO);

        assertNotNull(response);
        assertEquals(Usuario.class, response.getClass());
        assertEquals(ID, response.getId());
        assertEquals(NAME, response.getName());
        assertEquals(EMAIL, response.getEmail());
        assertEquals(PASSWORD, response.getPassword());

    }

    @Test
    void updateFalhaAoTentarCadastrarEmailJaExistente() {
        when(repository.findByEmail(anyString())).thenReturn(optionalUsuario);

        try {
            optionalUsuario.get().setId(2);
            service.create(usuarioDTO);
        } catch (Exception ex) {

            assertEquals(DataIntegratyViolationException.class, ex.getClass());
            assertEquals(EMAIL_JA_CADASTRADO_NO_SISTEMA, ex.getMessage());
        }
    }

    @Test
    void deleteComSucesso(){
        when(repository.findById(anyInt())).thenReturn(optionalUsuario);
        doNothing().when(repository).deleteById(anyInt());
        service.delete(ID);
        verify(repository, times(1)).deleteById(anyInt());
    }

    @Test
    void deleteInsucesso(){
        when(repository.findById(anyInt()))
                .thenThrow(new ObjectNotFoundException(UsuarioServiceImplTest.OBJETO_NAO_ENCONTRADO));
        try {
            service.delete(ID);
        }catch (Exception ex){
            assertEquals(ObjectNotFoundException.class,ex.getClass());
            assertEquals(UsuarioServiceImplTest.OBJETO_NAO_ENCONTRADO,ex.getMessage());
        }
    }
}