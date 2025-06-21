package br.com.alura.literalura.service;

import br.com.alura.literalura.model.Autor;
import br.com.alura.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

    @Service
    public class AutorService {
        @Autowired
        private AutorRepository autorRepositorio;

        public Autor salvar(Autor autor){
            return autorRepositorio.save(autor);
        }

        public Optional<Autor> findByNome(String nome){
            return autorRepositorio.findByNome(nome);
        }

        public List<Autor> listarAutores() {
            return autorRepositorio.findAll();
        }

        public List<Autor> findByAno(Integer ano) {
            Calendar cal = GregorianCalendar. getInstance();
            var yearAtual = cal.get(Calendar.YEAR);
            if(!(ano <= yearAtual)){
                System.out.println("Digite um ano menor ou igual a "+yearAtual);
                return null;
            } else {
                System.out.println("Autores vivos no ano de "+ano);
                return autorRepositorio.buscaAno(ano);
            }
        }
    }




