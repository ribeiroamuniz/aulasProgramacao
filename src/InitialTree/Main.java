package InitialTree;


public class Main {
    public static void main(String[] args){
        Lista l1 = new Lista(10);
        l1.adiciona("A");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        l1.adiciona("F");
        System.out.println(l1);
        l1.adiciona(1, "B");
        System.out.println(l1);
        System.out.println("Elemento da posição 2:  "+ l1.obter(2));
       try{ 
        System.out.println("Segundo elemento"+ l1.obter(-1)); //inválido
       } catch(IllegalArgumentException e){
        System.out.println(e.toString());
       }
       System.out.println("Segundo elemento"   + l1.obter(1));
       System.out.println("Posição do elemento C é de: "+ l1.posicaoDe("C"));
       System.out.println("Posição do elemento C é de: "+ l1.posicaoDe("c")); //mostrando o -1 indicando o erro
    }
}