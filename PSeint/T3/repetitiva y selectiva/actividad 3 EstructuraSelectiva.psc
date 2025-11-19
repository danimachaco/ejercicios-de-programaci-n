Algoritmo actividad3EstructuraSelectiva
	//Definir variables
	Definir nota Como Entero
	//Mostrar acciones
	Escribir Sin Saltar "dame una nota"
	Leer nota
	//Conseguir resultado
	Segun nota Hacer
		0,1,2,3,4:
			Escribir "suspenso"
		5:
			Escribir "suficiente"
		6:
			Escribir "bien"
		7,8:
			Escribir "notable"
		9,10:
			Escribir "sobresalinete"
			
		De Otro Modo:
			Escribir "nota no válida"
	Fin Segun
FinAlgoritmo
