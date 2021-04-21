import kotlin.math.round
import kotlin.random.Random

class School {
    private val names = Names()
    var courses: Array<Course?> = arrayOfNulls<Course>(101)
    fun fillCourses(){
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
    }
}