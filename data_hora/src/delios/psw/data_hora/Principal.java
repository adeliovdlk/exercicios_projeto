package delios.psw.data_hora;


	public class Principal {


	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Horas hora=new Horas((byte)21,(byte)01);
				System.out.println(hora.toString());
				hora.incrementaHora();
				hora.incrementaMinuto();
				System.out.println(hora.toString());
				Horas horaZero=new Horas();
				System.out.println(hora.toString());
				Data data =new Data((byte)1,(byte) 8,(int)2018);
				System.out.println(data);
				
				
				
			}

		}





