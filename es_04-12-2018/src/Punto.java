
public class Punto {
	private float x;
	private float y;
	
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float distanza(Punto p) {
		float dx = x - p.getX();
		float dy = y - p.getY();
		return (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
}
