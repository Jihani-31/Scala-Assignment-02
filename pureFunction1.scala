package second
object pureFunction1 {
def main(args:Array[String])
  {
    print("enter wage hour\n")
    var w=scala.io.StdIn.readInt()
    print("enter ot hour\n")
    var o=scala.io.StdIn.readInt()
   printf("%.2f",total(w,o))
  }
  def wage(h:Int):Double=
  {
     h*120
  }
  def ot(h:Int):Double=
  {
    h*75
  }
  def income(h1:Int,h2:Int):Double=
  {
    wage(h1)+ot(h2)
  }
  def tax(income:Int):Double=
  {
     income*0.1
  }
  def total(h1:Int,h2:Int):Double=
  {
    income(h1,h2)-tax(income(h1,h2).toInt)
  }
  
}