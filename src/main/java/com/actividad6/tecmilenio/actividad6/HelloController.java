package com.actividad6.tecmilenio.actividad6;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String nombre = "Nombre: Jesus Enrique Guerra Delmas <br>" ;
		String matricula = "Matricula: 2840701 <br>";
		String escuela = "Escuela: Tecmilenio <br>";
		String curso = "Curso: Computacion Avanzada en Java <br>";
		String maestro = "Maestro: jceceniceros <br>";
		String datos = nombre + matricula + escuela + curso + maestro;
		return datos;
		
	}
}