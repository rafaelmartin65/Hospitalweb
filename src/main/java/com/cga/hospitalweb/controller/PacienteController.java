package com.cga.hospitalweb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.cga.hospitalweb.pojo.Paciente;
import com.cga.hospitalweb.service.PacienteService;

@Controller
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	

	@RequestMapping("/paciente")
	public String mostrarPaciente(Model model) {

		Paciente pac = new Paciente();
		model.addAttribute("paciente", pac);
		
		return "paciente";
	}
	
	@RequestMapping("/pacientes")
	public String showPacientes(Model model) {

		// listar todos los pacientes

		List<Paciente> pacientes = pacienteService.findAll();

		// añado clave valor del listado de pacientes en el modelo
		
		model.addAttribute("pacientes", pacientes);

		return "/pacientes";
	}
	

	@RequestMapping(value = "/paciente/save", method = RequestMethod.POST)
	// @ModelAttribute: Nos va a leer del modelo con clave Paciente y decirle que de
	// tipo es Paciente pacienteForm
	// y el modelo colocar pacienteForm (que debo colocarlo en index.jsp)
	
	public String handlePaciente(@ModelAttribute("paciente") Paciente pacienteForm, Model model,
			RedirectAttributes ra) {
		// model.addAttribute("pacienteForm", pacienteForm);

		pacienteService.saveOrUpdate(pacienteForm);
			//System.out.println("Esto entra en if");
			ra.addFlashAttribute("info", "Se han realizado guardados");
		

		// return "index";
		return "redirect:/paciente";
	}

	@RequestMapping("/paciente/{idPaciente}/actualizar")
	public String modificarPaciente (Model model,
			@PathVariable ("idPaciente") int id) {
		
		Paciente paciente = pacienteService.findById(id);
		model.addAttribute("paciente",paciente);
		return "pacientes";
		
	}
	
	
	
	@RequestMapping ("/pacientes/{idPaciente}/eliminar")
	public String eliminarPaciente (Model model, @PathVariable ("idPaciente")
	int id, RedirectAttributes ra) {
		// aplicar un jquery para mostrar advertencia antes de eliminar
		pacienteService.delete(id);
		ra.addFlashAttribute("info","Cambios satisfactorio!");
		
		
		return "redirect:/pacientes";
	}

}
