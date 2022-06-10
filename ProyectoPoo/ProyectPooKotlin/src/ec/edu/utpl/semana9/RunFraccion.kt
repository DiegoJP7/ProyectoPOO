package ec.edu.utpl.semana9

object RunFraccion {
    @JvmStatic
    fun main(args: Array<String>) {
        val f1 = Fraccion(7, 1)
        val f2 = Fraccion(5, 8)
        val division = f1.dividir(f2)
        println("$f1 % $f2 = $division")
    }
}