/**
 * 
 */
package com.cga.hospitalweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rafael Martín
 *
 */

@Controller
public class IndexController {

	// Crear un metodo que acepte un petición http y nos resuelva un nombre lógico (index)
	@RequestMapping("/")
	public String  mostrarIndex() {
		System.out.println("mostrar index");
		return "index";
	}
	
	@RequestMapping("/otra")
	public String  mostrarOtraPag() {
		System.out.println("mostrar otra index");
		return "otra";
	}
}
