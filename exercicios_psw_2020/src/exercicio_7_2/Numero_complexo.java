package exercicio_7_2;

public class Numero_complexo {
	public double parteReal;
	public double parteImaginaria;
	public Numero_complexo() {
		this.parteReal = 0;
		this.parteImaginaria = 0;
		
	}
	
	public Numero_complexo(double a , double b) {
		this.parteReal = a;
		this.parteImaginaria = b;
	}

	public double getParteReal() {
		return parteReal;
		
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	public Numero_complexo adicao(Numero_complexo outro){
		double real,imaginario;
		real=parteReal+ outro.parteReal;
		imaginario= parteImaginaria+ outro.parteImaginaria;
		return new Numero_complexo(real,imaginario);			
	}
	
	public Numero_complexo subtracao(Numero_complexo outro){
		double real,imaginario;
		real=parteReal - outro.parteReal;
		imaginario= parteImaginaria - outro.parteImaginaria;
		return new Numero_complexo(real,imaginario);			
	}
	@Override
	public String toString() {
		return String.format("numero real : imaginario  (%.2f, %.2f)", getParteReal(),getParteImaginaria());
	}
	

}
