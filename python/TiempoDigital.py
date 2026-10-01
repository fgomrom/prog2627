segundos_totales = int(input("Ingrese total de segundos: "))

horas = segundos_totales // 3600
segundos_restantes = segundos_totales % 3600

minutos = segundos_restantes // 60
segundos_finales = segundos_restantes % 60

print("Resultado:", horas, "horas,", minutos, "minutos y", segundos_finales, "segundos.")
