object Bob {
    fun hey(input: String): String {

        val trimmedInput = input.trim()

        return when {
            trimmedInput.isBlank() -> "Fine. Be that way!"
            trimmedInput.isYell() && trimmedInput.isQuestion() -> "Calm down, I know what I'm doing!"
            trimmedInput.isQuestion() -> "Sure."
            trimmedInput.isYell() -> "Whoa, chill out!"
            else -> "Whatever."
        }
    }

    private fun String.isQuestion(): Boolean {
        return this.endsWith("?")
    }

    private fun String.isYell(): Boolean {
        return (this.map { it.isLetter() }.contains(true)) && (this.toUpperCase() == this)
    }
}
