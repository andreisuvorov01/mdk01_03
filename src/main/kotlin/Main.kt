import java.awt.Point
import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.sqrt
enum class  color{
    black, white, yellow
}

open class  point(val x: Double, val y: Double){
    val Xpos:Double
    val Ypos:Double
    init {
        Xpos = x
        Ypos = y
    }
    open fun Draw(){
        println("точки в: $Xpos $Ypos")
    }
}

class ColoredPoint(colors:String, x:Double, y:Double) :point(x,y){
    var clr: String
    init {
        clr = colors
    }
}
open class Line(x:point,y:point){
    var Xo:point
    var Yo:point
    init {
        Xo = x
        Yo = y
    }

}

class ColoredLine(colors:String, x:point,y:point): Line(x,y){
    var clr : String
    init {
        clr = colors
    }

}

open class polygone{

}


fun main() {

}