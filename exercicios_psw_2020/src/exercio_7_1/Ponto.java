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
	@Override
	public Ponto clone() {
		
		return new Ponto(x,y);
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public double CalculaDistancia(Ponto p){
		return Math.sqrt( (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
	}

	
	

}
