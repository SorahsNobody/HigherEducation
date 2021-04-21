fun main(/*args: Array<String>*/) {
    val bsu = School()
    bsu.fillCourses()
    for(c in bsu.courses){
        println(c.toString())
    }
}