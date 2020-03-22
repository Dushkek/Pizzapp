package by.tms.pizza

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PizzaCollection.instance.fillPizzaCollection()

        recyclerVIew.adapter = PizzaAdapter(PizzaCollection.instance.pizzaCollection)
        recyclerVIew.layoutManager = LinearLayoutManager(this)
        recyclerVIew.setHasFixedSize(true)
    }

}