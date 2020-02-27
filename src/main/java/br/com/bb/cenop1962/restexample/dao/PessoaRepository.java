package br.com.bb.cenop1962.restexample.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.bb.cenop1962.restexample.entities.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa,Integer>{

}