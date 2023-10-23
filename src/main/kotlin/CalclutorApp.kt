class CalclutorApp {
    var command: String = ""

    fun start() {
        println("Welcome to Leons calcultor App")

        while (command != "exit") {
            when (command) {
                "+" -> {
                    val result = addition()
                    println("The result is $result")
                }
                "-" -> {
                    val result = supstraction()
                    println("The result is $result")
                }
                "/" -> {
                    val result = division()
                    println("The result is $result")
                }
                "*" -> {
                    val result = multiplcation()
                    println("The result is $result")
                }
                else -> {
                    "Use one of the Commands!"
                }
            }
            println("Use '+', '-', '/','*': ")
            command = readln()
        }
    }



    fun addition(): Double {
        print("Enter yourh first number")
        val num1 = readln().toDouble()
        print("enter your second number")
        val num2 = readln().toDouble()
        print("Enter your third number")
        val num3 = readln().toDouble()
==
        return num1 + num2

    }
    fun supstraction(): Double {
        print("Enter your first number")
        val num1 = readln().toDouble()
        print("enter your second number")
        val num2 = readln().toDouble()

        return num1 - num2

    }
    fun multiplcation(): Double {
        print("Enter your first number")
        val num1 = readln().toDouble()
        print("enter your second number")
        val num2 = readln().toDouble()

        return num1 * num2

    }
    fun division(): Double {
        print("Enter your first number")
        val num1 = readln().toDouble()
        print("enter your second number")
        val num2 = readln().toDouble()


        return num1 / num2

    }


}