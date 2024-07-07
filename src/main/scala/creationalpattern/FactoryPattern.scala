package creationalpattern

// define a trait for Human
trait Human{
  def hairLength(): Unit
}

// create a case class of men

case class Men(name: String) extends Human{
  override def hairLength(): Unit = println("Short")
}

// create a case class for Women

case class Women(name: String) extends Human{
  override def hairLength(): Unit = println("Long")
}


// define an object for Human Factory

object HumanFactory {

  def createHuman(humanType:String) = humanType match {
    case "men" => Men("Any random Men")
    case "women" => Women("Any random Women")
    case _ => throw new IllegalArgumentException("Unknown Human type")
  }
}

object FactoryPattern extends App {

  val men = HumanFactory.createHuman("men")
  men.hairLength() // Short

  val women = HumanFactory.createHuman("women")
  women.hairLength() // Long
}
