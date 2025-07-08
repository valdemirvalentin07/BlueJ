 class exececao {
     public static void main (String args[]){
         int num1, num2;
         try {
             
             num1 = 45;
             num2 = 3;
             System.out.println("Soma = " + (num1 + num2));
             System.out.println("Subtração = "+ (num1 - num2));
             System.out.println("Multiplicação = "+ (num1 * num2));
             System.out.println("Divisão = "+ (num1 / num2));
            }
            catch(ArithmeticException e) {
                System.out.println (" Erro de divisão por zero!");
            }
            catch(ArrayIndexOutOfBoundsException e){
                 System.out.println (" Numero de argumentos inválidos!");   
            }
            catch(NumberFormatException e){
                 System.out.println (" Digite apenas números inteiros!");
            }
         
     }
 }