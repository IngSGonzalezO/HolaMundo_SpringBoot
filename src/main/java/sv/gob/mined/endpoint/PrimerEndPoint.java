package sv.gob.mined.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import sv.gob.mined.intefaces.HolaMundoInterfaces;
import sv.gob.mined.modelo.RespuestaServicio;

/**
 * Clase principal que contiene todos los EndPoint para este laboratorio.
 * @author Oliver González
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/hola-mundo")
@Tag(name = "Hola Mundo", description = "Hola Mundo API")
public class PrimerEndPoint {
	
	@Autowired
	@Qualifier("HolaMundoServicios")
	HolaMundoInterfaces holaServicio;
	
	
	/**
	 * Metodo que contiene el mensaje a ser reflejado en la respuesta personalizada.
	 * @return Retorna una cadena "Hola Mundo"
	 */
	@Operation(summary="Primer Ejemplos de EndPoint - Hola Mundo", 
			description="EndPoint ejemplo práctico del uso de la anotación GetMapping")
	@GetMapping(path="/saludo")
	public RespuestaServicio primerEndpoint() {
		return holaServicio.holaMundo();
	}
	
	
	
	
}
