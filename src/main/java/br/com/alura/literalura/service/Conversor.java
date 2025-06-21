package br.com.alura.literalura.service;

import br.com.alura.literalura.dto.LivroDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

public class Conversor {
    private ObjectMapper mapper = new ObjectMapper();

    public LivroDTO converteDados(String json){
        try {
            var modulo = mapper.readTree(json);
            var recptor = modulo.get("results").get(0);
            LivroDTO livroDTO = mapper.treeToValue(recptor, LivroDTO.class);
            return livroDTO;
        } catch (JsonProcessingException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
