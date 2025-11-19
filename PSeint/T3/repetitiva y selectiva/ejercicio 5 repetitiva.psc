Algoritmo ejercicio5repetitiva
	Definir numero1 Como Entero
	Definir contador Como Entero
	Definir numero2 Como Entero
	numero2=Aleatorio(1,50)
	Repetir
		Escribir "adivina el numero"
		Leer numero1
		contador=contador+1
		si numero1=numero2 Entonces
			Escribir "correcto"
			Escribir "los intentos han sido: ", contador
		FinSi
		si numero1<numero2 Entonces
				Escribir "el numero aleatorio es mayor"
		SiNo
			si numero1>numero2  Entonces
				Escribir "el numero aleatorio es menor"
			FinSi
		FinSi
		si contador=6 Entonces
			Escribir " el numero aleatorio era ", numero2
		FinSi
	Hasta Que contador=6 o numero1=numero2
FinAlgoritmo
