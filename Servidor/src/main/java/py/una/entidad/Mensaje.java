package py.una.entidad;

public class Mensaje {
	Long celular_emisor;
	Long celular_receptor;
	String texto;
	
	public Mensaje(Long celular_emisor, Long celular_receptor, String texto) {
		this.celular_emisor = celular_emisor;
		this.celular_receptor = celular_receptor;
		this.texto = texto;
	}
	
	public void setCelularEmisor(Long emisor) {
		this.celular_emisor = emisor;
	}
	
	public void setCelularReceptor(Long receptor) {
		this.celular_receptor = receptor;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Long getCelularEmisor() {
		return this.celular_emisor;
	}
	
	public Long getCelularReceptor() {
		return this.celular_receptor;
	}
	
	public String getTexto() {
		return this.texto;
	}
}
