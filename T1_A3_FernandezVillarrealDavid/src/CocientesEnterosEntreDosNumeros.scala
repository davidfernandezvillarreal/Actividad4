

object CocientesEnterosEntreDosNumeros {
  def main(args: Array[String]): Unit = {
    println("Ingrese cualquier n�mero")
    val entrada = readInt
    println("Ingrese el n�mero limite")
    val limite = readInt
    println("Cocientes: ")
    obtenerCocientes(entrada, entrada, limite)
  }
  
  def obtenerCocientes(numero: Int, divisor: Int, limite: Int): Unit = {
    if(divisor>=limite) {
      if ((numero%divisor)==0) {
        print(numero/divisor + ", ")
      }
      obtenerCocientes(numero, divisor-1, limite)
    }
  }
}