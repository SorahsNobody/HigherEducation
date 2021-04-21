/*The most basic type of data class
  keep in mind that Kotlin still allows us
  to call toString() method as well as access
  the data as needed*/
data class Grade(val course: Course, val student: Student, val gradeNum: Double)
