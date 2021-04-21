//imports are identical to JAVA
import kotlin.math.round
import kotlin.random.Random

class School {
    //variable protection is the same as JAVA
    private val names = Names()
    //Multiple ways to deal with Array's this example showcases a known sized array
    //I explicitly set the array to 101 elements for this example
    var courses: Array<Course?> = arrayOfNulls<Course>(101)

    /**
     * fillCourses()
     *
     * Will populate 100 random courses with random amounts of students for each
     */
    fun fillCourses(){
        //Another for loop. This one showcases the range functionality Kotlin provides
        for (i in 0..100){
            val seats = names.getRandCourseSeats()
            //Kotlin's RANDOM class is almost identical to JAVA's
            val c = Course(names.getRandCourseName(),names.getRandCourseNum(),seats,Random.nextInt(1,5))
            for(j in 0..seats){
                val s = Student(names.getRandFName(),names.getRandLName())
                c.addStudent(s)
                val g = Grade(c,s, round(Random.nextDouble(60.0,100.0)))
                c.addGrade(g)
            }
            //You can access arrays like we've seen before in C, JAVA, etc
            courses[i] = c
        }
    }

    /**
     * getGPAs()
     * @return String
     * Goes through the pre-populated courses and returns a string of
     * all of the unique students and their corresponding GPA's
     *
     * GPA's are a bit wonky since most students are only in 1 or 2 courses
     * for this example (Students are randomly made, so the chances that the same one is
     * made and put into another course is fairly low)
     */
    fun getGPAs(): String{
        /*Could have used "lateinit var" to instantiate tr later when we had a value for it
          this is just a force of habit though*/
        var tr = ""
        /*Another way to instantiate an Array. The size of this array is based on the size of the
          course.seat variable which is assigned randomly, so it's best not to give it a specific size
          and instead let it "dynamically" size itself with the .plus() method later*/
        var stu: Array<Student> = emptyArray()
        for(c in courses){
            /*From what I could find
              the ? denotes a null check
              the !! essentially tells the compiler that students will not be null
              all together c?.students!! is saying: is c null?, if not then students won't be*/
            for(s in c?.students!!){
                //! || && work identically to JAVA
                if(!stu.isNullOrEmpty() && !stu.contains(s))
                    //.plus() is Kotlin's .add() method for arrays
                    stu = stu.plus(s)
                else if(stu.isNullOrEmpty())
                    //Have to set stu as a non-empty array
                    stu = arrayOf(s)
            }
        }
        for (c in courses){
            for(g in c?.grades!!){
                //when is essentially the switch statement from JAVA
                when(g.gradeNum) {
                    //I'm looking for grades in the following ranges
                    in 90.0..100.0 -> g.student.gradePoints += 4
                    in 80.0..89.9 -> g.student.gradePoints += 3
                    in 70.0..79.9 -> g.student.gradePoints += 2
                    in 60.0..69.9 -> g.student.gradePoints += 1
                    //else -> g.student.gradePoints += 0
                    //^^This wasn't needed but I wanted to keep it in to show the else statement
                }
            }
            for(s in c?.students!!){
                s.credits += c.credits
            }
        }
        for(s in stu){
            /*String concatenation is almost identical to JAVA
              Could have also used formatting. EX: tr = "$tr$s.toString()\n"*/
            tr = tr+s.toString()+ "\n"
        }
        return tr
    }
}