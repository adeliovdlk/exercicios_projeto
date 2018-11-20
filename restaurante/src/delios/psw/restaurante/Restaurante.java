package delios.psw.restaurante;

public class Restaurante {


		private int totalMesas;
		private float precoPrato;
		private float precoBebida;
		private float totalVendasDia;
		private int mesasOcupadas;
		
		private Mesa_de_restaurante mesas[];
		
		public Restaurante(int qtdMesas) {
			totalMesas = qtdMesas;
			
			mesas = new Mesa_de_restaurante[totalMesas];
			
			for(int i = 0; i < qtdMesas; i++)
				mesas[i] = new Mesa_de_restaurante(5);
		}
		
		public void custoBebida(float precoCusto) {
			precoBebida = precoCusto * 2.5F;
		}
		
		public void custoPrato(float precoCusto) {
			precoPrato = precoCusto * 2.25F;
		}
		
		// Adiciona uma bebida na mesa
		public void adicionaBebida(int mesa) {
			mesas[mesa].adicionaBebida();
		}
		
		// Adiciona um cliente na mesa
		public void adicionaCliente(int mesa) {
			if(!mesas[mesa].estaOcupada())
				mesasOcupadas++;
			
			mesas[mesa].adicionaCliente();
			return;
		}
		
		// Calcula o valor da conta de uma determinada mesa
		public float calculaConta(int mesa) {
			return mesas[mesa].calculaConta(precoBebida, precoPrato);
		}
		
		public float calculaContaPorCliente(int mesa) {
			return mesas[mesa].calculaContaPorCliente(precoBebida, precoPrato);
		}
		
		// Fechar a conta de uma mesa
		public float fecharMesa(int mesa) {
			float valor = mesas[mesa].calculaConta(precoBebida, precoPrato);
			mesas[mesa].fecharMesa();
			totalVendasDia += valor;
			mesasOcupadas--;
			return valor;
		}
	}
