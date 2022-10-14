
    //задача 1
    fun printFullName(firstName:String, lastName:String){
        println("$firstName+ + $lastName")
    }
    //задача 3
    fun calculateFullName(firstName:String,lastName:String): String {
        return "$firstName $lastName"
    }
    //задача 4
    fun calculateFullNamePair(Fl:String):Pair<String,Int> {
        return Pair(Fl , Fl.length) }
    //задача 5
    fun prostoeChislo(nomer:Int) {
        var i = 2
        var flag = false
        if(nomer%2!==0 && nomer>0)
            while (i <= nomer / 2) {
                if (nomer % i == 0) {
                    flag = true
                    break
                }
                i++
            }
        if (flag==true)
            println("$nomer это простое число")
        else
            println("$nomer это не простое число")
    }
        //задача 6
    fun chislaFibonachi(n:Int):Int{
        var fib1 = 1
        var fib2 = 1
        if(n>2){
            for(i in 1..n-2){
                var fib3=fib1+fib2
                fib1=fib2
                fib2= fib3
                println(fib3)
            }
            return fib2
        }
        return 0
    }
    fun main() {
        printFullName("andrei", "suvorov")
        prostoeChislo(32)
        chislaFibonachi(28)
    }