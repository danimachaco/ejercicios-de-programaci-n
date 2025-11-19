Algoritmo ej7repaso
	Definir numero1 Como Entero
	Definir suma Como Real
	Definir contador como entero
	
	Repetir
		Escribir "dame un numero"
		Leer numero1
		si numero1>0 Entonces
			suma=suma+numero1
			contador=contador+1
		FinSi
	Hasta Que numero1<0
	suma=suma/contador
	Escribir "la media es: ", suma
FinAlgoritmo
