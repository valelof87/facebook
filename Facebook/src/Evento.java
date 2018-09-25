import java.util.Date;
import java.util.List;

public class Evento {
	protected String nombreEvento;
	protected Date fechaEvento;
	protected String horario;
	protected String lugar;
	
	protected Evento (String nombreEvento, Date fechaEvento, String horario, String lugar) {
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.horario = horario;
		this.lugar = lugar;
	}
	
	
}
