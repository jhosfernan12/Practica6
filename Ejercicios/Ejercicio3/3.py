class Llamadas:
    def __init__(self, inicio, numero, fin, total):
        self.horaInicio = inicio
        self.numeroLlamado = numero
        self.horaFin = fin
        self.totalPagar = total

    def getHoraInicio(self):
        return self.horaInicio

    def getNumeroLlamado(self):
        return self.numeroLlamado

    def getHoraFin(self):
        return self.horaFin

    def getTotalPagar(self):
        return self.totalPagar

llamadas = [
    Llamadas("09:00", "123456789", "09:15", 10.5),
    Llamadas("10:30", "987654321", "10:45", 8.75),
    Llamadas("11:45", "666666666", "12:00", 12.0),
    Llamadas("14:20", "333333333", "14:35", 9.25),
    Llamadas("16:10", "999999999", "16:25", 11.75)
]

numeroBuscar = input("Ingrese el numero a buscar: ")

encontrado = False
print("Llamadas para el numero", numeroBuscar, ":")
for llamada in llamadas:
    if llamada.getNumeroLlamado() == numeroBuscar:
        print("Hora inicio:", llamada.getHoraInicio(), ", ", end="")
        print("Hora fin:", llamada.getHoraFin(), ", ", end="")
        print("Total a pagar: S/", llamada.getTotalPagar())
        encontrado = True

if not encontrado:
    print("No se encontraron llamadas para el numero", numeroBuscar)
