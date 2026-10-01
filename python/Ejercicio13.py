#Ejercicio13
# 1. Entrada de datos
cliente = input("Nombre del cliente: ")
producto = input("Producto: ")
precio_unitario = float(input("Precio unitario (€): "))
cantidad = int(input("Cantidad: "))
porcentaje_iva = float(input("Porcentaje IVA (%): "))
incluye_propina_txt = input("¿Incluir propina de 2€? (si/no): ")

# 2. Procesamiento de datos y lógica
subtotal = precio_unitario * cantidad
monto_iva = subtotal * (porcentaje_iva / 100)

# Convertir la respuesta de propina a valor numérico (2.0 o 0.0) mediante expresión booleana
incluye_propina = (incluye_propina_txt == "si")
monto_propina = 2.0 * incluye_propina  # True actúa como 1, False como 0

total_final = subtotal + monto_iva + monto_propina
es_cliente_vip = total_final > 30.0

# 3. Impresión formateada del tique
print("\n" + "="*36)
print("         TIQUE DE CAFETERÍA")
print("="*36)
print("Cliente:", cliente)
print("Producto:", producto, "x", cantidad)
print("-" * 36)
print("Subtotal:", subtotal, "€")
print("IVA (" + str(porcentaje_iva) + "%):", round(monto_iva, 2), "€")
print("Propina:", monto_propina, "€")
print("TOTAL A PAGAR:", round(total_final, 2), "€")
print("-" * 36)
print("¿Supera el umbral VIP (>30€)?:", es_cliente_vip)
print("="*36)
