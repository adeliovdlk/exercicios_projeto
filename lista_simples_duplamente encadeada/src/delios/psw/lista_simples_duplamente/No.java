package delios.psw.lista_simples_duplamente;

public class No {
	private No prox;
	private No ant;
	public Object item;
	
	public No(Object item) {
		this.item = item;
		prox = null;
		ant=null;
		
	}
	public No getAnt() {
		return ant;
	}
	public void setAnt(No ant) {
		this.ant = ant;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	

}
