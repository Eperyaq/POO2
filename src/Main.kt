
fun main() {
    val persona1 = Persona(72.6,1.80)
    println(persona1)

    val persona2 = Persona("Antonio", 90.5, 1.50)
    println(persona2)

    val persona3= Persona("Joselu", 105.3, 1.97)
    println(persona3)


    persona3.altura = 1.80
    println(persona3)

    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)

    println(persona2 == persona3)
}