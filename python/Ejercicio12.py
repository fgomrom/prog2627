#Ejercicio12
#== > >= <= < and or not

# Creo variables de entrada y las convierto al tipo esperado
edad = int(input("Edad: "))
es_estudiante_input = input("¿Es estudiante? (si/no): ")
monto_compra = float(input("Monto de compra: "))

# Conversión de la respuesta en texto a booleano
es_estudiante = (es_estudiante_input == "si")

# Evaluación lógica
es_tercera_edad = edad > 65
estudiante_con_compra_alta = es_estudiante and (monto_compra > 50)

aplica_descuento = es_tercera_edad or estudiante_con_compra_alta

print("¿Aplica descuento?:", aplica_descuento)

