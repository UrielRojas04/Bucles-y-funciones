import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*Una pequeña tienda registra sus ventas diarias en un arreglo.
        Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.

**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
- Imprime el total de ingresos mensuales.
*/
        Scanner sc=new Scanner(System.in);
        int [] ventas=new int[10];
        int total=0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese las ventas del dia "+(i+1));
            ventas[i]=sc.nextInt();
        }
        total=calcularIngresosMensuales(ventas);
        System.out.println("Ingresos totales mensuales: "+total);

    }
    public static int calcularIngresosMensuales(int [] ventas){
        int suma=0;
        for (int i=0;i<10;i++){
            suma+=ventas[i];
        }
        return  suma;
    }

}
