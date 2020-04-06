package py.una.entidad;
import java.util.ArrayList;
import java.util.List;

public class Persona {

	Long celular;
	String nombre;
	String apellido;
	
	List<Mensaje> mensajes;
	
	public Persona(){
		mensajes = new ArrayList<Mensaje>();
	}

	public Persona(Long pcelular, String pnombre, String papellido){
		this.celular = pcelular;
		this.nombre = pnombre;
		this.apellido = papellido;
		
		mensajes = new ArrayList<Mensaje>();
	}
	
	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
}
