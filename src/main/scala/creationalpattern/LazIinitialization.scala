package creationalpattern

object LazIinitialization extends App{

  lazy val pi = {
    print("pi value is : ")
    22.0/7.0
  }

  print("==========")
  println(pi)
}
