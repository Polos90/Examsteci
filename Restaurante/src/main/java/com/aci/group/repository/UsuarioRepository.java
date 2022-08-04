package com.aci.group.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;

@Repository
public class UsuarioRepository implements IUsuario {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Usuario user) {
		return jdbcTemplate.update(
                "insert into Usuario (apellidos, contrasenia,correo,nombre,usuario_ref) values(?,?,?,?,?)",
                user.getNombre(), user.getApellidos(),user.getCorreo(),
                user.getContrasenia(),user.getUsuario_ref());
			
    }

	@Override
	public int update(Usuario user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Usuario> findByName(String name) {
		return jdbcTemplate.query(
                "select * from Usuario u where u.usuario_ref = ?",
                new Object[]{"%" + name },
                (rs, rowNum) ->
                        new Usuario(
//                                rs.getInt("id"),
                                rs.getString("nombre"),
                                rs.getString("apellidos"),
                                rs.getString("correo"),
                                rs.getString("contrasenia"),
                                rs.getString("usuario_ref")
                        )
        );
    }
	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
