#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Alumno
{
public:
    string nombre;
    float promedio;
    int edad;

    Alumno(string _nombre, float _promedio, int _edad) : nombre(_nombre), promedio(_promedio), edad(_edad) {}

    string NombreAlumno()
    {
        return nombre;
    }

    bool operator<(Alumno &otro)
    {
        return promedio < otro.promedio;
    }
};

class Grupo
{
public:
    vector<Alumno> alumnos;
    int cantidad;

    Grupo(int _cantidad) : cantidad(_cantidad) {}

    string NombreGrupo()
    { 
        string informacion = "Grupo con " + to_string(alumnos.size()) + " alumnos:\n"; //Tostring convierte a cadena
        for (auto &alumno : alumnos)
        {
            informacion += "Nombre: " + alumno.nombre + ", Promedio: " + to_string(alumno.promedio) + ", Edad: " + to_string(alumno.edad) + "\n";
        }
        return informacion;
    }
    void AgregarAlumno(Alumno alumno)
    {
        alumnos.push_back(alumno);
    }

    float PromedioGrupo()
    {
        if (alumnos.empty())
        {
            return 0;
        }

        float sum = 0.0;
        for (auto &alumno : alumnos)
        {
            sum += alumno.promedio;
        }
        return sum / alumnos.size();
    }

    string MejorPromedio()
    {
        if (alumnos.empty())
        {
            return "Ningún alumno en el grupo.";
        }

        Alumno mejorpromedio = alumnos[0];
        for (auto &alumno : alumnos)
        {
            if (alumno.promedio > mejorpromedio.promedio)
            {
                mejorpromedio = alumno;
            }
        }

        return "Alumno con el mejor promedio: " + mejorpromedio.nombre + ", Promedio: " + to_string(mejorpromedio.promedio) + ", Edad: " + to_string(mejorpromedio.edad);
    }
};

int main()
{
    Grupo grupoA(5);

    grupoA.AgregarAlumno(Alumno("Fernando", 19, 18));
    grupoA.AgregarAlumno(Alumno("Romario", 17, 18));
    grupoA.AgregarAlumno(Alumno("Jerson", 18, 18));
    grupoA.AgregarAlumno(Alumno("Eddu", 18, 18));

    cout << "Informacion del grupo:\n" << grupoA.NombreGrupo() << endl; // Monstramos la info del grupo
    cout << "Promedio de los promedios de los alumnos en el grupo: " << grupoA.PromedioGrupo() << endl; // Mostramos el promedio de los promedios
    cout << grupoA.MejorPromedio() << endl; // Mostramos al alumno con el mejor promedio en el grupo

    return 0;
}
