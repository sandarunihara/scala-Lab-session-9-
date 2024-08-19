  def toUpper(input: String): String = input.toUpperCase

  def toLower(input: String): String = input.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    
    val names = List("Benny", "Niroshan", "Saman", "Kumara")


    val formattedNames = names.map {
      case "Benny" => formatNames("Benny")(toUpper)
      case "Niroshan" => formatNames("Niroshan")(name => {
        val upperPart = name.substring(0, 2).toUpperCase
        val lowerPart = name.substring(2)
        upperPart + lowerPart
      })
      case "Saman" => formatNames("Saman")(toLower)
      case "Kumara" => formatNames("Kumara")(name => {
        val firstCharUpper = name.substring(0, 1).toUpperCase
        val middlePart = name.substring(1, name.length - 1).toLowerCase
        val lastCharUpper = name.substring(name.length - 1).toUpperCase
        firstCharUpper + middlePart + lastCharUpper
      })
    }

    formattedNames.foreach(println)
  }
