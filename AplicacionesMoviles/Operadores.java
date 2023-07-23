//Ejercicio #1

fun main() {
    println("Calcular el area de un Tríangulo")
    println("Ingrese la base: ")
//definir variables en (kotlin) var o val
//val: no cambia el valor es como yo lo defina
//var: es lo contario al var, se puede cambiar lo que yo defina
//readLine es para qie se vea por consola, siempre va a ser texto
    val base:Int = readLine()!!.toInt()
    println("Ingrese la altura: ")
    val height = readLine()!!.toInt()
    val area = (base*height)/2
    println("El area es: $area")
}