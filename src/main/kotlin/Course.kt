data class Course(val dep: String, val num: Int, val seats: Int, val credits: Int) {
    //String formatting seen here, akin to what we've seen in C
    private val courseDes = "$dep $num"

    var grades: Set<Grade> = emptySet()
    /**
     * addGrade()
     * will add the given grade into the array of grades
     */
    fun addGrade(grade: Grade){
        if(!grades.isNullOrEmpty()){
            grades = grades.plus(grade)
        }
        else
            grades = setOf(grade)
    }

    var students: Set<Student> = emptySet()
    /**
     * addStudent()
     * will add the given student into the array of students
     */
    fun addStudent(s: Student){
        if(!students.isNullOrEmpty()){
            students = students.plus(s)
        }
        else
            students = setOf(s)
    }

    override fun toString(): String{
        var s = "$courseDes:\n"
        for(student in students){
            for(g in grades)
                if(g.student == student) {
                    s = s + student.toString() +": "+ g.gradeNum +"\n"
                }
        }
        return s
    }
}
