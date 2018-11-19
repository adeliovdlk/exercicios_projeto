package delios.psw.data_hora;


	public class Horas {
		private byte hora;//atributo ou variavel de instancia
		private byte minuto;
		private byte validaHora(byte hora){
			if(hora>23)
				return 0;
			return hora;
		}
		public Horas(byte hora, byte minuto){//escopo diferente da variavel e instancia menor q a variavel de instancia
			
			this.hora=validaHora(hora);
			this.minuto=minuto;// this é este ou seja objeto
			
		}
		//polimorfismo
		public Horas(){ //construtor sobrecarregado
			hora=0;
			minuto=0;
		}
		public byte incrementaHora(){
			hora++;
			return hora;
		}
		public void zerar(){
			hora=0;
			minuto=0;
		}
		public void setHora(byte hora){
			this.hora=validaHora(hora);
		}
		public byte getHora(){
			return hora;
		}
		
		public String toString(){
			return String.format("%02d:%02d",hora,minuto);
		}
		public byte incrementaMinuto(){
			minuto++;
			return minuto;
		}

}
