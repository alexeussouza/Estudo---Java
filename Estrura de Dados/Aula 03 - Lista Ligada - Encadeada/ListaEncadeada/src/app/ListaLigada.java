package app;

public class ListaLigada {
	
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaLigada() {
		tamanho = 0;
	}
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	
	public Elemento getUltimo() {
		return ultimo;
	}
	
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionarValor(String valor) {
		Elemento novoValor = new Elemento(valor);
		
		if(primeiro == null && ultimo == null) {
			primeiro = novoValor;
			ultimo = novoValor;
		}else {
			ultimo.setProximo(novoValor); // Atual deixa de ser ultimo e recebe valor do proximo
			ultimo = novoValor; // ultimo recebe o novoValor
		}
			
		tamanho++;
		
	}
	
	public void removerValor(String valorProcurado) {
		Elemento atual = primeiro;
		Elemento anterior = null;
		
		for (int i = 0; i < getTamanho(); i++) {
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) {
		    	if(atual == primeiro && ultimo == atual) {
		    		primeiro = null;
		    		ultimo = null;
		    		
		    	}else if(atual == primeiro) {
		    	
		    		primeiro = atual.getProximo();
		    		atual.setProximo(null);
		    		
		    		
		    	}else if(atual == ultimo) {
		    		ultimo = anterior;
		    		anterior.setProximo(null);
		    		
		    	}else {
				
					anterior.setProximo(atual.getProximo());
			    	atual = null;
			    }
			    	tamanho--;
			    	break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Elemento posicaoValor(int posicao) {
		
		Elemento valorAtual = primeiro;
		
		for (int i = 0; i < posicao; i++) {
			if(valorAtual.getProximo() != null) {
				valorAtual = valorAtual.getProximo();
			}
		}
		return valorAtual;
	}
}
