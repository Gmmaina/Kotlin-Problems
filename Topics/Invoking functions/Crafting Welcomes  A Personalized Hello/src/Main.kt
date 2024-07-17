fun main() {
    // Initialize standard input
    val input = readLine() ?: ""

    // Define a function to generate a greeting
    fun generateGreeting(name: String): String {
        // Function body needs to be implemented
        return "Hello, $input"
    }

    // Print the result of the invoked function
    println(generateGreeting(input.trim()))
}