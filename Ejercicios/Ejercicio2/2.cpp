#include <iostream>
#include <string>

using namespace std;

class Ventas 
{
private:
    string nombreCliente;
    float subtotal;
    float igv; 
    float total;

public:

    Ventas() 
    {
        nombreCliente = "";
        subtotal = 0.0;
        igv = 0.18; 
        total = 0.0;
    }


    void setVenta(string nombre, float sub) 
    {
        nombreCliente = nombre;
        subtotal = sub;
        igv = subtotal * 0.18; 
        total = subtotal + igv; 
    }


    void mostrarVenta() 
    {
        cout << "Cliente: " << nombreCliente << endl;
        cout << "Subtotal: " << subtotal << endl;
        cout << "IGV: " << igv << endl;
        cout << "Total: " << total << endl;
    }
};

int main() 
{
    Ventas ventas[10]; 

    for (int i = 0; i < 2; ++i) 
    {
        string nombre;
        float subtotal;

        cout << "Ingrese nombre del cliente: ";
        getline(cin, nombre);
        cout << "Ingrese subtotal: ";
        cin >> subtotal;

        ventas[i].setVenta(nombre, subtotal);
    }

    cout << "Ventas ingresadas:" << endl;
    for (int i = 0; i < 2; ++i) {
        cout << "Venta " << i + 1 << ":" << endl;
        ventas[i].mostrarVenta();
        cout << endl;
    }

    return 0;
}
