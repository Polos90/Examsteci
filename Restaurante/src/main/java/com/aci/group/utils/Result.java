package com.aci.group.utils;

import com.aci.group.model.Cupon;
import com.aci.group.model.Usuario;

public class Result{
	
    public  Cupon cupon;
    private final Usuario user;
    
    
    public Result(Cupon cupon,Usuario user){ 
        this.cupon=cupon; this.user = user;
    }
    
    
	public Cupon getCupon() {
		return cupon;
	}
	public Usuario getUser() {
		return user;
	}
	@Override
	public String toString() {
		return "Result [cupon=" + cupon + ", user=" + user + "]";
	}


}