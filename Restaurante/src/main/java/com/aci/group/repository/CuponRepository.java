package com.aci.group.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;

@Repository
public class CuponRepository implements ICupon {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Cupon cupon) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Cupon cupon) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Cupon> findAll() {
		 return jdbcTemplate.query(
	                "select * from Cupon",
	                (rs, rowNum) ->
	                        new 
	                        		Cupon(rs.getInt("idcupon"), rs.getString("restaurante"),
	                						rs.getString("rfc_restaurante"), rs.getString("descripcion"), rs.getString("estatus")));
	    }

//	@SuppressWarnings({ "deprecation", "unchecked" })
//	@Override
//	public List<Cupon> findByRestaurant(String name) {
//		return jdbcTemplate.query(
//				"select * from Usuario u " + " inner join cupon v on " + " v.idcupon = u.id "
//						+ " where v.estatus = ?",
//				new Object[] { "%" + name },
//				(rs, rowNum) -> new Cupon(rs.getInt("idcupon"), rs.getString("restaurante"),
//						rs.getString("rfc_restaurante"), rs.getString("descripcion"), rs.getString("estatus")));
//	}

	@Override
	public Optional<Cupon> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
