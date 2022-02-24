import java.text.DecimalFormat;

public class Velocidades {
    public static void main(String[] args) {
        float quilometroHora = 0.0f;
		float metroSegundo, milhaHora, pesSegundo;
		DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(" km/h \t m/s \t mph \t ft/s");
		while (quilometroHora <= 50.0f) {
			metroSegundo = quilometroHora*0.2778f;
			milhaHora = quilometroHora*0.6214f;
			pesSegundo = quilometroHora*0.9113f;
			System.out.println(df.format(quilometroHora) + "\t" + df.format(metroSegundo)  + "\t" + df.format(milhaHora) + "\t" + df.format(pesSegundo) + "\t");
			quilometroHora+=0.5f;
		}        
    }
}