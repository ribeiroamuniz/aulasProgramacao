package InitialTree;

import java.util.ArrayList;

public class Lista {
            private String[] elementos;
            private int tamanho;

            public Lista(int capacidade){
                elementos = new String[capacidade];
                tamanho = 0;
            }

         public void aumentaCapacidade() {
        	 if(tamanho==elementos.length) {
        		 String[] aux = new String[tamanho*2];
        	 }
         }
        public void adiciona(String elemento){
            if(tamanho<elementos.length)
                elementos[tamanho++] = elemento;
        }

        public void adiciona(int posicao, String elemento){
            if(posicao<0 || posicao>=tamanho)
                throw new IllegalArgumentException("Posição "+ posicao+"é inválida");
            for(int i= tamanho-1;i>=posicao;i--)
                elementos[i+1] = elementos[i];
            elementos[posicao] = elemento;
            tamanho++;
            
        }

        public int posicaoDe(String elemento){
            for(int i=0;  i<tamanho;i++)
                if(elementos[i].equals(elemento))
                return i;
            return -1; 
        }
        
        public String obter(int posicao){
            if(posicao<0 || posicao>=tamanho)
            throw new IllegalArgumentException("Posição "+ posicao+"é inválida");
            return elementos[posicao];
        }
        @Override
        public String toString(){
            String retorno = "[";
            if(tamanho>0){
                for(int i=0;i<tamanho-1;i++){
                    retorno+=elementos[i]+", ";
                }
            retorno +=elementos[tamanho-1];
            }
                    return retorno+"]";
        }
       
        
        //ex
         
     public void limpar() {
    	 tamanho = 0;
    	 //corrigido
     }
     
     public boolean estavazia() {
    	if(tamanho==0) {
    		return true;
    	}
		return false;
		//corrigido
     }
     
//     public boolean remove(T elemento) {
//    	 int posicao = posicaoDe[elemento];
//    	 if(posicaoDe[elemento]>=0) {
//    		 return true;
//    	 }
//    	 return false;
//     }

}