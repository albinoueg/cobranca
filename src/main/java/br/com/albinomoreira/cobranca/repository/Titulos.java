package br.com.albinomoreira.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.albinomoreira.cobranca.model.Titulo;

@Repository
public interface Titulos extends JpaRepository<Titulo, Long>{

}
