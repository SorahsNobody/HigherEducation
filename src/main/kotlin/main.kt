//main function is very similar to JAVA
fun main(/*args: Array<String>*/) {
    //No "new" keyword needed
    val bsu = School()
    //Method/Function calls are identical to JAVA
    bsu.fillCourses()
    //Showcasing for(_in_) loop essentially JAVA's for each loop
    for(c in bsu.courses){
        println(c.toString())
    }
    //Kotlin doesn't need you to specify where to output
    println(bsu.getGPAs())
}