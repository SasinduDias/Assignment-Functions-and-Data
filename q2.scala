

object q2 {
  def main(args:Array[String]) {
    val r1=new Rational(10,3);
    val r2=new Rational(5,2);
    println(r1+"-"+r2);
    
    val x=r1.sub(r2);
    println(x);
  }

 
class Rational(n:Int,d:Int) {
    require(d>0,"d must be positive");
    def numer = n;
    def denom = d;
    def this(n:Int)=this(n,1);
    def sub(r:Rational)=new Rational(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom);
    override def toString=numer+"/"+denom;
  }
}