class Pila<T> {
    var elementos: MutableList<T> = mutableListOf()

    fun push(elemento: T) {
        elementos.add(elemento)
    }

    fun pop(): T? {
        if (!isEmpty()) {
            return elementos.removeAt(elementos.size - 1)
        } else {
            return null
        }
    }

    fun top(): T? {
        if (!isEmpty()) {
            return elementos[elementos.size - 1]
        } else {
            return null
        }
    }


    fun isEmpty(): Boolean {
        return elementos.isEmpty()
    }
}

fun <T> reverse(lista: List<T>): List<T> {
    val pila = Pila<T>()
    lista.forEach { pila.push(it) }

    val resultado = mutableListOf<T>()
    while (!pila.isEmpty()) {
        resultado.add(pila.pop()!!)
    }

    return resultado
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev: List<String> = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

    var numerosMixtos = listOf(1, 2.9f, 3.4, 4)
    var numerosRev: List<Number> = reverse(numerosMixtos)
    if (!listOf(4, 3.4, 2.9f, 1).equals(numerosRev))
        println("Error")
    else
        println("Correcto")
    println(numerosRev)

    data class Persona(val nombre: String, val edad: Int)

    var personas = listOf(Persona("Juan", 25), Persona("Ana", 30), Persona("Pedro", 40))
    var personasRev: List<Persona> = reverse(personas)
    if (!listOf(Persona("Pedro", 40), Persona("Ana", 30), Persona("Juan", 25)).equals(personasRev))
        println("Error")
    else
        println("Correcto")
    println(personasRev)

    var listaMixta = listOf("Hola", 10, 3.14f, Persona("Pepe", 30), true)
    var listaRev: List<Any> = reverse(listaMixta)
    if (!listOf(true, Persona("Pepe", 30), 3.14f, 10, "Hola").equals(listaRev))
        println("Error")
    else
        println("Correcto")
    println(listaRev)
}
