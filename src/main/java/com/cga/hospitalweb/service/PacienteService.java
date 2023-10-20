package com.cga.hospitalweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cga.hospitalweb.dao.PacienteDao;
import com.cga.hospitalweb.pojo.Paciente;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteDao pacienteDao;

	public void save(Paciente paciente) {
		pacienteDao.save(paciente);
	}

	public List<Paciente> findAll() {
		return pacienteDao.findAll();

	}

	public Paciente findById(int id) {
		return pacienteDao.findById(id);

	}

	public void saveOrUpdate(Paciente paciente) {
		if (paciente.getIdPaciente() == 0) {
			//Se puede colocar un syso to.String para que se vea que hace
			// Insert
			pacienteDao.save(paciente);
		} else {
			// update
			pacienteDao.update(paciente);
		}
	}

	public void delete(int id) {
		//instanciar
		
		Paciente pac = pacienteDao.findById(id);
		pacienteDao.delete(pac);
	}

}
