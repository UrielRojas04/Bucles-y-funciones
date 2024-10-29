import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        /*Una empresa quiere calcular el precio
        final de sus productos después de
        aplicar un descuento
**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y
devuelva el precio final.
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos: ");
        int n=sc.nextInt();
        String[] producto=new String[n];
        float[] preciosOriginales=new float[n];
        float[] preciosConDescuento=new float[n];
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el nombre y el precio del producto "+(i+1));
            sc.nextLine();
            System.out.println("Nombre: ");
            producto[i]=sc.nextLine();
            System.out.println("Precio: ");
            preciosOriginales[i]=sc.nextFloat();
        }
        preciosConDescuento=calcularPrecioFinal(preciosOriginales,n);
        System.out.println("<<<Precio>>>                   <<<Con descuento>>>");
        System.out.println();

        for (int i=0;i<n;i++){
            System.out.println("                        -%10");
            System.out.println(producto[i]+": $"+preciosOriginales[i]+" _ _ _ _ _ _ _ _ _ _  $"+preciosConDescuento[i]);
            System.out.println();
        }


    }
    public static float[] calcularPrecioFinal(float[]precios,int n){
        float descuento=0;
        float[] resultado=new float[n];
        for (int i=0;i<n;i++){
            descuento=(float)(precios[i]*0.10);
            resultado[i]=precios[i]-descuento;
        }
        return resultado;
    }
}
