/*
2.Analisando o seguinte diagrama de classes, qual o código fonte representa da linguagem Java sabendo 
que o cálculo de desconto do produto é de 2,5% sobre o valor do mesmo. 
Crie a classe especificada no diagrama;
 */
package ExercicioQuestao2;

import java.util.Scanner;
public class MainProduto {

 
    public static void main(String[] args) {
       
        Scanner ler = new Scanner (System.in);
        Produto p1 = new Produto();
    
    
        System.out.println("************SISTEMA DE VENDAS*************" + "\n");
        
        System.out.println("Digite o nome do produto: ");
        p1.setNome(ler.nextLine());
        
        System.out.println("Digite o valor do produto: ");
        p1.setValor(ler.nextDouble());
        
        System.out.println(p1);        
        
    
    }
    
}
