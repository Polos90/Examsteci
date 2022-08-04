//package com.aci.group.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.aci.group.model.Cupon;
//import com.aci.group.repository.ICupon;
//
//@RestController
//@RequestMapping("/api")
//public class CuponController {
//	
//	@Autowired
//	private ICupon iCupon;
//	
//	@GetMapping("/incidencias")
//	public List<Cupon> index(){
//		
//		return (List<Cupon>) iCupon.findAll();
//	}
//
//}
