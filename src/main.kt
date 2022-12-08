fun main() {
    var a= readLine()
    var b= readLine()?.toInt()!!
    when(a){
        "s"->{
            when(b){
                0-> println("janub")
                1-> println("sharq")
                2-> println("g'arb")
            }
        }
        "j"->{
            when(b){
                0-> println("shimol")
                1-> println("g'arb")
                2-> println("sharq")
            }
        }
        "q"->{
            when(b){
                0-> println("g'arb")
                1-> println("janub")
                2-> println("shimol")
            }
        }
        "g"->{
            when(b){
                0-> println("sharq")
                1-> println("shimol")
                2-> println("janub")
            }
        }
    }
}
