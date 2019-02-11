
public class Poligono {
	private Punto[] punti;
	private int qpunti;
	
	public Poligono(Punto[] p, int qp) {
		qpunti = qp;
		punti = p;
	}
	
	public float perimetro() {
		float p = 0;
		for(int i = 0; i < qpunti - 1; i++) {
			p += punti[i].distanza(punti[i+1]);
		}
		if(qpunti > 2) {			
			p += punti[qpunti - 1].distanza(punti[0]);
		}
		
		return p;
	}
}
