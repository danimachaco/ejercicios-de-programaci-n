Algoritmo ej9repaso
	Definir intentos Como Entero
	Definir pin Como Entero
	Definir operacion Como Caracter
	Definir saldoinicial Como Entero
	Definir sumadinero Como Entero
	Definir restadinero Como Entero
	pin=1234
	saldoinicial=1000
	Repetir
		Escribir "meta el PIN"
		leer pin
		intentos=intentos+1
		si pin=1234 Entonces
			Escribir "hola"
			Repetir
				Escribir "escoja su operacion"
				Leer operacion
				Si salir=Falso Entonces
					Segun operacion Hacer
						"consultar dinero":
							Escribir "saldo inicial: ", saldoinicial
						"ingresar dinero":
							Escribir "dinero a ingresar"
							leer sumadinero
							sumadinero=sumadinero+saldoinicial
							Escribir "saldo actual: ", sumadinero
						"retirar dinero":
							Escribir "dinero a retirar"
							Leer restadinero
							restadinero=saldoinicial-restadinero
							Escribir "el saldo se queda en: ", restadinero
					FinSegun
				SiNo
					Escribir "hasta luego"
				Fin Si
			Hasta Que salir=Verdadero
		FinSi
	Hasta Que intentos=3 o pin=1234
FinAlgoritmo

