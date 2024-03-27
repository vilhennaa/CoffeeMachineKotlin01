package machine

fun main() {
    // makingCoffe()
    // ingredientCalculator()
//    estimateNumsOfServing()
//    buyFillTake()
    keepTrack()
}

fun makingCoffe() {
    val coffeP = """
    Starting to make a coffee
    Grinding coffee beans
    Boiling water
    Mixing boiled water with crushed coffee beans
    Pouring coffee into the cup
    Pouring some milk into the cup
    Coffee is ready!
    """.trimIndent()
    println(coffeP)
}

fun ingredientCalculator() {
    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()
    val water = 200 * cups
    val milk = 50 * cups
    val coffeBeans = 15 * cups
    println("For $cups cups of coffee you will need:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$coffeBeans g of coffee beans")
}

fun estimateNumsOfServing() {
    println("Write how many ml of water the coffee machine has:")
    var water = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    var milk = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    var coffee = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val qtd = readln().toInt()

    water /= 200
    var total = water
    milk /= 50
    if (milk < total) {
        total = milk
    }
    coffee /= 15
    if (coffee < total) {
        total = coffee
    }

    when {
        qtd > total -> println("No, I can make only $total cups of coffee")
        qtd == total -> println("Yes, I can make that amount of coffee")
        qtd < total -> println("Yes, I can make that amount of coffee (and even ${total-qtd} more than that)")
    }

}

fun buyFillTake() {
    var coffeeM = CoffeeMachineStg04()

    coffeeM.remaining()
    println()
    println("Write action (buy, fill, take):")
    val action = readln()

    when (action) {
        "buy" ->{


            coffeeM.buy()
        }

        "fill" -> {
            coffeeM.fill()
        }
        "take" -> {
            coffeeM.take()
        }
    }
    println()
    coffeeM.remaining()
}

fun keepTrack(){
    var coffee01 = CoffeeMachineStg04()

    while (true){
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()
        println()
        when (action) {
            "buy" -> coffee01.buy()
            "fill" -> coffee01.fill()
            "take" -> coffee01.take()
            "remaining" -> coffee01.remaining()
            "exit" -> break
        }
        println()
    }
}
