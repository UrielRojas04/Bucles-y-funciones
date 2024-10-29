import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*Una tienda de electrónica necesita un informe del inventario, mostrando
        los productos que tienen menos de 5 unidades en stock.

**Instrucciones**:
- Crea un arreglo `productos` que almacene los nombres de los productos y
otro arreglo `stock` que almacene la cantidad de stock de cada producto.
- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.
*/
        Scanner sc=new Scanner(System.in);
        int cantidad=0;
        int contador=0;
        System.out.println("Ingrese la cantidad de productos en su inventario: ");
        cantidad=sc.nextInt();
        String [] productos=new String[cantidad];
        int [] stock=new int[cantidad];
        for (int i=0;i<cantidad;i++){
            System.out.println("Ingrese el nombre y el stock del producto "+(i+1));
            sc.nextLine();
            System.out.println("Nombre: ");
            productos[i]=sc.nextLine();
            System.out.println("Stock: ");
            stock[i]=sc.nextInt();
            /*Cuento la cantidad de productos con stock bajo para crear un arreglo luego con esa dimension*/
            if (stock[i]<5){
                contador++;
            }
        }
        /*Creo variable 'j' que representara indice de el arreglo 'menosDe5'*/
        int j=0;
        /*Creo el arreglo con la dimension correspondiente*/
        int [] menosDe5=new int[contador];
        String [] nombreMenosDe5 =new String[contador];
        for (int i=0;i<cantidad;i++){
            if (stock[i]<5){
                menosDe5[j]=stock[i];
                nombreMenosDe5[j]=productos[i];
                j++;
            }

        }
        generarReporteBajoStock(menosDe5,nombreMenosDe5,contador);

    }
    public static void generarReporteBajoStock(int[] stock,String[]nombre,int contador){
        System.out.println("<<<<PRODUCTOS CON STOCK BAJO>>>>");
        for (int i=0;i<contador;i++){
            System.out.println(nombre[i]+": "+stock[i]);

        }
    }
}
