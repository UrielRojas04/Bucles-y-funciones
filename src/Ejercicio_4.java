import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        /*Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad
        de compras que han realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.

**Instrucciones**:
- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el
descuento a los clientes que califiquen.
¡Claro! Aquí tienes cinco ejercicios adicionales en Java, orientados a
pequeñas empresas y enfocados en bucles y funciones.
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes: ");
        int num=sc.nextInt();
        String [] clientes=new String[num];
        int [] compras=new int[num];
        int contador=0;
        for (int i=0;i<num;i++){
            System.out.println("Ingresa el nombre y el monto de el cliente "+(i+1));
            sc.nextLine();
            System.out.println("Nombre: ");
            clientes[i]=sc.nextLine();
            System.out.println("Monto: ");
            compras[i]=sc.nextInt();
            if (compras[i]>10){
                contador++;

            }
        }
        String [] clientesConDescuento=new String[contador];
        for (int i=0;i<contador;i++){
            clientesConDescuento=calcularDescuento(clientes,compras,num,contador);
        }
        System.out.println("<<<<CLIENTES CON DESCUENTO>>>>");
        for (int i=0;i<contador;i++){
            System.out.println("_"+clientesConDescuento[i]+" ¡¡- %10 !!");
        }



    }
    public static String [] calcularDescuento(String [] clientes,int [] compras,int num,int contador){
        String [] clientesConDescuento=new String [contador];
        int j=0;
        for (int i=0;i<num;i++){
            if (compras[i]>10){
               clientesConDescuento[j]=clientes[i];
               j++;
            }
        }
        return clientesConDescuento;

    }
}
