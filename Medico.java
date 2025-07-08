import java.util.Scanner;

public class Medico{
    
    
    public static void main(String []args){
        
        Scanner scanner = new Scanner (System.in);
        
        // Criando uma array para armazenar 2 consulta
        
        Consulta[] consulta = new Consulta[2];
        
        for(int i = 0; i < consulta.length;i++){  
            
            System.out.print("\n Consulta: " + (i +1));
            
            System.out.print("\n Descrição do exame: ");
            
            String nome = scanner.nextLine();
            
            System.out.print("\n Código do exame:  ");
            
            int codigoExame = scanner.nextInt();
            
            System.out.print("\n Quantidade de exames: ");
            
            int quantidade = scanner.nextInt();
            
            System.out.print("\n Preço dos exames: ");
            
            double valor = scanner.nextDouble();
            
            System.out.print(" \n Valor total dos exames: " + quantidade * valor);
            
            
            
            scanner.nextLine();
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
    }
}

