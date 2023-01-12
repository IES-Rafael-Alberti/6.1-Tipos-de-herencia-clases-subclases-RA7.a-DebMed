//Ejemplo de especialización
open class ElementoBase(val name: String) {
    open var quantity = 1
}

class ElementoPopular(name: String) : ElementoBase(name) {
    override var quantity = 6
}

fun main() {
    // Añadir elemnto base de orden
    val cuaderno = ElementoBase("Cuaderno")

    // Añadir elemento popular
    val lapiz = ElementoPopular("Lapicero")

    // Mostrar factura
    println("${cuaderno.name} x ${cuaderno.quantity}")
    println("${lapiz.name} x ${lapiz.quantity}")
}