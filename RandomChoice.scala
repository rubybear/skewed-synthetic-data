import scala.collection.mutable.ArrayBuffer

object RandomChoice{

  val n: Int = 100
  val buf = new ArrayBuffer[Int](n)
  val r = scala.util.Random
  val choices: Map[Double, String] = Map(0.95 -> "gmail", 0.03 -> "yahoo", 0.02 -> "hotmail")

  val sortedChoices = choices.toSeq.sortBy(_._1)
  val cumulativeProbabilities = sortedChoices.scanLeft(0.0)(_ + _._1).tail
  val providers = sortedChoices.map(_._2)

  (1 to n).map { i =>
    val randomValue = r.nextDouble()
    val index = cumulativeProbabilities.indexWhere(_ >= randomValue)
    buf(i-1) = providers(index)
  }
}