package delios.psw.data_hora;
	public class Data {
	private byte dia;
	private byte mes;
	private int ano;
	
	public Data(){
		dia=1;
		mes=1;
		ano=2000;
	}
	public Data(byte dia,byte mes,int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
		
	}
	public String toString(){
		return String.format("%d/ %d/ %d,",dia,mes,ano);
	}



}





