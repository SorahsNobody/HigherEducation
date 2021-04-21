data class Course(val dep: String, val num: Int, val seats: Int) {
    private val courseDes = "$dep $num"
    var grades: Set<Grade> = emptySet()

    fun addGrade(grade: Grade){
        if(!grades.isNullOrEmpty()){
            grades = grades.plus(grade)
        }
        else
            grades = setOf(grade)
    }
    var students: Set<Student> = emptySet()

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
