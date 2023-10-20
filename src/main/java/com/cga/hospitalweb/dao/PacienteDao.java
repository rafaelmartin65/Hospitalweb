package com.cga.hospitalweb.dao;

import java.util.List;

import com.cga.hospitalweb.pojo.Paciente;

public interface PacienteDao {
	
	//public boolean save (Paciente paciente);
	public void save (Paciente paciente);

	public List<Paciente> findAll();

	public Paciente findById(int id);

	public List<Paciente> findByNombre(String nombre);
	
	//public boolean update(Paciente pac);
	public void update(Paciente pac);
	
	//public boolean delete(int idPaciente);
	//public void delete(int idPaciente);
	public void delete(Paciente pac);
	
	public int[] saveAll(List<Paciente> pacientes);

}
