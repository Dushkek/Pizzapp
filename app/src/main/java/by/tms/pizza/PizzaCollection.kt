package by.tms.pizza

class PizzaCollection() {
    val pizzaCollection = ArrayList<Pizza>()

    companion object {
        val instance by lazy {
            PizzaCollection()
        }
    }

    fun fillPizzaCollection() {
        pizzaCollection.add(
            Pizza("bavarian", 12.0, R.string.bavarian_ingredients, R.drawable.bavarian)
        )
        pizzaCollection.add(
            Pizza("curry", 12.0, R.string.curry_ingredients, R.drawable.curry)
        )
        pizzaCollection.add(
            Pizza("Ham", 12.0, R.string.ham_ingredients, R.drawable.ham)
        )
        pizzaCollection.add(
            Pizza("Pepperoni", 12.0, R.string.pepperoni_ingredients, R.drawable.pepperoni)
        )
        pizzaCollection.add(
            Pizza("bavarian", 12.0, R.string.pineapple_ingredients, R.drawable.pineapple)
        )
        pizzaCollection.add(
            Pizza("bavarian", 12.0, R.string.tomato_ingredients, R.drawable.tomato)
        )

    }
}