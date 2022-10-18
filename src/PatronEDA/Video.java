package PatronEDA;

public class Video {

	private String link = "C:/RutaInventada/EDA";
	private String nombreUsuario;
	private String nombreVideo; 
	
	Video(String nombreUsuario, String nombreVideo){
		this.link = this.link + "/" + nombreUsuario + "/" + nombreVideo;
		this.nombreUsuario = nombreUsuario;
		this.nombreVideo = nombreVideo;
	}
	
	public String getLink() {
		return link;
	}
}
