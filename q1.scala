

object q1 {
  def main(args:Array[String]) {
    val r1=new Rational(8,5);
    println(r1);
    
  }

 
class Rational(n:Int,d:Int) {
    require(d>0,"d must be positive");
    def numer = -n;
    def denom = d;
//    def this(n:Int)=this(n,1)
    def neg(r:Rational)=new Rational(this.numer*(-1),this.denom);
    override def toString=numer+"/"+denom;
} 
}