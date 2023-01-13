//Ejemplo de Especialización
//Superclase
open class ElementoBase constructor(val name: String) {
    open var cantidad = 1
    open var fabricante = ""
}
//subclase
class ElementoPopular(name: String) : ElementoBase(name) {
    override var cantidad = 6
    override var fabricante = "Faber Castell"
}
//subclase
class RestoDeElementos(name: String) : ElementoBase(name) {
    override var cantidad = 10
    override var fabricante = "Courier"
}
//Ejemplo de Extensión
//Super clase
open class Estrella constructor(val nombre: String,val dimensiones: Int){

}
//subclase
class EnanaRoja (nombre: String, dimensiones: Int,vida:Int,sistema:String): Estrella(nombre,dimensiones){
    var vida=vida
    var sistema=sistema

}
//subclase
class EnanaBlanca (nombre: String, dimensiones: Int,vida:Int,sistema:String): Estrella(nombre,dimensiones){
    var vida=vida
    var sistema=sistema

}

fun main() {
    //especialización
    val cuaderno = ElementoBase("Cuaderno")

    val lapiz = ElementoPopular("Lapicero")
    var pluma = RestoDeElementos("Pluma de tinta")

    println("${cuaderno.name} x ${cuaderno.cantidad}, fabricante: ${cuaderno.fabricante}")
    println("${lapiz.name} x ${lapiz.cantidad}")
    println("${pluma.name} x ${pluma.cantidad}, fabricante: ${pluma.fabricante}")

    //extension
    var galactus4 = Estrella("Galactus numero4",30000000)

    var pristina30 = EnanaRoja("Estrella pristina 30",239000000,2143434444,"Sistema Perseida")
    var cuantiq60 = EnanaBlanca("Estrella Cuantiq 60",43534850,200000330,"Sistema Omega")

    println("Estrella ${galactus4.nombre} de tamaño ${galactus4.dimensiones}")
    println("Estrella ${pristina30.nombre} de tamaño ${pristina30.dimensiones}, con ${pristina30.vida} millones de años de vida, perteneciente al ${pristina30.sistema}")
    println("Estrella ${cuantiq60.nombre} de tamaño ${cuantiq60.dimensiones}, con ${cuantiq60.vida} millones de años de vida, perteneciente al ${cuantiq60.sistema}")
}
/* PARTE TEÓRICA
c) La herencia que he empleado es en el primer tipo de especialización y en el segundo de extensión.
d) la superclase del primer tipo es ElementoBase y las subclases ElementoPopular y restoDeElementos, en el segundo tipo es Estrella la superclase y EnanaRoja y EnanaBlanca las subclases
e) se puede implementar con Interfaces
f) La implementación con herencia te permite añadir variable, y esto no es posible hacerlo con interfaces lo que amplia las posibilidades
 */