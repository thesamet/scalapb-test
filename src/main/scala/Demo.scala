import com.example.protos.demo.Hello

object Demo extends App {
  println(Hello(a=17, b=15))

  def mmmm(a:Int) = a match {
    case 1 => println("hi")
    case 2 => println("brr")
  }
}
