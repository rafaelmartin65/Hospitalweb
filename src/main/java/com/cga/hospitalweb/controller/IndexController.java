/**
 * 
 */
package com.cga.hospitalweb.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author Rafael Martín
 *
 */

@SessionAttributes("resultado")
@Controller
public class IndexController {

	//Crear un metodo que acepte una peticion http y nos resueltva un nombre logico (index)
		//Aplicar en el metodo un model, para que persista
		//Es una interfaz que nos permite definir atributos en el modelo
		@RequestMapping("/")
		public String mostrarIndex (Model model) {
			
//			model.addAttribute("resultado", "Resultado de la session");
			return "index";
		}
		
		@RequestMapping("/otra")
		public String mostrarOtrarPag(HttpSession session) {
			
//			session.setAttribute("mensaje", "Mensaje de otra pagina");
//			model.addAttribute("mensaje", "Mensaje de otra pagina");
			return "otra";
		}
		
		/*@RequestMapping("/paciente")
		public String mostrarPaciente(SessionStatus status) {
			System.out.println("Pagina Paciente");
			status.setComplete();
			return "paciente";
		}*/
}
