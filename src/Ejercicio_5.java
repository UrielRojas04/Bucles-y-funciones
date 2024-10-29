import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /*Una empresa desea conocer el promedio de satisfacción de sus
        clientes basado en encuestas de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de
los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra
el arreglo y calcule el promedio de satisfacción.
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de clientes: ");
        int clientes=sc.nextInt();
        int [] calificaciones=new int[clientes];
        int promedioSatisfaccion=0;
        for (int i=0;i<clientes;i++){
            System.out.println("Cliente "+(i+1)+"\n.Ingrese su nivel de satisfaccion del 1 al 5");
            calificaciones[i]=sc.nextInt();

        }
        promedioSatisfaccion=calcularPromedioSatisfaccion(calificaciones,clientes);
        System.out.println("El promedio de satisfaccion de los clientes es de: "+promedioSatisfaccion);

    }
    public static int calcularPromedioSatisfaccion(int [] calificaciones,int clientes){
        int suma=0;
        int resultado=0;
        for (int i=0;i<clientes;i++){
            suma+=calificaciones[i];
        }
        resultado=suma/clientes;
        resultado=Math.round(resultado);
        return resultado;
    }

}
