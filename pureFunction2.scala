package second

object pureFunction2 {
  def main(args:Array[String])
   {
     print(profit(10),profit(30),profit(35))
     
     
   }
   def attendees(p:Int):Int=120+(15-p)/5*20
   def revenue(p:Int):Int=attendees(p)*p
   def cost(p:Int):Int=500+attendees(p)*3
   def profit(p:Int):Int=revenue(p)-cost(p)



}