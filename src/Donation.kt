
fun main(args: Array<String>) {
    var n1 = 0
    var n2 = 1
    var n3: Int
    var i: Int
    val count = 56+36
    var checkDonate=0
        i = 2
        while (i < count) {
            n3 = n1 + n2
            //print(" $n3")
            n1 = n2
            n2 = n3
            ++i
            if(count <n3){
                break
            }
            checkDonate++
        }
    println("Total : "+checkDonate + " NGOs they can help")
}