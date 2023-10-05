/**
 * 
 */
package com.cga.hospitalweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rafael Mart�n
 *
 */

@Controller
public class IndexController {

	// Crear un metodo que acepte un petici�n http y nos resuelva un nombre l�gico (index)
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
