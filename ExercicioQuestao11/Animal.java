/*
11. Criar um sistema em Java O.O partindo da base da UML abaixo:
 */
package ExercicioQuestao11;


import java.util.Scanner;

public class Animal {

   
   
    public static void main(String[] args) {
        
        String especie;
        String cor;
      
        Scanner ler = new Scanner (System.in);
        
        Cachorro c = new Cachorro ();
        Papagaio p = new Papagaio();
        Mosca m = new Mosca ();
        
        System.out.println("**************ANIMAIS***************");
        
        System.out.println("Qual a espécie do animal? ");
        especie = ler.nextLine();
        
        System.out.println("Qual a cor do animal? ");
        cor = ler.nextLine();
        
        System.out.println("Qual a cor do pelo animal? ");
        c.corPelo = ler.nextLine();
        
        
    }
    
}
