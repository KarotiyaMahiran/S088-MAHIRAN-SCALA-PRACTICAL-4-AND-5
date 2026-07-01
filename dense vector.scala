import breeze.linalg._

object DenseVectorExample {
  def main(args: Array[String]): Unit = {

    // Create two dense vectors
    val v1 = DenseVector(1.0, 2.0, 3.0, 4.0, 5.0)
    val v2 = DenseVector(5.0, 4.0, 3.0, 2.0, 1.0)

    // Sum of elements
    val sum = breeze.linalg.sum(v1)

    // Mean of elements
    val mean = sum / v1.length

    // Dot product
    val dotProduct = v1.dot(v2)

    // Display results
    println("Vector 1: " + v1)
    println("Vector 2: " + v2)
    println("Sum = " + sum)
    println("Mean = " + mean)
    println("Dot Product = " + dotProduct)
  }
}



