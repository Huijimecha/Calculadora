
package trabajo1progra;

import java.util.Scanner;

public class Trabajo1Progra {


    public static void main(String[] args) {
        
        double num1, num2 , conversion;
        double suma, resta, multiplicacion, division;
        double seno, coseno , tangente;
        double raiz , potencia , porcentajeIVA;
        
        String Seguir;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese el Tipo De Operacion");
            System.out.println("\n" +
                            "1: Operaciones básicas ( + , - , * , / ) \n" +
                            "2: Funciones trigonométricas ( Seno , Coseno , Tangente ) \n" +
                            "3: Raíz enésima y potencia enésima ( √ , ^ ) \n" +
                            "4: Cálculo del porcentaje de IVA \n");
            int TipoOperacion = input.nextInt();

            switch(TipoOperacion){
                case 1:
                    System.out.println("Ingrese el primer número: ");
                    num1 = input.nextDouble();

                    System.out.println("Ingrese el segundo número: ");
                    num2 = input.nextDouble();

                    suma = num1 + num2;
                    resta = num1 - num2;
                    multiplicacion = num1 * num2;

                    System.out.println("\nResultados\n");
                    System.out.println("Suma: " + suma );
                    System.out.println("Resta: " + resta );
                    System.out.println("Multiplicación: " + multiplicacion );
                    
                    if (num2 != 0) {
                        division = num1 / num2;
                        System.out.println("División: " + division);
                    } else {
                        System.out.println("Error matemático: División por cero");
                    }
                    
                    break;

                case 2:
                    System.out.println("Ingrese el número: ");
                    num1 = input.nextDouble();

//                    conversion = (num1 * Math.PI)/180;
                    seno = Math.sin(num1);
                    coseno = Math.cos(num1);

                    System.out.println("\nResultados\n");
                    System.out.println("Seno: " + seno);
                    System.out.println("Coseno: " + coseno);
                    if (num1 % (Math.PI / 2) != 0) {
                        tangente = Math.tan(num1);
                        System.out.println("Tangente: " + tangente);
                    } else {
                        System.out.println("Error matemático: Valor indeterminado en la tangente");
                    }
                    
                    break; 

                case 3:

                    System.out.println("Ingrese el primer número al realizar la operacion: ");
                    num1 = input.nextDouble();

                    System.out.println("Ingrese el segundo número: ");
                    num2 = input.nextDouble();

                    raiz = Math.pow(num1, 1.0 / num2);
                    potencia = Math.pow(num1, num2);

                    System.out.println("\nResultados\n");
                    System.out.println("Raíz enésima: " + raiz);
                    System.out.println("Potencia enésima: " + potencia);
                    break;

                case 4:
                    System.out.println("Ingrese el número: ");
                    num1 = input.nextDouble();
                    System.out.println("Ingrese el porcentaje de IVA: ");
                    porcentajeIVA = input.nextDouble();
                    double totalIVA = (porcentajeIVA / 100) * num1;

                    System.out.println("\nResultados\n");
                    System.out.println("Porcentaje de IVA: " + totalIVA);
                    break;

                default:
                    System.out.println(" La opcion ingresada " + TipoOperacion + " No esta en las opciones disponibles" );
                    break;           
            }
            
            System.out.println("Desea seguir : ");
            Seguir = input.next();
        } while (!Seguir.equals("No") && !Seguir.equals("no"));
        

    }
    
}
