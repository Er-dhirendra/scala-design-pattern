package structuralpattern

trait Engineer{
  def coder(): String
}

class SoftwareEngineer extends Engineer {

  override def coder(): String = "Knows coding"
}

class ElectronicsEngineer {
  def embeddedCoder(): String = "Knows Embedded coding"

}

package object Adapter {
  implicit class ElectronicsEngineerToEngineerAdapter(ec: ElectronicsEngineer) extends Engineer {

    override def coder(): String = ec.embeddedCoder()
  }
}

object AdapterPatter extends App{

  val se: Engineer = new SoftwareEngineer()
  println(se.coder())
  import Adapter._
  val ec = new ElectronicsEngineer()
 println(ec.coder())
}
