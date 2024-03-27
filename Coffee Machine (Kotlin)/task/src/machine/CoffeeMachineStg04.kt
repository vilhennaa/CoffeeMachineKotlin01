package machine

class CoffeeMachineStg04 {
    var water = 400
    var milk = 540
    var coffee = 120
    var cups = 9
    var money = 550

    fun remaining() {
        println("""
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $coffee g of coffee beans
        $cups disposable cups
        $$money of money
    """.trimIndent())
    }

    // val total = minOf((water/200), (milk/50), (coffee/15))
    fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        val coffeeType = readln()
        when (coffeeType) {
            "1" -> {
                if (1 > minOf((water/250), (coffee/16))) {
                    println("Sorry, not enough resources!")
                } else {
                    println("I have enough resources, making you a coffee!")
                    water -= 250
                    coffee -= 16
                    cups -= 1
                    money += 4
                }
            }
            "2" -> {
                if (1 > minOf((water/350), (milk/75), (coffee/20))) {
                    println("Sorry, not enough resources!")
                } else {
                    println("I have enough resources, making you a coffee!")
                    water -= 350
                    milk -= 75
                    coffee -= 20
                    cups -= 1
                    money += 7
                }
            }
            "3" -> {
                if (1 > minOf((water/200), (milk/100), (coffee/12))) {
                    println("Sorry, not enough resources!")
                } else {
                    println("I have enough resources, making you a coffee!")
                    water -= 200
                    milk -= 100
                    coffee -= 12
                    cups -= 1
                    money += 6
                }
            }
            "back" -> {
                return
            }
        }
    }

    fun fill(){
        println("Write how many ml of water you want to add:")
        water += readln().toInt()
        println("Write how many ml of milk you want to add:")
        milk += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        coffee += readln().toInt()
        println("Write how many disposable cups you want to add:")
        cups += readln().toInt()
    }

    fun take() {
        println("I gave you \$$money")
        money = 0
    }

}