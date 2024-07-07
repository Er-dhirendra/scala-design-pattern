package creationalpattern

// created a utils class
object MyUtils{
  // created a variable of name pi with value
  val pi = 22.0/7.0
}

object SingletonPattern extends App{
  println(s"Value fo pi is : ${MyUtils.pi}")
}
