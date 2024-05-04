import java.util.ArrayList;
import java.util.Scanner;

class Llamadas 
{
    private String horaInicio;
    private String numeroLlamado;
    private String horaFin;
    private double totalPagar;

    public Llamadas(String inicio, String numero, String fin, double total) 
    {
        this.horaInicio = inicio;
        this.numeroLlamado = numero;
        this.horaFin = fin;
        this.totalPagar = total;
    }

    public String getHoraInicio() 
    {
        return horaInicio;
    }

    public String getNumeroLlamado() 
    {
        return numeroLlamado;
    }

    public String getHoraFin() 
    {
        return horaFin;
    }

    public double getTotalPagar() 
    {
        return totalPagar;
    }
}

public class main3 
{
    public static void main(String[] args) 
    {
        ArrayList<Llamadas> llamadas = new ArrayList<>();
        llamadas.add(new Llamadas("09:00", "123456789", "09:15", 10.5));
        llamadas.add(new Llamadas("10:30", "987654321", "10:45", 8.75));
        llamadas.add(new Llamadas("11:45", "666666666", "12:00", 12.0));
        llamadas.add(new Llamadas("14:20", "333333333", "14:35", 9.25));
        llamadas.add(new Llamadas("16:10", "999999999", "16:25", 11.75));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero a buscar: ");
        String numeroBuscar = scanner.nextLine();

        boolean encontrado = false;
        System.out.println("Llamadas para el numero " + numeroBuscar + ":");
        for (Llamadas llamada : llamadas) 
        {
            if (llamada.getNumeroLlamado().equals(numeroBuscar)) 
            {
                System.out.print("Hora inicio: " + llamada.getHoraInicio() + ", ");
                System.out.print("Hora fin: " + llamada.getHoraFin() + ", ");
                System.out.println("Total a pagar: S/" + llamada.getTotalPagar());
                encontrado = true;
            }
        }

        if (!encontrado) 
        {
            System.out.println("No se encontraron llamadas para el numero " + numeroBuscar);
        }
    }
}
