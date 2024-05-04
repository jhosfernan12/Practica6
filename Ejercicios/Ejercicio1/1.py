class Alumno:
    def __init__(self, nombre, promedio, edad):
        self.nombre = nombre
        self.promedio = promedio
        self.edad = edad

    def nombre_alumno(self):
        return self.nombre

    def __lt__(self, otro):
        return self.promedio < otro.promedio

class Grupo:
    def __init__(self):
        self.alumnos = []

    def NombreGrupo(self):
        informacion = f"Grupo con {len(self.alumnos)} alumnos:\n"
        for alumno in self.alumnos:
            informacion += f"Nombre: {alumno.nombre}, Promedio: {alumno.promedio}, Edad: {alumno.edad}\n"
        return informacion

    def AgregarAlumno(self, alumno):
        self.alumnos.append(alumno)

    def PromedioGrupo(self):
        if not self.alumnos:
            return 0
        return sum(alumno.promedio for alumno in self.alumnos) / len(self.alumnos)

    def MejorPromedio(self):
        if not self.alumnos:
            return "Ningún alumno en el grupo."
        mejorpromedio = max(self.alumnos, key=lambda alumno: alumno.promedio)
        return f"Alumno con el mejor promedio: {mejorpromedio.nombre}, Promedio: {mejorpromedio.promedio}, Edad: {mejorpromedio.edad}"


grupoA = Grupo()

grupoA.AgregarAlumno(Alumno("Fernando", 19, 18))
grupoA.AgregarAlumno(Alumno("Romario", 17, 18))
grupoA.AgregarAlumno(Alumno("Jerson", 18, 18))
grupoA.AgregarAlumno(Alumno("Eddu", 18, 18))

print("Informacion del grupo:")
print(grupoA.NombreGrupo())
print("Promedio de los promedios de los alumnos en el grupo:", grupoA.PromedioGrupo())
print(grupoA.MejorPromedio())
