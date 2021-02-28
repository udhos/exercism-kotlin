object Pangram {

    fun isPangram(input: String): Boolean {
        var seen = mutableSetOf<Char>()
        for (c in input) {
            if (c.isLetter()) {
                seen.add(c.toLowerCase())
            }
        }
        return seen.count() == 26
    }
}
