import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /*Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.

**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de facturas: ");
        int n=sc.nextInt();
        float [] facturasSinInpuesto=new float[n];
        float [] facturasConImpuesto=new float[n];
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el monto de la factura "+(i+1));
            facturasSinInpuesto[i]=sc.nextFloat();
        }
        facturasConImpuesto=calcularImpuesto(facturasSinInpuesto,n);
        /*Imprimir resultados*/
        System.out.println("<<<<Monto Factura>>>>                  <<<<Con inpuesto>>>>");
        System.out.println("");
        for (int i=0;i<n;i++){

            System.out.println("Factura "+(i+1)+": $"+facturasSinInpuesto[i]+" _ _ _ _ _ _ _ _ _ _ _ _ _ $"+facturasConImpuesto[i]);

        }




    }

    public static float[] calcularImpuesto(float[] facturas, int n) {
        float inpuesto=0;
        float[] resultado=new float[n];
        for (int i=0;i<n;i++){
            inpuesto= (float) (facturas[i]*0.21);
            resultado[i]=facturas[i]+inpuesto;
        }
        return resultado;
    }

}
