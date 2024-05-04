import java.util.ArrayList;
import java.util.List;

class Alumno implements Comparable<Alumno> 
{
    String nombre;
    float promedio;
    int edad;

    Alumno(String nombre, float promedio, int edad) 
    {
        this.nombre = nombre;
        this.promedio = promedio;
        this.edad = edad;
    }

    String getNombre() 
    {
        return nombre;
    }

    @Override
    public int compareTo(Alumno otro) 
    {
        return Float.compare(this.promedio, otro.promedio);
    }
}

class Grupo 
{
    List<Alumno> alumnos;

    Grupo() 
    {
        alumnos = new ArrayList<>();
    }

    String nombreGrupo() 
    {
        StringBuilder informacion = new StringBuilder("Grupo con " + alumnos.size() + " alumnos:\n");
        for (Alumno alumno : alumnos) {
            informacion.append("Nombre: ").append(alumno.nombre).append(", Promedio: ").append(alumno.promedio).append(", Edad: ").append(alumno.edad).append("\n");
        }
        return informacion.toString();
    }

    void agregarAlumno(Alumno alumno) 
    {
        alumnos.add(alumno);
    }

    float promedioGrupo() 
    {
        if (alumnos.isEmpty()) 
        {
            return 0;
        }
        float sum = 0;
        for (Alumno alumno : alumnos) 
        {
            sum += alumno.promedio;
        }
        return sum / alumnos.size();
    }

    String mejorPromedio() 
    {
        if (alumnos.isEmpty()) 
        {
            return "Ningun alumno en el grupo.";
        }
        Alumno mejorPromedio = alumnos.get(0);
        for (Alumno alumno : alumnos) {
            if (alumno.promedio > mejorPromedio.promedio) 
            {
                mejorPromedio = alumno;
            }
        }
        return "Alumno con el mejor promedio: " + mejorPromedio.nombre + ", Promedio: " + mejorPromedio.promedio + ", Edad: " + mejorPromedio.edad;
    }
}

public class main1
{
    public static void main(String[] args) 
    {
        Grupo grupoA = new Grupo();

        grupoA.agregarAlumno(new Alumno("Fernando", 19, 18));
        grupoA.agregarAlumno(new Alumno("Romario", 17, 18));
        grupoA.agregarAlumno(new Alumno("Jerson", 18, 18));
        grupoA.agregarAlumno(new Alumno("Eddu", 18, 18));

        System.out.println("Informacion del grupo:");
        System.out.println(grupoA.nombreGrupo());
        System.out.println("Promedio de los promedios de los alumnos en el grupo: " + grupoA.promedioGrupo());
        System.out.println(grupoA.mejorPromedio());
    }
}
