package exercio_7_1;



public class Ponto {
	private float x;
	private float y;
	
	public Ponto(){
		this.x=0;
		this.y=0;
		
	}
	
	public Ponto(float a, float b){
		this.x=a;
		this.y=b;
				
	}
		
	public double getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public float distancia(Ponto p) {
		return (float) Math.sqrt( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
	}
	@Override
	public String toString() {
		return String.format("Ponto: (%.2f, %.2f)", x,y );
	}
	
}