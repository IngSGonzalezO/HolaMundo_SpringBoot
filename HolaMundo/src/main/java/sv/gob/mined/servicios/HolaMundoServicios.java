package sv.gob.mined.servicios;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import sv.gob.mined.intefaces.HolaMundoInterfaces;
import sv.gob.mined.modelo.RespuestaServicio;

/**
 * Clase que contiene la logica y implementamos los metodos de la interfaz HolaMundoInterfaces
 * @author Oliver Gonzalez
 */
@Service("HolaMundoServicios")
public class HolaMundoServicios implements HolaMundoInterfaces{

	Logger logger = Logger.getLogger(HolaMundoServicios.class.getName());
	
	/**
	 * Metodo que contiene el mensaje a ser reflejado en la respuesta personalizada.
	 * @return Retorna un objeto con "Hola Mundo"
	 */
	@Override
	public RespuestaServicio holaMundo() {
		return new RespuestaServicio("Hola Mundo") ;
	}
	
	
}
