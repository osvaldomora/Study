package com.miticode.dao;

import java.util.ArrayList;
import java.util.List;

import com.miticode.moldel.Persona;

public class PersonaDaoImpl implements PersonaDao {
	List<Persona> lPersona = new ArrayList<Persona>();
	@Override
	public List<Persona> listarTodos() {
		Persona p1 = new Persona();
		p1.setId(1);
		p1.setNombres("Kajel Kamlesh singh");
		
		lPersona.add(p1);
		return lPersona;
	}

	@Override
	public Persona leerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Persona persona) {
	
		lPersona.add(persona);
	}

	@Override
	public void actualizar(Persona persona) {
System.out.println("actualizando");
	}

	@Override
	public void eliminar(int id) {
System.out.println("eliminar");
	}

}
