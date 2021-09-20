fun main(){
    val countries= listOf("Saudi Arabia","USA","Indonesia")
    val capital= arrayListOf<String>()

    for(i in countries) {
        print("Please Enter The Capital of $i: ")
        capital.add(readLine().toString())
    }

    for(c in 0..2)
        println("The Capital of "+countries[c]+" is "+capital[c])
}