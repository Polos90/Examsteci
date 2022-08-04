package com.aci.group.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;

//@EnableJpaRepositories
//@Repository
public interface IUsuario {

//	@Transactional(readOnly = true)
//	List <Usuario> usuario_ref();

	int save(Usuario user);

	int update(Usuario user);

	int deleteById(int id);

	List<Usuario> findAll();

	List<Usuario> findByName(String name);

	Optional<Usuario> findById(Long id);

	String getNameById(int id);
}
