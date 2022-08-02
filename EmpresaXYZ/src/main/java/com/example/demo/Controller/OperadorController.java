package com.example.demo.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.example.demo.Repository.IOperadorDao;
import com.example.demo.modelo.Operador;

@RestController
@RequestMapping("/api")
public class OperadorController {
	
	@Autowired
	private IOperadorDao iOperadorDao;
	
	
	@GetMapping("/incidencias")
	public List<Operador> index(){
		
		return (List<Operador>) iOperadorDao.findAll();
	}
	
	@PostMapping("/incidencia")
	@ResponseStatus(HttpStatus.CREATED)
	public Operador create(@RequestBody Operador operador) {
	
		this.iOperadorDao.save(operador);
		return operador;
	}

}
