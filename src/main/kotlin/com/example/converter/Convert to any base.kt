package com.example.converter


fun main() {
    while (true) {
        print("Enter two numbers in format: {source base} {target base} (To quit type /exit) > ")
        val list = readln()
        if (list == "/exit") break
        val source = list.split(' ')[0].toInt()
        val target = list.split(' ')[1].toInt()
        while (true) {
            print("Enter number in base $source to convert to base $target (To go back type /back) > ")
            val input = readln()
            if (input == "/back") {
                break
            } else if (source == 10) {
                val number = input.toBigInteger()
                println("Conversion result: ${number.toString(target)}")
            } else if (target == 10) {
                println("Conversion to decimal result: ${input.toBigInteger(source)}")
            } else {
                val result = input.toBigInteger(source)
                println("Conversion to decimal result: ${result.toString(target)}")
            }
        }
    }
}
