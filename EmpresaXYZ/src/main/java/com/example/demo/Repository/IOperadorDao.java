package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Operador;
public interface IOperadorDao extends CrudRepository<Operador, Long> {

}
