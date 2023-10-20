package com.cga.hospitalweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cga.hospitalweb.pojo.Paciente;


public class PacienteRowMapper implements RowMapper<Paciente> {
	
	@Override
    public Paciente mapRow(ResultSet rs, int rowNum) throws SQLException {

        Paciente pac = new Paciente();
        pac.setIdPaciente(rs.getInt("idPaciente"));
        pac.setNombre(rs.getString("nombre"));
        pac.setApellidos(rs.getString("apellidos"));
        pac.setEdad(rs.getInt(4));
        pac.settelefono(rs.getInt(5));
        // pac.setDireccion(rs.getString(6));
        pac.setHistorial(rs.getString(7));

        return pac;
    
    }

}
