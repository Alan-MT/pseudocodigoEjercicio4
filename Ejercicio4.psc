Algoritmo Ejercicio4
	Definir Edad, M, N Como Entero
	N <- 156
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Escribir "Ingrese la edad"
		Leer Edad
		Si Edad < N Entonces
			N <- Edad
		Fin Si
		Si Edad > M Entonces
			M <- Edad
		Fin Si
	Fin Para
	
	Escribir  "Edad Mayor", M
	Escribir "edad Menor", N
	
FinAlgoritmo
