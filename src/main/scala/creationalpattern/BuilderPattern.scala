package creationalpattern

case class Person(name:String,age:Int,email:String)
// builder trait
trait PersonBuilder{
  def setName(name:String): PersonBuilder
  def setAge(age:Int): PersonBuilder
  def setEmail(email:String): PersonBuilder
  def build(): Person

}

//concrete class
class ConcretePersonBuilder extends PersonBuilder{
  private var name = ""
  private var age = 0
  private var email = ""

  override def setName(name: String): PersonBuilder = {
    this.name = name
    this
  }

  override def setAge(age: Int): PersonBuilder = {
    this.age = age
    this
  }

  override def setEmail(email: String): PersonBuilder = {

    this.email = email
    this
  }

  override def build(): Person = Person(name,age, email)
}
object BuilderPattern extends App{
val person = new ConcretePersonBuilder().setName("Joy").setAge(10).setEmail("Joy@joy.com").build()
  println(s"Builder Pattern : $person")
}
