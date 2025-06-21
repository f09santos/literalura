package br.com.alura.literalura.service;

import br.com.alura.literalura.model.Livro;
import br.com.alura.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepositorio;

    public Livro salvar(Livro livro){
        return livroRepositorio.save(livro);
    }

    public Optional<Livro> findByTitulo(String nome){
        return livroRepositorio.findByTitulo(nome);
    }

    public List<Livro> listarLivro(){
        return livroRepositorio.findAll();
    }

    public List<Livro> listarLivroIdioma(String sigla) {
        return livroRepositorio.findByIdioma(sigla);
    }
}
