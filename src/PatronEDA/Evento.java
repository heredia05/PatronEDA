package PatronEDA;

public class Evento {
	
	private String nombreUsuario;
	private String accion;
	
	Evento(String nombreUsuario, String accion){
		this.nombreUsuario = nombreUsuario;
		this.accion = accion;
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getAccion() {
		return this.accion;
	}

}
