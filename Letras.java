import java.util.Random;
import javax.swing.JFrame;

public class Letras{
	String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
	"K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
	int numRandon = (int) Math.round(Math.random() * 26 );
	String control = abecedario[numRandon];
	String tit = "La letra es: ";		
	public String mostrarLetra(){			
		return control;
	}

	public String mostrarTit(){
		return tit;
	}	
}
 
