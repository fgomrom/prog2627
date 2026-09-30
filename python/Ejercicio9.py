#Ejercicio 9
# Entrada de datos
nombre = input("Ingresa tu nombre: ")
anio_nacimiento_str = input("Ingresa tu año de nacimiento: ")
altura_str = input("Ingresa tu altura en metros: ")

# Conversión de tipos
anio_nacimiento = int(anio_nacimiento_str)
altura = float(altura_str)
edad = 2026 - anio_nacimiento

# Muestra de resultados
print("\n--- FICHA REGISTRADA ---")
print("Nombre:", nombre, "(Tipo:", str(type(nombre)) + ")")
print("Edad:", edad, "años (Tipo:", str(type(edad)) + ")")
print("Altura:", altura, "m (Tipo:", str(type(altura)) + ")")

