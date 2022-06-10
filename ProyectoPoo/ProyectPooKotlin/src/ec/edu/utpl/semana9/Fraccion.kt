package ec.edu.utpl.semana9

class Fraccion {
    private var numerador //Atributos
            = 0
    private var denominador //Atributos
            = 0

    constructor() { //Clase
        setNumerador(0)
        setDenominador(1)
    }

    constructor(numerador: Int, denominador: Int) { //Constructor
        setNumerador(numerador)
        require(denominador != 0) {
            "Denominador no pueder ser 0 o negativo" //Validar datos
        }
        setDenominador(denominador)
    }

    constructor(numerador: Int) { //Sobrecarga
        this.numerador = numerador
        denominador = 1
    }

    fun getNumerador(): Int { //Inicio de los get y set
        return numerador
    }

    fun setNumerador(numerador: Int) {
        this.numerador = numerador
    }

    fun getDenominador(): Int {
        return denominador
    }

    fun setDenominador(denominador: Int) {
        this.denominador = denominador
    } //Fin de los get y set

    override fun toString(): String {
        return "$numerador/$denominador"
    }

    fun dividir(f: Fraccion): Fraccion {
        val aux = Fraccion()
        aux.numerador = numerador * f.denominador
        aux.denominador = denominador * f.numerador
        return aux
    }

    companion object {
        var catidadDeNumeradores = 1 //Iniciar Instancia
        var cantidadDeDenominadores = 1
    }
}