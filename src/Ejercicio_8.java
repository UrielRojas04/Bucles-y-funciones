import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        /*Una empresa de servicios necesita llevar el control de las horas trabajadas por
        sus empleados durante una semana.

**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas`
con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal
(a razón de $15 por hora trabajada).
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        int n=sc.nextInt();
        String[] empleados=new String[n];
        int[] horasTrabajadas=new int[n];
        int[] pagoSemanal=new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Ingrese el nombre y la cantidad de horas del empleado "+(i+1));
            sc.nextLine();
            System.out.println("Nombre: ");
            empleados[i]=sc.nextLine();
            System.out.println("Horas trabajadas: ");
            horasTrabajadas[i]=sc.nextInt();
        }
        pagoSemanal=calcularPagoSemanal(horasTrabajadas,n);
        int suma=0;
        System.out.println("<<<<Horas>>>>             <<<<Pago semanal>>>>");
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.println(empleados[i]+" :"+horasTrabajadas[i]+" hs _ _ _ _ _ _ _ _ _ _ _ _ _ $"+pagoSemanal[i]);
            suma+=pagoSemanal[i];
        }
        System.out.println();
        System.out.println("Pago total a empleados: "+suma);;

    }
    public static int[] calcularPagoSemanal(int []horas,int n){
        int pagoxHora=15;
        int[] resultado=new int[n];
        for (int i=0;i<n;i++){
            resultado[i]=horas[i]*pagoxHora;

        }
        return  resultado;

    }
}
