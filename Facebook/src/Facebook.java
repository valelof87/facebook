import java.util.Calendar;
import java.util.GregorianCalendar;
public class Facebook {

	public static void main(String[] args) {
		
		Calendar fnac = new GregorianCalendar(1983, Calendar.AUGUST, 19);
		Usuario u1 = new Usuario("Valeria", "Lofrano",fnac);
		
		System.out.println(u1); // no me imprime la fecha..
		
		

	}

}
