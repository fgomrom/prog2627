capital_inicial = float(input("Capital inicial (€): "))
porcentaje_interes = float(input("Interés anual (%): "))
anios = int(input("Años de inversión: "))
meta = float(input("Meta a alcanzar (€): "))

tasa_decimal = porcentaje_interes / 100
capital_final = capital_inicial * ((1 + tasa_decimal) ** anios)
capital_redondeado = round(capital_final, 2)

alcanzo_meta = capital_redondeado >= meta

print("\nCapital final proyectado:", capital_redondeado, "€")
print("¿Se alcanzó la meta de " + str(meta) + " €?:", alcanzo_meta)
