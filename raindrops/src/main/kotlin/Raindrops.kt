object Raindrops {

    fun convert(n: Int): String {
        var result = ""

        if (n % 3 == 0) {
            result += "Pling"
        }
        if (n % 5 == 0) {
            result += "Plang"
        }
        if (n % 7 == 0) {
            result += "Plong"
        }

        if (result.length == 0) {
            return n.toString()
        }

        return result
    }
}
