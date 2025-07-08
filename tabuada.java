 import java.util.Scanner;


class tabuada {
    
    public static void main (String args[]){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println( "Digite número da tabuada desejada: ");
        
        Scanner teclado = new Scanner (System.in);
        
        int n = teclado.nextInt();
        System.out.println( "Número digitado é:" + n);
        
        
        
        for ( int i = 1; i<=10; i++)
        {
        
            
            System.err.println ( n + " x " + i + " = " +  ( n * i ));
        }
    }
}