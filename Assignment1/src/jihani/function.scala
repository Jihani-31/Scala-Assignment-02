package jihani

object function {
   def main(args:Array[String])
   {
     var f=toFahrenheit(35)
     println(f)
     sVolume(5)
     var C=cost(24.95f,40,60)
     println(C)
     
     
   }
   
   
  def toFahrenheit(c: Int) = {
    c*1.8+32
    
 
}
  
  
  def sVolume(r:Float)={
    var v=4.0/3.0*math.Pi*r*r*r
    println(v)
  }
  
  def cost(c:Float,d:Float,n:Int)={
    (c-(c*d/100))*n+((n-50)*0.75)+50*3
    
    
    
  }

}
