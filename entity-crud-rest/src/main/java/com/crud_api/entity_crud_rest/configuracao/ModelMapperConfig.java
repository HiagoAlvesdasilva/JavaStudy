package com.crud_api.entity_crud_rest.configuracao;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class ModelMapperConfig extends  java.util.LinkedHashMap {

    @Bean
    public ModelMap modelMapper() {
        return new ModelMap();
    }
}
