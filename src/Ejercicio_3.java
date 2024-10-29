import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        /*Una pequeña empresa de servicios tiene una lista de clientes a los que debe
        enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un
arreglo `facturas` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.

*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de clientes: ");
        int num=sc.nextInt();
        int contador=0;
        String[] clientes=new String[num];
        int [] facturas=new int[num];
        for (int i=0;i<num;i++){
            sc.nextLine();
            System.out.println("Ingrese el nombre y la factura pendiente de el cliente "+(i+1));
            System.out.println("Nombre: ");
            clientes[i]=sc.nextLine();
            System.out.println("Monto: ");
            facturas[i]= sc.nextInt();
            if (facturas[i]>500){
                contador++;

            }
        }
        int [] facturasPendientes=new int[contador];
        String [] clientesPendientes=new String[contador];
        int j=0;
        for (int i=0;i<num;i++){
            if (facturas[i]>500){
                facturasPendientes[j]=facturas[i];
                clientesPendientes[j]=clientes[i];
                j++;
            }
        }
        enviarFacturas(facturasPendientes,clientesPendientes,contador);

    }
    public static void enviarFacturas(int []facturas,String[]clientes,int contador){
        System.out.println("<<<<CLIENTES CON FACTURAS MAYORES A 500>>>>");
        for (int i=0;i<contador;i++){
            System.out.println(clientes[i]+": "+"$"+facturas[i]);
        }
    }
}
