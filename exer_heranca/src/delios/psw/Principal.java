package delios.psw;

	public class Principal {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Aluno i = new Aluno("Aluno ADELIO", "  cpf 101.010.101-01-idade ",18);
			System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome+i.cpf+i.idade);
			Professor x= new Professor("Professor MIGUEL", "  cpf 101.010.101-01-idade ",18,"-filosofia");
			System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + x.nome+x.cpf+x.idade+x.Materia);
		}

	}
