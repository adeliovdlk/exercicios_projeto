package delios.psw.restaurante;

public class Mesa_de_restaurante {
		private int qtdClientes; 
		private int qtdBebidas; 
		private int max_Clientes; 

		public Mesa_de_restaurante(int limite)  {
			max_Clientes = limite;
		}
		
		
		public void adicionaBebida() {
			qtdBebidas++;
		}

		public void adicionaCliente() {
			if(qtdClientes < max_Clientes)
				qtdClientes++;
		}
		
		public boolean estaOcupada() {
			if(qtdClientes > 0)
				return true;
			return false;
		}

		// Calcula a conta da mesa
		public float calculaConta(float precoBebida, float precoPrato) {
			float total = qtdBebidas * precoBebida;
			total += qtdClientes * precoPrato;
			return total;
		}

		public float calculaContaPorCliente(float precoBebida, float precoPrato) {
			return calculaConta(precoBebida, precoPrato) / qtdClientes;
		}
		
		public void fecharMesa() {
			qtdBebidas = 0;
			qtdClientes = 0;
		}

	}

