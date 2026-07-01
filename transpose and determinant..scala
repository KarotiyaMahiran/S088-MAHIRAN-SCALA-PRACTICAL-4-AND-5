
import breeze.linalg._
import scala.util.Random

object RandomMatrixExample {
  def main(args: Array[String]): Unit = {

    // Generate a 3x3 random matrix
    val matrix = DenseMatrix.rand[Double](3, 3)

    // Compute transpose
    val transpose = matrix.t

    // Compute determinant
    val determinant = det(matrix)

    // Display results
    println("Random Matrix:")
    println(matrix)

    println("\nTranspose:")
    println(transpose)

    println("\nDeterminant:")
    println(determinant)
  }
}