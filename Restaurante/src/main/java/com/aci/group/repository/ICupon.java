package com.aci.group.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;
import com.aci.group.utils.Result;

public interface ICupon {

	int save(Cupon cupon);

	int update(Cupon cupon);

	int deleteById(int id);

	List<Cupon> findAll();

//	List<Cupon> findByRestaurant(String name);

	Optional<Cupon> findById(Long id);

	String getNameById(int id);
}
