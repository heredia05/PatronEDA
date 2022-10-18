package PatronEDA;

public class Usuario {

	private String nombre;
	private int numeroVideos = 0;

	Usuario( String nombre){
		this.nombre = nombre;
	}
	
	public int getNumeroVideos() {
		return numeroVideos;
	}
	
	public void setNumeroVideos(int numeroVideos) {
		this.numeroVideos = numeroVideos;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", numeroVideos=" + numeroVideos + "]";
	}
	
	
}
