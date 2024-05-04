#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Llamadas 
{
    private:
        string horaInicio;
        string numeroLlamado;
        string horaFin;
        double totalPagar;

    public:

        Llamadas(string inicio, string numero, string fin, double total) : horaInicio(inicio), numeroLlamado(numero), horaFin(fin), totalPagar(total) {}


        string getHoraInicio() const 
        { 
            return horaInicio; 
        }
        string getNumeroLlamado() const 
        { 
            return numeroLlamado; 
        }
        string getHoraFin() const 
        { 
            return horaFin; 
        }
        double getTotalPagar() const 
        { 
            return totalPagar; 
        }
};

int main() 
{

    vector<Llamadas> llamadas;
    llamadas.push_back(Llamadas("09:00", "123456789", "09:15", 10.5));
    llamadas.push_back(Llamadas("10:30", "987654321", "10:45", 8.75));
    llamadas.push_back(Llamadas("11:45", "666666666", "12:00", 12.0));
    llamadas.push_back(Llamadas("14:20", "333333333", "14:35", 9.25));
    llamadas.push_back(Llamadas("16:10", "999999999", "16:25", 11.75));

    string numeroBuscar;
    cout << "Ingrese el numero a buscar: ";
    cin >> numeroBuscar;

    bool encontrado = false;
    cout << "Llamadas para el numero " << numeroBuscar << ":" << endl;
    for (const auto& llamada : llamadas) 
    {
        if (llamada.getNumeroLlamado() == numeroBuscar) 
        {
            cout << "Hora inicio: " << llamada.getHoraInicio() << ", ";
            cout << "Hora fin: " << llamada.getHoraFin() << ", ";
            cout << "Total a pagar: S/" << llamada.getTotalPagar() << endl;
            encontrado = true;
        }
    }

    if (!encontrado) 
    {
        cout << "No se encontraron llamadas para el numero " << numeroBuscar << endl;
    }

    return 0;
}
