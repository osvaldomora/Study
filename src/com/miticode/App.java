package com.miticode;

import com.miticode.dao.CRUD;
import com.miticode.dao.MedicoDao;
import com.miticode.dao.MedicoDaoImpl;
import com.miticode.dao.PersonaDaoImpl;
import com.miticode.moldel.Persona;

public class App {
	
	public static void main(String[] args)
	{
		//PersonaDao dao = new PersonaDaoImpl();
		CRUD<Persona> dao = new PersonaDaoImpl();
	    dao.listarTodos().forEach(x->System.out.println(x.getNombres()));
	    
	    MedicoDao daoM = new MedicoDaoImpl();
	    daoM.listarTodos().forEach(x->System.out.println(x.getNombres()));
	}
	
	

}
