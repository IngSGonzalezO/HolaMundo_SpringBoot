package sv.gob.mined.modelo;


/**
 * Clase RespuestaServicio donde se estructura los atributos para estructurar la respuesta.
 * @author Oliver González
 * 
 */
public class RespuestaServicio {

	private String estado;
	private String dato;
	private String mensaje;
	
	public RespuestaServicio(String dato) {
		this.estado = "Éxito";
		this.dato = dato;
		this.mensaje = "El mensaje generado de forma exitosa.";
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
