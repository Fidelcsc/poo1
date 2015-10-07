var maximo = -1
var minimo = 101
var puntosContaminantes = 0
var suma = 0

for (i <- 1 to 25) {
	println("Ingrese los puntos contaminantes del vehiculo  " + i)
	puntosContaminantes = readInt()
	if (puntosContaminantes < minimo) {
		minimo = puntosContaminantes
	}
	if (puntosContaminantes > maximo) {
		maximo = puntosContaminantes
	}
	suma += puntosContaminantes
}

println("El promedio de puntos contaminantes es " + (suma / 25))
println("El vehiculo más contaminante tiene  " + maximo)
println("El vehiculo menos contaminante tiene " + minimo)