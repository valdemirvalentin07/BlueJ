 import java.util.Scanner;

class numeros{
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println( "Digite um número: ");
        
        Scanner teclado  = new Scanner (System.in);
        
        int n = teclado.nextInt();
        
        System.out.println("Número digitado é: " + n );
        
        if (n % 2 == 0 ){
            System.out.println("Esse número é par " + n);
        } else { System.out.println( "Esse numero é impar " + n);
           
        
    }
 }
}
