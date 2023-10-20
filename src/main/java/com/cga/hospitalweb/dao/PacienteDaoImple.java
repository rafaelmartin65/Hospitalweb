package com.cga.hospitalweb.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cga.hospitalweb.pojo.Paciente;

//@Component("PacienteDao")
@Transactional
@Repository
public class PacienteDaoImple implements PacienteDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Paciente paciente) {
		getSession().save(paciente);
		
	}

	@Override
	public List<Paciente> findAll() {
		
		Query<Paciente> query = getSession().createQuery("From Paciente");
		return query.getResultList();
	}

	@Override
	public Paciente findById(int id) {
		// Buscar por id de paciente
		Criteria crit = getSession().createCriteria(Paciente.class);
		crit.add(Restrictions.eqOrIsNull("idPaciente", id));
		
		return (Paciente) crit.uniqueResult();
	}

	@Override
	public List<Paciente> findByNombre(String nombre) {
		Criteria crit = getSession().createCriteria(Paciente.class);
		crit.add(Restrictions.like("nombre", "%" + nombre + "%"));
		return crit.list();
	}

	@Override
	public void update(Paciente pac) {
		getSession().update(pac);
		
	}

	@Override
	public void delete(Paciente pac) {
		getSession().delete(pac);
		
	}

	@Override
	public int[] saveAll(List<Paciente> pacientes) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
