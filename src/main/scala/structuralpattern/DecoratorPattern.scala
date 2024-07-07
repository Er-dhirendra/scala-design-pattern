package structuralpattern

trait Pizza{
  def price:Int
  def description:String
}

class PlanPizza extends Pizza{

  override def price: Int = 100

  override def description: String = "Plan Pizza"
}

// Decorator

trait ToppingAdded extends Pizza{
  abstract override def price: Int = super.price + 30
  abstract override def description: String = super.description + " with ToppingAdded"

}
trait ExtraCheeseAdded extends Pizza{
  abstract override def price: Int = super.price + 50
  abstract override def description: String = super.description + " with Extra Cheese"

}

object DecoratorPattern extends App{

  val pizza = new PlanPizza with ExtraCheeseAdded with ToppingAdded
  println(s"pizza price : ${pizza.price}")
  println(s"pizza description : ${pizza.description}")
}
