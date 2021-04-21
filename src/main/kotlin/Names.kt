import kotlin.random.Random

class Names(){
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

    fun getRandFName():String{
        return fNames.elementAt(Random.nextInt(0,fNames.size-1))
    }
    fun getRandLName():String{
        return lNames.elementAt(Random.nextInt(0,lNames.size-1))
    }
    fun getRandCourseName():String{
        return courseNames.elementAt(Random.nextInt(0,courseNames.size-1))
    }
    fun getRandCourseNum():Int{
        return Random.nextInt(95,400)
    }
    fun getRandCourseSeats():Int{
        return Random.nextInt(10,30)
    }
}
