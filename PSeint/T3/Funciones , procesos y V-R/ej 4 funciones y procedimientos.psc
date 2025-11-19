Funcion funcionParImpar <- parimpar ( variable )
	Si variable%2=0 Entonces
		Escribir "es Verdadero"
	SiNo
		Escribir "es Falso"
	Fin Si
Fin Funcion

Algoritmo ej4funcionesyprocedimientos
	Definir numero1 Como entero
	Definir resultado Como Entero
	Escribir "dame un numero"
	Leer numero1
	resultado=parimpar(numero1)
	
FinAlgoritmo
