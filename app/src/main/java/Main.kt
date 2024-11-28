fun main() {
    var answer = ""
    do {
        if (answer != "N") {
            print("insert value of X:")
            val x = readLine()
            print("insert value of Y:")
            val y = readLine()
            val fixedX = x?.filter { it.isDigit() }?.toIntOrNull() ?: 0
            val fixedY = y?.filter { it.isDigit() }?.toIntOrNull() ?: 0

            if (fixedY != 0) {
                val z = fixedX.toFloat() / fixedY.toFloat()
                println("${fixedX} divided by ${fixedY} = ${if (z % 1 == 0f) z.toInt() else z}")
            } else {
                println("can't divide by 0")
            }
        }
        do {
            print("გსურთ პროგრამის ხელახლა დაწყება ? insert Y/N only!")
            val yesOrNo = readLine()?.toUpperCase()

            if (yesOrNo == "Y") {
                answer = yesOrNo
            } else if (yesOrNo == "N") {
                println("The End")
                answer = yesOrNo
            }
        } while (answer != "Y" && answer != "N")

    } while (answer == "Y")
}









