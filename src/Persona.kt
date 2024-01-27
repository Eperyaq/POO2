
class Persona(val peso:Double, var altura:Double ) {


    constructor(nombre:String, peso: Double, altura: Double): this(peso, altura)


    fun calcularImc(): Double{
        val imc = peso/ (altura * altura)
        return imc
    }
    override fun toString(): String {
        return "El peso es: $peso, y la altura: $altura por tanto el imc es: %.2f".format(calcularImc())
    }
}