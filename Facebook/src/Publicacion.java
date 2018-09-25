import java.util.Date;
import java.util.List;

public class Publicacion {
	protected String publicacion;
	protected List<Usuario> etiquetas;
	protected Evento evento;
	protected List <Evento> eventos;
	protected String comentario;
	
	
	public Publicacion(String publicacion) {
		this.publicacion = publicacion;
	}
	
	public Publicacion(String publicacion, List <Usuario>etiquetas) {
		this.publicacion = publicacion;
		this.etiquetas = etiquetas;
	}
	
	public Publicacion(String publicacion, List <Usuario>etiquetas, Evento evento) {
		this.publicacion = publicacion;
		this.etiquetas = etiquetas;
		this.evento = evento;
	}
	
	
	public void addEvento(Evento nuevoEvento) {
		eventos.add(nuevoEvento);
	}
	

}
