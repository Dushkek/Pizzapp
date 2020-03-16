package by.tms.pizza

class PizzaCollection {
    val collectionOfPizz = ArrayList<Pizza>()

    companion object{
        val instance = PizzaCollection()
    }
}