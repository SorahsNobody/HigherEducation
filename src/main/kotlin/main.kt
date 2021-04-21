import kotlin.math.round
import kotlin.random.Random

fun main(args: Array<String>) {
    val names = Names()
    var courses: Array<Course?> = arrayOfNulls<Course>(101)
    for (i in 0..100){
        val seats = names.getRandCourseSeats()
        val c = Course(names.getRandCourseName(),names.getRandCourseNum(),seats)
        for(j in 0..seats){
            val s = Student(names.getRandFName(),names.getRandLName())
            c.addStudent(s)
            val g = Grade(c,s, round(Random.nextDouble(0.0,100.0)))
            c.addGrade(g)
        }
        courses[i] = c
    }
    for(c in courses){
        println(c.toString())
    }
//    val s1 = Student(names.getRandFName(), names.getRandLName())
//    val c1 = Course("CS", 354, 30)
//    val s1c1g = Grade(c1, s1 , round(Random.nextDouble(0.0,100.0)))
//    c1.addGrade(s1c1g)
//    c1.addStudent(s1)

//    println(c1.toString())
}