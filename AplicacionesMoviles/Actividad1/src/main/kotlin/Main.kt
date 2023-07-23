 import java.util.Scanner
 import kotlin.math.PI
    fun main() {
        val scanner = Scanner(System.`in`)
        var Operators: Int
        var conditionals: Int
        var cycles: Int


        do {
            println("=== MENÚ ===")
            println("Ingresa la opcion a la que deseas ingresar")
            println("1. Operadores")
            println("2. Condicionales")
            println("3. Ciclos")
            println("99. Salir")
            println("Selecciona la opción que deseas: ")


            Operators = scanner.nextInt()

            when (
                Operators) {
                1 -> {

                    do {
                        println("=== MENÚ ===")
                        println("1. Calcular el área de un Triángulo")
                        println("2. Suma de dos números")
                        println("3. Números elevados al cuadrado")
                        println("4. Conversión de euros a dólares")
                        println("5. Lado de un cuadrado y cálculo de área y perímetro")
                        println("6. Área y volumen de un cilindro")
                        println("7. Radio de una circunferencia")
                        println("8. Promedio de 3 números")
                        println("99. Salir")
                        println("Selecciona la opción que deseas: ")


                        Operators = scanner.nextInt()

                        when (
                            Operators) {
                            1 -> {
                                println("Calcular el area de un Tríangulo")
                                println("Ingrese la base:")
                                val base: Int = readLine()!!.toInt()
                                println("Ingrese la altura: ")
                                val height: Int = readLine()!!.toInt()
                                val area = (base * height) / 2
                                println("El area es: $area")
                            }

                            2 -> {
                                println("Suma de dos numeros ")
                                println("Ingresa el numero 1")
                                val number1: Int = readLine()!!.toInt()
                                println("Ingresa el numero 2")
                                val number2: Int = readLine()!!.toInt()
                                val sum = (number1 + number2)
                                println("La suma de los dos numeros es: $sum")
                            }

                            3 -> {
                                println("Numeros elevado al cuadrado")
                                println("Ingresa el numero que deseas elevar")
                                val number = scanner.nextDouble()
                                val result = number * number
                                println("El número elevado al cuadrado es: $result")
                            }

                            4 -> {
                                println("Conversion de euros a dolares")
                                println("Ingresa el valor que deseas convertir")
                                val euro: Int = readLine()!!.toInt()
                                val dollar = euro * 1.12
                                println("La conversion de tu valor ingresado es de $dollar")
                            }

                            5 -> {
                                println("Lado de un cuadrado y muestre el valor del área y del perímetro")
                                println("Ingresa el lado")
                                val side: Int = readLine()!!.toInt()
                                val area = (side * side)
                                val perimeter = (side * 4)
                                println("El area y perimetro de tu cuadrado es de:")
                                println("area: $area")
                                println("perimetro: $perimeter")
                            }

                            6 -> {
                                println("Area y volumen de un cilindro")
                                println("Ingresa la base del cilindro")
                                val radio: Int = readLine()!!.toInt()
                                println("Ingresa la altura del cilindro")
                                val height: Int = readLine()!!.toInt()
                                val area = 2 * PI * radio * height + 2 * PI * radio * radio
                                println("El área del cilindro es $area")
                                val volume = PI * radio * radio * height
                                println("El volumen del cilindro es $volume")
                            }

                            7 -> {
                                println("Radio de una circunferencia")
                                println("Ingresa el radio de la circunferencia")
                                val radio: Int = readLine()!!.toInt()
                                val longitude = 2 * PI * radio
                                val area = PI * radio * radio
                                println("La longitud de la circunferencia: $longitude")
                                println("El área del círculo inscrito: $area")
                            }

                            8 -> {
                                println("Promedio de 3 números")
                                println("Ingresa el numero 1")
                                val number1: Int = readLine()!!.toInt()
                                println("Ingresa el numero 2")
                                val number2: Int = readLine()!!.toInt()
                                println("Ingresa el numero 3")
                                val number3: Int = readLine()!!.toInt()
                                val average = (number1 + number2 + number3) / 3
                                println("El promedio es de: $average")
                            }

                            99 -> {
                                println("Saliendo del programa...")
                            }

                            else -> {
                                println("Opción inválida. Inténtelo nuevamente.")
                            }
                        }

                        println()
                    } while (Operators != 99)

                }

                2 -> {
                    do {
                        println("=== MENÚ ===")
                        println("1. Numero es positivo o negativo")
                        println("2. numeros mayores o meores")
                        println("3. números enteros positivos, menor y el mayor de ellos")
                        println("4. numeros A y B")
                        println("5. Encontrar el cociente entre A y B")
                        println("6.  A y B, sumarlos si al menos uno de ellos es negativo")
                        println("7. Determine si un año es bisiesto o no")
                        println("99. Salir")
                        println("Selecciona la opción que deseas: ")


                        conditionals = scanner.nextInt()

                        when (
                            conditionals) {
                            1 -> {
                                println("Numero es positivo o negativo")
                                println("Ingresa el numero que deseas saber si es negativo o positivo")
                                val number: Int = readLine()!!.toInt()
                                if (number > 0) {
                                    println("El número ingresado es positivo.")
                                } else if (number < 0) {
                                    println("El número ingresado es negativo.")
                                } else {
                                    println("El número es cero.")
                                }
                            }

                            2 -> {
                                println("numeros mayores o meores")
                                println("Ingresa el numero 1")
                                val number1: Int = readLine()!!.toInt()
                                println("Ingresa el numero 2")
                                val number2: Int = readLine()!!.toInt()
                                if (number1 > number2 && number2 < number1) {
                                    println("El número mayor es $number1 y el numero menor es $number2")
                                } else {
                                    println("El número es incorrecto.")
                                }
                            }

                            3 -> {
                                println("números enteros positivos, menor y el mayor de ellos")
                                println("Ingresa el numero 1")
                                val number1 = readLine()!!.toInt()
                                println("Ingresa el numero 2")
                                val number2 = readLine()!!.toInt()
                                println("Ingresa el numero 3")
                                val number3 = readLine()!!.toInt()
                                if (number1 != null && number2 != null && number3 != null) {
                                    if (number1 >= 0 && number2 >= 0 && number3 >= 0) {
                                        val smallest = if (number1 <= number2 && number1 <= number3) number1
                                        else if (number2 <= number1 && number2 <= number3) number2 else number3
                                        val largest = if (number1 >= number2 && number1 >= number3) number1
                                        else if (number2 >= number1 && number2 >= number3) number2 else number3
                                        println("El número más pequeño es: $smallest")
                                        println("El número más grande es: $largest")
                                    } else {
                                        println("Los números deben ser enteros positivos.")
                                    }
                                }

                            }

                            4 -> {
                                println("números A Y B")
                                println("Ingresa el numero A")
                                val NumberA = readLine()!!.toInt()
                                println("Ingresa el numero B")
                                val NumberB = readLine()!!.toInt()
                                val result = if (NumberA < NumberB) {
                                    NumberA + NumberB
                                } else {
                                    NumberA - NumberB
                                }
                                println("El resultado es: $result")
                            }

                            5 -> {
                                println("Encontrar el cociente entre A y B")
                                println("Ingresa el numero A")
                                val NumberA = readLine()!!.toInt()
                                println("Ingresa el numero B")
                                val NumberB = readLine()!!.toInt()

                                val result = if (NumberB != 0) {
                                    NumberA.toDouble() / NumberB.toDouble()
                                } else {
                                    "La división no es posible, el divisor (B) es igual a cero."
                                }
                                println(result)
                            }

                            6 -> {
                                println(" A y B, sumarlos si al menos uno de ellos es negativo")
                                println("Ingresa el numero A")
                                val NumberA = readLine()!!.toInt()
                                println("Ingresa el numero B")
                                val NumberB = readLine()!!.toInt()
                                val result = if (NumberA < 0 || NumberB < 0) {
                                    NumberA + NumberB
                                } else {
                                    NumberA * NumberB
                                }

                                println(result)

                            }

                            7 -> {
                                println("Un año es bisiesto o no")
                                print("Ingresa el año que deseas: ")
                                val year = readLine()!!.toInt()
                                if (year != null) {
                                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                                        println("$year es un año bisiesto.")
                                    } else {
                                        println("$year no es un año bisiesto.")
                                    }
                                } else {
                                    println("Ingresa un año válido.")
                                }
                            }

                            99 -> {
                                println("Saliendo del programa...")
                            }

                            else -> {
                                println("Opción inválida. Inténtelo nuevamente.")
                            }
                        }
                        println()
                    } while (conditionals != 99)

                }

                3 -> {
                    do {
                        println("=== MENÚ ===")
                        println("1. Múltiplos de 3 que hay entre 1 y 100")
                        println("2. Números impares entre 0 y 100")
                        println("3. Números pares del 1 al 100")
                        println("4. Cuadrados de los números del 1 al 30")
                        println("5. Sume los cuadrados de los cien primeros números naturales")
                        println("6. Dos números naturales, el primero menor que el segundo")
                        println("7. Sumar todos los números que se digitan por teclado mientras no sea cero")
                        println("99. Salir")
                        println("Selecciona la opción que deseas: ")


                        cycles = scanner.nextInt()

                        when (
                            cycles) {
                            1 -> {
                                println("Múltiplos de 3 que hay entre 1 y 100")
                                for (number in 1..100) {
                                    if (number % 3 == 0) {
                                        println(number)
                                    }
                                }
                            }

                            2 -> {
                                println("Números impares entre 0 y 100")
                                for (i in 0..100) {
                                    if (i % 2 != 0) {
                                        println(i)
                                    }
                                }
                            }

                            3 -> {
                                println("Números pares del 1 y 100")
                                for (i in 1..100) {
                                    if (i % 2 == 0) {
                                        println(i)
                                    }
                                }
                            }

                            4 -> {
                                println("Cuadrados de los números del 1 al 30")
                                for (i in 1..30) {
                                    val square = i * i
                                    println("El cuadrado de $i es $square")
                                }
                            }

                            5 -> {
                                println("Sume los cuadrados de los cien primeros números naturales")
                                var sum = 0
                                for (i in 1..100) {
                                    sum += i * i
                                }
                                println("La suma de los cuadrados de los primeros 100 números naturales es: $sum")
                            }

                            6 -> {
                                println("Dos números naturales, el primero menor que el segundo")
                                val Smallernumber = 5
                                val Largestnumber = 15

                                println("Números entre $Smallernumber y $Largestnumber en una secuencia ascendente:")
                                for (i in Smallernumber + 1 until Largestnumber) {
                                    println(i)
                                }
                            }

                            7 -> {
                                    println("Sumar todos los números que se digitan por teclado mientras no sea cero")
                                    var sum = 0
                                    var number: Int
                                    print("Ingresa los numeros a sumar (ingresa 0 para terminar): ")
                                    while (true) {
                                        number = readLine()!!.toInt()
                                        if (number == 0) {
                                            break
                                        }
                                        sum += number
                                    }
                                    println("La suma de los números ingresados es: $sum")
                            }

                            99 -> {
                                println("Saliendo del programa...")
                            }

                            else -> {
                                println("Opción inválida. Inténtelo nuevamente.")
                            }
                        }
                        println()
                    } while (cycles != 99)

                }

                99 -> {
                    println("Saliendo del programa...")
                }

                else -> {
                    println("Opción inválida. Inténtelo nuevamente.")
                }
            }

            println()
        } while (Operators != 99)
    }











