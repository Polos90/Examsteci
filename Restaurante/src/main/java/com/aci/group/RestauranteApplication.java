package com.aci.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.aci.group.model.Usuario;
import com.aci.group.repository.ICupon;
import com.aci.group.repository.IUsuario;

import java.util.Arrays;
import java.util.List;

//import com.aci.group.model.Cupon;
//import com.aci.group.repository.ICupon;
//import com.aci.group.repository.IUsuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RestauranteApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(RestauranteApplication.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("namedParameterJdbcUserRepository")
	private IUsuario userRepo;
	
	@Autowired
	@Qualifier("namedParameterjdbcCuponRepository")
	private ICupon cuponRepo;

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("...");
		log.info("...");
		log.info("...");
		log.info("...");
		log.info("...");
		log.info("...");
		log.info("StartApplication...");
		runJDBC();

	}
	
	List<Usuario> usuarios = Arrays.asList(
            new Usuario("Jimenez vasquez", "jv003","jvcarmen8009@gmail.com","carmen","francisco"),
            new Usuario("Ruiz Diaz", "RD789","isa8499@hotmail.com","isabel","Pablo"),
            new Usuario("bautista garcia", "BGP948","rafa97961@hotmail.com","rafael","francisco"),
            new Usuario("vargas torres", "VTV845","vtv888@gmail.com","victor","Pablo")
    );
//	
	

	void runJDBC() {
		
		Usuario users = new Usuario();
		
		log.info("*********************************************************************");
		log.info("****************************************************************");
		 log.info("[SAVE_USUARIO]");
		 usuarios.forEach(user -> {
	            log.info("Saving...{}", user.getNombre());
	            userRepo.save(user);
	        });
		log.info("*********************************************************************");
		log.info("[FIND_BY_USUARIO] : = 'polos'");
		log.info("{}", userRepo.findByName("polos"));
		log.info("*********************************************************************");
//		log.info("[FIND_BY_ESTATUS] : = 'usado'");
		
//		log.info("{}",	cuponRepo.findByRestaurant("usado"));
		log.info("*********************************************************************");
		   log.info("[FIND_ALL_CUPON] {}", cuponRepo.findAll()); 

	}

}
