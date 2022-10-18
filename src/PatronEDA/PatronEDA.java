package PatronEDA;

import java.util.ArrayList;
import java.util.Scanner;

public class PatronEDA {

	private ArrayList<Evento> eventos;
	private ArrayList<Usuario> usuarios;

	Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		PatronEDA patronEDA = new PatronEDA();
		patronEDA.menu();
	}

	private void menu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		eventos = new ArrayList<>();
		usuarios = new ArrayList<>();
		while (!salir) {

			System.out.println("1. Agregar Usuario");
			System.out.println("2. Agregar Video");
			System.out.println("3. Ejecutar eventos");
			System.out.println("4. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = Integer.parseInt(sn.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado la opcion 1");
				agregarUsuario();
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				agregarVideo();
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3");
				ejecutarEventos();
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}
	}

	public void agregarUsuario() {
		System.out.println("Ingrese el nombre del usuario:");
		String nombre = sn.nextLine();
		Usuario usuario = new Usuario(nombre);
		usuarios.add(usuario);
	}

	public void agregarVideo() {
		System.out.println("Ingrese el nombre del usuario:");
		String nombreUsuario = sn.nextLine();
		System.out.println("Ingrese el nombre del video:");
		String nombreVideo = sn.nextLine();
		Video video = new Video(nombreUsuario, nombreVideo);
		agregarEvento(nombreUsuario, "Agregar");
	}

	public void agregarEvento(String usuario, String Evento) {
		Evento evento = new Evento(usuario, Evento);
		eventos.add(evento);
	}

	public void ejecutarEventos() {
		for (Evento evento : eventos) {
			for (Usuario usuario : usuarios) {
				if (evento.getNombreUsuario().equalsIgnoreCase(usuario.getNombre())) {
					if (evento.getAccion().equalsIgnoreCase("Agregar")) {
						usuario.setNumeroVideos(usuario.getNumeroVideos() + 1);
					} else {
						usuario.setNumeroVideos(usuario.getNumeroVideos() - 1);
					}
				}
			}
		}
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}
