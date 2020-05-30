package third

object recursion {
  def main(args:Array[String])
  {
    println(prime(8))
    println(prime(5))
    primeSeq(10)
    println("sum="+addNum(5))
    println(even(5))
    println(evenSeq(5))
    fibonacciSeq(5)
    
  }
  def GCD(a:Int,b:Int):Int=b match{
  case 0 => a
  case x if x>a => GCD(x,a)
  case x => GCD(b,a%b)
}
  
  def prime(p:Int,n:Int=2):Boolean= n match {
  case x if(x==p) => true
  case x if GCD(p,x)>1 => false
  case x => prime(p,x+1)
  }
  
  
  def primeSeq(n:Int):Unit={
  if (prime(n)) println(n)
  if(n>0) primeSeq(n-1)
  } 
  def addNum(x:Int):Int= if(x==1)1 else x+addNum(x-1) 
  
  def even(n:Int):String=n%2 match{
  case 1 => "odd"
  case 0 =>"Even"
  }
  
  def iseven(n:Int):Boolean=n%2 match{
    case 0=> true
    case 1=> false
  }
  
  def evenSeq(n:Int):Any={
    if(n>0) evenSeq(n-1)
    if(iseven(n)==true)
    {
      if(n>0) println(n)
    }
  }
  
  def fibonacci(n:Int):Int= n match{
  case 0 => 0
  case x if x==1 => 1
  case _ => fibonacci(n-1)+fibonacci(n-2)
  }
  def fibonacciSeq(n:Int):Unit= {
  if (n > 0) fibonacciSeq(n-1)
   println(fibonacci(n))
   }

}