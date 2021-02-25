
package project01;

import java.util.Scanner;


public class Project01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multiplicando;
        int inicio;
        int fim;
        boolean flag = false;
        
        do{
            System.out.println("Digite o valor do multiplicando");
            multiplicando = teclado.nextInt();
            if (multiplicando > 0){
                flag = true;
                
            } else {
                System.out.println("Valor invalido.Digite novamente");
                
            }
        } while( flag == false );
        
        flag = false;
        
        do {
            System.out.println("Digite o valor de inicio do intervalo");
            inicio = teclado.nextInt();
            System.out.println("Digite o fim do intervalo");
            fim = teclado.nextInt();
            if ((inicio < 0)|| (inicio > 3000) || (fim > 3000)|| (fim < inicio)){
                System.out.println("intervalo invalido. digite novamente");
            } else{
                flag = true;
            }
        } while (flag == false);
        
        System.out.println("Multiplicando: "+multiplicando);
        System.out.println("Inicio do intervalo: "+inicio);
        System.out.println("Fim do intervalo: "+fim);
        
        if (inicio >= fim){
            System.out.println("O inicio do intervalo deve ser menor que o seu fim");
        } else if (fim - inicio <= 9){
            for (int i= inicio; i <= fim;i++){
            System.out.println(multiplicando+" x "+ i+ " = "+ multiplicando*i);
        } 
                
            }else{
            System.out.println("ERRO - o intervalo deve ser menor que 10");
            
        
        
        }   
    }
}
            
            
    

