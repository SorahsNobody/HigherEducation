/*data classes are nice, they have "built-in" methods since there are
a lot of common methods between classes. Other than that, they function
identically to normal classes.

Built-in methods include:
Getters
Setters
toString
etc.*/
data class Student(val fName: String, val lName: String){
    var gradePoints = 0.0
    var credits = 0.0

    //If you don't like a built-in method, you can override it by doing the following:
    override fun toString(): String {
        //Arithmetic is identical to JAVA
        val gpa = gradePoints/credits
        if(!gpa.isNaN())
            return "$fName $lName: $gpa"
        else
            return "$fName $lName"
    }
}
