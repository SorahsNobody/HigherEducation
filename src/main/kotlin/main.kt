fun main(args: Array<String>) {
    val names = Names()
    val s1 = Student(names.getRandFName(), names.getRandLName())
    val c1 = Course("CS", 354)
    val s1c1g = Grade(c1, s1 ,80.0)
    c1.addGrade(s1c1g)
    c1.addStudent(s1)

    println(c1.toString())
}