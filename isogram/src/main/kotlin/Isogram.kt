object Isogram {

    fun isIsogram(input: String): Boolean {
        var seen = mutableSetOf<Char>()
        for (c in input) {
            if (c.isLetter()) {
                val low = c.toLowerCase()
                if (seen.contains(low)) {
                    return false
                }
                seen.add(low)
            }
        }
        return true        
    }
}
