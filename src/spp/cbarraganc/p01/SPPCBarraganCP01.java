
package spp.cbarraganc.p01;
import java.util.Scanner;

/**
 *
 * @author Car
 */
public class SPPCBarraganCP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        double L, G, cm, in, m, ft, km, mi, Cel, Far, gram, lb ;
        
        Scanner kb = new Scanner(System.in);
        int opEntrada, a;
        
        
        
       //Menú
        System.out.println("===============================");
        System.out.println("Calculadora de conversiones");
        System.out.println("===============================");
        System.out.println("Opciones:");
        System.out.println("1. Conversión de Líquidos.");
        System.out.println("2. Conversión de distancias.");
        System.out.println("3. Conversión de temperaturas.");
        System.out.println("4. Conversión de pesos.");
        System.out.println("5. Salir");
        opEntrada = kb.nextInt(); 
        
        switch (opEntrada){
            case 1:
                System.out.println("¿Que método desea usar?");
                System.out.println("1. Litros ---> Galones");
                System.out.println("2. Galones ---> Litros");
                System.out.println("3. Cancelar");
                opEntrada = kb.nextInt();
                
                 switch (opEntrada){
                     case 1:
                         System.out.println("Introduzca cantidad de Litros que desea convertir:");
                         L=kb.nextDouble();
                         G=L*0.264172;
                         System.out.println("Su resutlado es: " + G + " Galones.");
                         break;
                     case 2:
                         System.out.println("Introduzca cantidad de Galones que desea convertir:");
                         G=kb.nextDouble();
                         L=G*3.78541;
                         System.out.println("Su resutlado es: " + L + " Litros.");
                         break;
                         default:
                System.out.println("¡Hasta la vista baby!");
                }
                break;
                     
            case 2: 
                System.out.println("¿Que método desea usar?");
                System.out.println("1. Sistema Métrico ----> Sistema Inglés ");
                System.out.println("2. Sistema Inglés ---> Sistema Métrico Decimal");
                System.out.println("3 Cancelar");
                opEntrada= kb.nextInt();
                
                switch (opEntrada){
                    case 1:
                         System.out.println("Seleccione unidad a covertir:");
                         System.out.println("1. Centímetros.");
                         System.out.println("2. Metros.");
                         System.out.println("3. Kilometros");
                         opEntrada= kb.nextInt();
                         
                         switch (opEntrada){
                     case 1:
                         System.out.println("Introduzca cantidad de Centímetros que desea convertir:");
                         cm=kb.nextDouble();
                         in=cm/2.54;
                         System.out.println("Su resutlado es: " + in + " Pulgadas.");
                         break;
                     case 2:
                         System.out.println("Introduzca cantidad de Metros que desea convertir:");
                         m=kb.nextDouble();
                         ft=m/.3048;
                         System.out.println("Su resutlado es: " + ft + " Pies.");
                         break;
                     case 3:
                         System.out.println("Introduzca cantidad de Kilometros que desea convertir:");
                         km=kb.nextDouble();
                         mi=km*1.60934;
                         System.out.println("Su resutlado es: " + mi + " Millas.");
                         break;
                     default:
                         System.out.println("¡Hasta la vista baby!");
                 }break;
                        
                     case 2:
                         System.out.println("Seleccione unidad a covertir:");
                         System.out.println("1. Pulgadas.");
                         System.out.println("2. Pies.");
                         System.out.println("3. Millas");
                         opEntrada=kb.nextInt();
                         
                         switch (opEntrada){
                     case 1:
                         System.out.println("Introduzca cantidad de Pulgadas que desea convertir:");
                         ft=kb.nextDouble();
                         cm=ft*2.54;
                         System.out.println("Su resutlado es: " + cm + " Centímetros.");
                         break;
                     case 2:
                         System.out.println("Introduzca cantidad de Pies que desea convertir:");
                         ft=kb.nextDouble();
                         m=ft*.3048;
                         System.out.println("Su resutlado es: " + m + " Metros.");
                         break;
                     case 3:
                         System.out.println("Introduzca cantidad de Millas que desea convertir:");
                         mi=kb.nextDouble();
                         km=mi/1.60934;
                         System.out.println("Su resutlado es: " + km + " Millas.");
                         break;
                     default:
                         System.out.println("¡Hasta la vista baby!");
                 }break;
                default:
                System.out.println("¡Hasta la vista baby!");
                }break;
                
            case 3:
                System.out.println("¿Que método desea usar?");
                System.out.println("1. Celsius ---> Farenheit");
                System.out.println("2. Farenheit ---> Celsius");
                System.out.println("3. Cancelar");
                opEntrada = kb.nextInt();
                
                switch (opEntrada){
                     case 1:
                         System.out.println("Introduzca cantidad de grados Celsius que desea convertir:");
                         Cel=kb.nextDouble();
                         Far=Cel*(9/5)+32;
                         System.out.println("Su resutlado es: " + Far + "° Farenheit.");
                         break;
                     case 2:
                         System.out.println("Introduzca cantidad de grados Farenheit que desea convertir:");
                         Far=kb.nextDouble();
                         Cel=(Far-32)*(5/9);
                         System.out.println("Su resutlado es: " + Cel + "° Celsius.");
                         break;
                         default:
                             System.out.println("¡Hasta la vista baby!");
                }break;
                
            case 4:
                System.out.println("¿Que método desea usar?");
                System.out.println("1. gramo ---> libra");
                System.out.println("2. libra ---> gramo");
                opEntrada = kb.nextInt();
                
                switch (opEntrada){
                     case 1:
                         System.out.println("Introduzca cantidad de gramos que desea convertir:");
                         gram=kb.nextDouble();
                         lb=gram/453.592;
                         System.out.println("Su resutlado son: " + lb + " libras.");
                         break;
                     case 2:
                         System.out.println("Introduzca cantidad de libras que desea convertir:");
                         lb=kb.nextDouble();
                         gram=lb*453.592;
                         System.out.println("Su resutlado son: " + gram + " gramos.");
                         break;
                }break;
                default:
                System.out.println("¡Hasta la vista baby!");
                    

    
    }
    }
}
    
    
