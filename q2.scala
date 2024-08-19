def matchNumber(input: Int): Unit = {

    val printNegativeOrZero = () => println("Negative/Zero is input")
    val printEven = () => println("Even number is given")
    val printOdd = () => println("Odd number is given")


    input match {
      case x if x <= 0 => printNegativeOrZero()
      case x if x % 2 == 0 => printEven()
      case _ => printOdd()
    }
  }

def main(args: Array[String]): Unit = {

    println("Please enter an integer:")
    val input = scala.io.StdIn.readInt() 
    matchNumber(input)          
  }