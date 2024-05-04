class Ventas:
    def __init__(self):
        self.nombre_cliente = ""
        self.subtotal = 0.0
        self.igv = 0.18
        self.total = 0.0

    def set_venta(self, nombre, sub):
        self.nombre_cliente = nombre
        self.subtotal = sub
        self.igv = self.subtotal * 0.18
        self.total = self.subtotal + self.igv

    def MostrarVenta(self):
        print("Cliente:", self.nombre_cliente)
        print("Subtotal:", self.subtotal)
        print("IGV:", self.igv)
        print("Total:", self.total)

ventas = [Ventas() for _ in range(2)]

for venta in ventas:
    nombre = input("Ingrese nombre del cliente: ")
    subtotal = float(input("Ingrese subtotal: "))
    venta.set_venta(nombre, subtotal)

print("Ventas ingresadas:")
for i, venta in enumerate(ventas):
    print("Venta", i + 1, ":")
    venta.MostrarVenta()
    print()
