import scala.math.sqrt
import scala.math.abs

object GreatestDivisor {
  def getDivisor(n: Int): Int = getSmallestDivisor(n) match {
    case Some(d) => n / d
    case None    => 1
  }

  private def getSmallestDivisor(n: Int): Option[Int] =
    (2 to sqrt(abs(n)).toInt).find(i => n % i == 0)
}

object Main {
  def main(args: Array[String]): Unit = {
    args.foreach(arg => {
      try {
        println(arg + " : " + GreatestDivisor.getDivisor(arg.toInt))
      } catch {
        case ex: NumberFormatException =>
          println(arg + " : not a number!")
      }
    })
  }
}
