import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClasseMain {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int gvet = 0;
		float x = 0;
		float y = 0;
		Punto[] pin;
		Poligono po = null;
		try {
			System.out.print("Quanti punti prendere?: ");
			gvet = Integer.parseInt(br.readLine());
			pin = new Punto[gvet];
			for(int i = 0; i < gvet; i++) {
				System.out.println("--- Punto " + (i + 1) + " ---");
				System.out.print("x: ");
				x = Float.parseFloat(br.readLine());
				System.out.print("y: ");
				y = Float.parseFloat(br.readLine());
				pin[i] = new Punto(x, y);
			}
			po = new Poligono(pin, gvet);
		} catch(Exception e) {
			System.out.println("Errore: tipo di variabile non supportato.");
		}
		
		if(po != null) {
			System.out.print("\n\n");
			System.out.println("Perimetro: " + po.perimetro());
		}
		
		System.out.println("\n\nProgramma terminato...");
	}

}
