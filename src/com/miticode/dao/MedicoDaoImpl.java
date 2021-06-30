package com.miticode.dao;

import java.util.ArrayList;
import java.util.List;

import com.miticode.moldel.Medico;

public class MedicoDaoImpl implements MedicoDao {

	List<Medico> lMedico= new ArrayList<Medico>();
	
	
	@Override
	public List<Medico> listarTodos() {
		Medico p1 = new Medico();
		p1.setId(2);
		p1.setNombres("Kajel2 Kamlesh singh");
		
		lMedico.add(p1);
		return lMedico;
	}

	@Override
	public Medico leerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Medico medico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

}
