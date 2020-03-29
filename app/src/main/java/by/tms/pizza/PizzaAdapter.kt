package by.tms.pizza

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pizza_item.view.*

class PizzaAdapter(val list : ArrayList<Pizza>) : RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {

    class PizzaViewHolder(itemView : View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val itemInflate = LayoutInflater.from(parent.context).inflate(R.layout.pizza_item, parent, false)
        return PizzaViewHolder(itemInflate)
    }

    override fun getItemCount(): Int {
        return list.size
    }
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val myView = holder.itemView
        myView.pizzaName.text = list[position].name
        myView.pizzaPrice.text = list[position].price.toString()
        myView.pizzaIngredients.text = myView.context.getString(list[position].ingredients)
        myView.imagePizzaFragment.background = myView.context.getDrawable(list[position].image)


    }


}