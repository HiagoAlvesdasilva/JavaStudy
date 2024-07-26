package com.crud_api.entity_crud_rest.repositorio;

import com.crud_api.entity_crud_rest.modelo.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstudanteRepositorio extends JpaRepository<Estudante, Long> {
}
