Algoritmo ej6repaso
	Definir contraseña Como Caracter
	Definir contador Como Entero
	contador=0
	contraseña="DAM2025"
	Repetir
		Escribir "dame otra contraseña"
		Leer contraseña
		contador=contador+1
		Si contador=3 Entonces
			Escribir "bloqueado"
		Fin Si
	Hasta Que contraseña="DAM2025" o contador=3
FinAlgoritmo
