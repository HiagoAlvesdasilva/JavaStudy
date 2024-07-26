package com.crud_api.entity_crud_rest.servico;

import com.crud_api.entity_crud_rest.repositorio.EstudanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EstudanteServico {
    @Autowired
    private EstudanteRepositorio estudanteRepositorio;
}
