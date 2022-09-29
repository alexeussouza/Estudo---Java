package app;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		boolean encontrou = false;
		Scanner leitor;
		int posicao=0;
		
		// TODO Auto-generated method stub
		
		String[] estados = new String[10];
	
		estados[0]= "AC";
		estados[1]= "BA";
		estados[2]= "CE";
		estados[3]= "DF";
		estados[4]= "AM";
		estados[5]= "AP";
		estados[6]= "PB";
		estados[7]= "RN";
		estados[8]= "MS";
		estados[9]= "SP";
		
		for (int i = 0; i < estados.length; i++) {
			System.out.println("Vetor: " + estados[i]);
		}	
		
		leitor = new Scanner(System.in);
		
		//Busca linear inicia na primeira posição do vetor e vai até localizar o item, custo computacional alto em Notação O
		System.out.print("Digite a sigla desejada: ");
<<<<<<< HEAD
		String siglaBusca =  leitor.nextLine().toUpperCase();
=======
		String siglaBusca = leitor.nextLine().toUpperCase();
>>>>>>> 637f7432803f73b6899cc9f6257c748d8a7477a2
		
		for (int i = 0; i < estados.length; i++) {
			if(siglaBusca.equals(estados[i])) {
				encontrou = true;
				posicao = i;
				break;
			}
		}
		
		if(encontrou)	
			
			System.out.println("Achou a sigla, na posicao " + posicao);
		else
			System.out.println("Sigla nao encontrada");	
		
		leitor.close();
	}
}
