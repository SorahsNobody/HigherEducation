import kotlin.random.Random

class Names(){
    //Can also set array elements explicitly
    private val fNames: Array<String> = arrayOf(
        "James","Jim","John","Jon","Robert","Michael","Mike","William","Will","Bill","David","Dave","Richard",
        "Joseph","Thomas","Charles","Charlie","Christopher","Chris","Daniel","Dan","Matthew","Matt","Anthony","Tony",
        "Mary","Patricia","Pat","Jennifer","Jen","Linda","Elizabeth","Eliza","Barbara","Barb","Susan","Jessica","Sarah","Sara",
        "Karen","Nancy","Lisa","Margaret","Margie","Betty","Sandra"
    )
    private val lNames: Array<String> = arrayOf(
        "Smith","Johnson","Williams","Brown","Jones","Garcia","Miller","Davis","Rodriquez","Martinez","Hernandez","Lopez","Gonzalez",
        "Wilson","Anderson","Thomas","Taylor","Moore","Jackson","Martin","Lee","Perez","Thompson","White","Harris","Sanchez",
        "Clark","Ramirez","Lewis","Robinson","Walker","Young","Allen","King","Wright"
    )

    private val courseNames: Array<String> = arrayOf(
        "ACCT","ECON","MATH","CS","PHYS","BIOL","CHEM","BUSSTAT","BUSCOM","ITM","FINAN","GEOG","DATA-LA","CS-HU","ANTH","ENGL",
        "POLS","PSYC","GEOS","LING","SOC","VIP","BOT","PUBADM","ART","ARTHIST","HIST","ED-CIFS","ED-LLC","ED-ESP","AE","BUSBTC","BAS","MDS",
        "CPS","CORE","COMM","ZOOL","EEB","STEM-ED","ENGR","ME","MSE","KINES","ECE","CJ"
    )

    /**
     * getRandFName()
     * @return String
     * Returns a random element from the first name array
     */
    fun getRandFName():String{
        return fNames.elementAt(Random.nextInt(0,fNames.size-1))
    }

    /**
     * getRandLName()
     * @return String
     * Returns a random element from the last name array
     */
    fun getRandLName():String{
        return lNames.elementAt(Random.nextInt(0,lNames.size-1))
    }

    /**
     * getRandCourseName()
     * @return String
     * Returns a random element from the course name array
     */
    fun getRandCourseName():String{
        return courseNames.elementAt(Random.nextInt(0,courseNames.size-1))
    }

    /**
     * getRandCourseNum()
     * @return Int
     * Returns a random course number between 95-400
     */
    fun getRandCourseNum():Int{
        return Random.nextInt(95,400)
    }

    /**
     * getRandCourseSeats()
     * @return Int
     * Returns a max seat occupancy from between 10-30
     */
    fun getRandCourseSeats():Int{
        return Random.nextInt(10,30)
    }
}
