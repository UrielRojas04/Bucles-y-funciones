import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        /*Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compras: ");
        int n=sc.nextInt();
        float [] compras=new float[n];
        int contador=0;
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el monto de la compra "+(i+1));
            compras[i]=sc.nextFloat();
            if (compras[i]>500){
                contador++;
            }

        }
        /*Arreglo para guardar el numero de la factura*/
        int [] nFactura=new int[contador];
        int j=0;
        for (int i=0;i<n;i++){
            if (compras[i]>500){
                nFactura[j]=i+1;
                j++;
            }

        }

        float [] conDescuento=new float[n];
        conDescuento=aplicarDescuento(compras,n,contador);
        System.out.println("          <<<<COMPRAS CON DESCUENTO>>>>");
        System.out.println();
        for (int i=0;i<contador;i++){
            System.out.println("                          -%15");
            System.out.println("Compra "+nFactura[i]+": $"+compras[nFactura[i]-1]+" _ _ _ _ _ _ _ _ _ _ _ _ $"+conDescuento[i]);
            System.out.println();
        }

    }
    public static float[] aplicarDescuento(float[] compras,int n,int contador){
        float [] conDescuento=new float[contador];
        int j=0;
        float descuento=0;
        for (int i=0;i<n;i++){
            descuento= (float) (compras[i]*0.15);
            if (compras[i]>500){
                conDescuento[j]=compras[i]-descuento;
                j++;
            }
        }
        return conDescuento;

    }
}
