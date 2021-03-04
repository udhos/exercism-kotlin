object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {

        /*
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        */
        require (leftStrand.length == rightStrand.length) { "left and right strands must be of equal length" }

        /*
        var distance = 0
        for (i in 0 until leftStrand.length) {
            if (leftStrand.get(i) != rightStrand.get(i)) {
                distance++
            }
        }
        return distance
        */
        return leftStrand.zip(rightStrand).count { it.first != it.second }
    }
}
