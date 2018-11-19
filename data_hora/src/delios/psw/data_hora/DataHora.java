package delios.psw.data_hora;

public class DataHora {
	private Data data;
	private Horas hora;
	
	public DataHora(){
		data=new Data();
		hora=new Horas();
		
	}
	public String toString(){
		return String.format("%s - %s",data,hora);
	}

}


