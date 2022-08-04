//package com.aci.group.controller;
//
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//
//import com.aci.group.service.UsuarioService;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api")
//public class UsuarioController {
//
//	@Autowired
//	private UsuarioService serv;
//
//	Boolean existe = false;
//
////	@GetMapping("/usuarios")
////	public List<Usuario> index(){
////		Usuario user = new Usuario();
////		user.getNombre();
////		return null;
////	}
//
////	@GetMapping("/")
////	public String viewHomePage(Model model) {
//////		ModelAndView vista = new ModelAndView() ;
//////		vista.setViewName("index");
////		
////		
//////		List<Usuario> listuser = serv.listAll();
////		Collection<Usuario> listuser = serv.findByName(null);
////		Usuario user = new Usuario();
////		user.getNombre();
////		if(user.getUsuario_ref() == user.getNombre() ) {
////		 model.addAttribute("titulo","Si existe");
////		}
////		else if (user.getUsuario_ref() != null ) {
////			 model.addAttribute("titulo","No existe");
////		}
////		model.addAttribute("listUsuarios", listuser);
////
////		return "index";
////	}
//
////	@PostMapping("/usuario")
////	@ResponseStatus(HttpStatus.CREATED)
////	public Usuario create(@RequestBody Usuario user) {
////		if(user.getUsuario_ref().equals( user.getNombre())) {
////			existe = true;
////			this.iUsuario.save(user);
////		}else {
////			existe = false;
////		}
//
////			if(user.getUsuario_ref().equals( user.getNombre())) {
////				existe = true;
////				String res = existe.toString();
////				 System.out.println(res);
////			}
////		
////		return user;
////	}
//	
////	@GetMapping(value = "/users")
////	public ResponseEntity<Object> findByUsername(){
////	
////		return ResponseEntity.ok(this.serv.findByUsuarios());
////	}
//}
