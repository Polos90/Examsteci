package com.aci.group.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;

@Repository
public class NamedParameterJdbcUserRepository extends UsuarioRepository {

	
	 @Autowired
	    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 
	    @Override
	    public List<Usuario> findByName(String name) {

	        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
	        mapSqlParameterSource.addValue("usuario_ref", "%" + name );

	        return namedParameterJdbcTemplate.query(
	                "select *  from Usuario u where u.usuario_ref = u.usuario_ref",
	                mapSqlParameterSource,
	                (rs, rowNum) ->
	                        new Usuario(
//	                        		   rs.getInt("id"),
	                                   rs.getString("nombre"),
	                                   rs.getString("apellidos"),
	                                   rs.getString("correo"),
	                                   rs.getString("contrasenia"),
	                                   rs.getString("usuario_ref")
	                        )
	        );
	    }
	    

}
