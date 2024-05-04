import java.util.Scanner;

class Ventas 
{
    private String nombreCliente;
    private float subtotal;
    private final float igv = 0.18f;
    private float total;

    public Ventas() 
    {
        nombreCliente = "";
        subtotal = 0.0f;
        total = 0.0f;
    }

    public void setVenta(String nombre, float sub) 
    {
        nombreCliente = nombre;
        subtotal = sub;
        total = subtotal * (1 + igv);
    }

    public void mostrarVenta() 
    {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + subtotal * igv);
        System.out.println("Total: " + total);
    }
}

public class main2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Ventas[] ventas = new Ventas[2];

        for (int i = 0; i < 2; ++i) 
        {
            ventas[i] = new Ventas();
            System.out.print("Ingrese nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese subtotal: ");
            float subtotal = Float.parseFloat(scanner.nextLine());
            ventas[i].setVenta(nombre, subtotal);
        }

        System.out.println("Ventas ingresadas:");
        for (int i = 0; i < 2; ++i) 
        {
            System.out.println("Venta " + (i + 1) + ":");
            ventas[i].mostrarVenta();
            System.out.println();
        }
    }
}
