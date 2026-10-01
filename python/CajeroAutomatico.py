monto = int(input("Ingrese el monto a retirar (€): "))

b50 = monto // 50
resto = monto % 50

b20 = resto // 20
resto = resto % 20

b10 = resto // 10
resto = resto % 10

b5 = resto // 5
monedas1 = resto % 5

print("\n--- DESGLOSE DEL CAJERO ---")
print("Billetes de 50€:", b50)
print("Billetes de 20€:", b20)
print("Billetes de 10€:", b10)
print("Billetes de 5€:", b5)
print("Monedas de 1€:", monedas1)
