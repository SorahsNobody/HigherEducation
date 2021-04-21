import kotlin.random.Random

class Names(){
    val fNames: Array<String> = arrayOf(
        "James","Jim","John","Jon","Robert","Michael","Mike","William","Will","Bill","David","Dave","Richard",
        "Joseph","Thomas","Charles","Charlie","Christopher","Chris","Daniel","Dan","Matthew","Matt","Anthony","Tony",
        "Mary","Patricia","Pat","Jennifer","Jen","Linda","Elizabeth","Eliza","Barbara","Barb","Susan","Jessica","Sarah","Sara",
        "Karen","Nancy","Lisa","Margaret","Margie","Betty","Sandra"
    )
    val lNames: Array<String> = arrayOf(
        "Smith","Johnson","Williams","Brown","Jones","Garcia","Miller","Davis","Rodriquez","Martinez","Hernandez","Lopez","Gonzalez",
        "Wilson","Anderson","Thomas","Taylor","Moore","Jackson","Martin","Lee","Perez","Thompson","White","Harris","Sanchez",
        "Clark","Ramirez","Lewis","Robinson","Walker","Young","Allen","King","Wright"
    )

    fun getRandFName():String{
        return fNames.elementAt(Random.nextInt(0,fNames.size-1))
    }
    fun getRandLName():String{
        return lNames.elementAt(Random.nextInt(0,lNames.size-1))
    }
}
