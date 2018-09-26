import java.util.Calendar;
import java.util.List;

public class Usuario {
	protected String nombreUsuario;
	protected String apellido;
	protected Calendar fNac;
	protected List <Usuario> amigos;
	protected List <Evento> eventos;
	protected List <Publicacion> publicacion;
	
	public Usuario (String nombreUsuario, String apellido,  Calendar fNac) {
		this.nombreUsuario = nombreUsuario;
		this.apellido = apellido;
		this.fNac = fNac;
	}
	
	
	public Usuario (String nombreUsuario, String apellido, List <Usuario> amigos, List <Evento> eventos, Calendar fNac) {
		this.nombreUsuario = nombreUsuario;
		this.apellido = apellido;
		this.fNac = fNac;
		this.amigos = amigos;
		this.eventos = eventos;
		
	}
	
	public void addAmigo(Usuario nuevoAmigo) {
		amigos.add(nuevoAmigo);
	}
	
	
	public void addEvento(Evento nuevoEvento) {
		eventos.add(nuevoEvento);
	}
	
	public void addPublicacion(Publicacion nuevaPublicacion) {
		publicacion.add(nuevaPublicacion);
	}
	
	public String toString() {
		return nombreUsuario + " " + apellido + " " + fNac;
	}
	
}
