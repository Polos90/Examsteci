package com.aci.group.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;
import com.aci.group.utils.Result;

@Repository
public class NamedParameterjdbcCuponRepository extends CuponRepository{
	
	 @Autowired
	    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 
//	 public List<Cupon> findByRestaurant(String name) {
//		 
//		 
//		    SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("buscarRest")
//	                .returningResultSet("name", new CuponRowMapper());
//	 
//	        SqlParameterSource in = new MapSqlParameterSource().addValue("name", name); 
//	 
//	        Map<String, Object> out = simpleJdbcCall.execute(in);
//	        return (List<Cupon>) out.get("name");
//	    } 
		  
		    
		   
//		 
//		   MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
//	        mapSqlParameterSource.addValue("estatus", "%" + name ); 
//
//			return namedParameterJdbcTemplate.query(
//	                "SELECT * from Usuario u  inner join cupon v on  v.idcupon = u.id  where v.estatus = v.estatus " ,
//	                mapSqlParameterSource,
//	                (rs, rowNum) ->
//	                        new Cupon(
//	                                rs.getInt("idcupon"),
//	                                rs.getString("restaurante"),
//	                                rs.getString("rfc_restaurante"),
//	                                rs.getString("descripcion"),
//	                                rs.getString("estatus")                           
//	                        )
//	        );
//	    }
	 
//	 
//	 private static class CuponRowMapper implements RowMapper<Result> {
//		 Usuario user = new Usuario();
//		 Cupon cupon = new Cupon();
//		 
//		 
//		    @Override
//		    public Result mapRow(ResultSet rs, int rowNum) throws SQLException {
//		    	user.getNombre();
//		    	
//		        return new Result(cupon,user);
//		    }  
//		}
}



