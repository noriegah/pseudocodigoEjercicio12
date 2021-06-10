Algoritmo altura_negativa
	altura=0
	edad=0
	sumaltura=0
	sumaedad=0
	hombres=0;
	mujeres=0
	i=0
	k=0
	j=0
	Mientras altura>=0 Hacer
		Escribir "Ingrese su altura"
		Leer altura
		Escribir "Ingrese su edad"
		Leer edad
		Escribir "Ingrese su sexo, Masculino=0, Femenino=1"
		Leer sex
		j=j+1
		Si sex=0 Entonces
			hombres=hombres+altura
			i=i+1
		SiNo
			mujeres=mujeres+altura
			k=k+1
		FinSi
		sumaedad=sumaedad+edad
	FinMientras
	promMujeres=mujeres/k
	promhombres=hombres/i
	promedades=edades/i
	Escribir "El promedio de la altura de mujeres es " promMujeres
	Escribir "El promedio de la altura de hombres es " promhombres
	Escribir "El promedio de la edades es " promedades
	
FinAlgoritmo
