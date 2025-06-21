package br.com.alura.literalura.repository;

import br.com.alura.literalura.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Optional<Livro> findByTitulo(String nome);


      List<Livro> findByIdioma(String idioma);
}
