/*
 Separar los numeros pares e impares de un arreglo
 */
package video84;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int arreglo[] = new int[10];
        int conteo_pares=0,conteo_impares=0;
        
        System.out.println("Llenar el arreglo");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
            
            if (arreglo[i] % 2==0){  // Si el numero es par
                conteo_pares++;
            }
            else {   // Si el numero es impar
                conteo_impares++;
            }
            
            
            
        }
        
        int par[] = new int[conteo_pares]; // Creamos el arreglo para almacenar los numeros pares
        int impar[] = new int[conteo_impares]; // Creamos el arreglo para los impares
        
        conteo_pares=0;
        conteo_impares=0;
        
        // Almacenamos los numeros pares en su arreglo y los impares tambien
        for (int i=0;i<10;i++){
            if (arreglo[i] % 2 ==0){ // Si el numero es par
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            }
            else { // Si el numero es impar
                impar[conteo_pares] = arreglo[i];
                conteo_impares++;
            }
        }
        
        System.out.print("\nArreglo pares: ");
        for (int i=0;i<conteo_pares;i++){
            System.out.print(par[i]+" - ");
        }
        System.out.println("");
        
        System.out.print("\nArreglo impares: ");
        for (int i=0;i<conteo_impares;i++){
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");
        
        
        
    }
    
}
