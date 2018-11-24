package delios.psw.lista_simples_duplamente;

public class Lista_duplamente_encad {
			private No cabeca;
			private No fim;
			private int tamanho=0;
	
			public boolean vefica_vazia() {
				return cabeca==null;
			}
			
			public boolean lista_vazia() {
				if (cabeca== null)
					System.out.println("lista vazia");
				return true;
			}
					
			public void inserirInicio(Object obj) {
				No novo = new No(obj);
				if (lista_vazia()) {//se a lista esta vazia 
					cabeca= novo;//cabeca =novo
					fim=novo;
				}else { //caso ja tenha algum no na lista
					 cabeca.setAnt(novo);// novo aponta para o cabeca
					 novo.setProx(cabeca);
					 cabeca=novo;
				}
				tamanho++;
				
			}
			public Object remove_inicio(Object obj) {
				
				if (lista_vazia()) {
					// funcao para testar lissta vazia
				}
				No cursor=cabeca;//
				cabeca=cursor.getProx();//cabeca que agora eo segungo agora aponta para o proximo elemento
				cursor.setProx(null); //antiga cabeca nao aponta para nad
				tamanho--;
				return obj;
	}
			public void insere_fim(Object obj) {
				No novo = new No(obj);
				if (lista_vazia()) {// funcao para testar lissta vazia
				cabeca=novo;
				fim=novo;
				}else{//caso ja tenha algum no na lista
					novo.setAnt(novo);
					fim=novo;				
				}
				tamanho++;
			}
			
			public Object remove_fim(Object obj) {
				
				if (lista_vazia())return null;
				No cursor= fim;
				
				if(fim.getAnt()!=null){
					fim=fim.getAnt();
					fim.getProx().setAnt(null);
					fim.setProx(null);
				}else{
					cabeca=null;
					fim=null;
				}				
			tamanho --;
			return obj;
		
				
	      }
}
