

object CantidadCocientesEntreDosNumero {
  def main(args: Array[String]): Unit = {
    println("Ingrese cualquier n�mero")
    val entrada = readInt
    println("Ingrese el n�mero limite")
    val limite = readInt
    println("N�mero de divisores: ")
    println(obtenerDivisores(entrada, entrada, limite))
  }
  
  def obtenerDivisores(numero: Int, divisor: Int, limite: Int): Int = {
    if(divisor>=limite) {
      if ((numero%divisor)==0) {
        return obtenerDivisores(numero, divisor-1, limite) + 1
      } else return obtenerDivisores(numero, divisor-1, limite)
    } else return 0
  }
}