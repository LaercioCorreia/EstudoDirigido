
package ExercicioQuestao2;


public class Produto {
    
    private String nome;
    private double valor;
  
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    
        }
    
public double calcularDesconto(){
       
      
       
        if (this.valor >= 100){
           
            valor = valor - (valor * 0.025);
            System.out.println("\n" +"*************************");
            System.out.println("Esse produto possui desconto");
        
        } else {
            System.out.println("\n" +"*************************");
            System.out.println("Esse produto não possui desconto");
            valor = valor;
            
       }
        return valor;
        
    }
@Override
        public String toString(){
               return  "*************************" +
                       "\n" + "\n" + "DESCRIÇÃO DO PRODUTO: " + this.nome + "\n" 
                       + "VALOR DO PRODUTO: " + this.valor + "\n"
                       + "VALOR FINAL DO PRODUTO É: R$" 
                       + calcularDesconto();
                       
      
    }

}

   




    

