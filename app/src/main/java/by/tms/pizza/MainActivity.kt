package by.tms.pizza

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bavarskayaFragment = PizzaFragment()
        supportFragmentManager.beginTransaction().replace(R.id.bavarskayaFragment, bavarskayaFragment).commit()

        val karriFragment = PizzaFragment()
        supportFragmentManager.beginTransaction().replace(R.id.karriFragment, karriFragment).commit()

        val pepperoniFragment = PizzaFragment()
        supportFragmentManager.beginTransaction().replace(R.id.pepperoniFragment, pepperoniFragment).commit()

        val pineappleFragment = PizzaFragment()
        supportFragmentManager.beginTransaction().replace(R.id.pineappleFragment, pineappleFragment).commit()

        val vetchinaFragment = PizzaFragment()
        supportFragmentManager.beginTransaction().replace(R.id.vetchinaFragment, vetchinaFragment).commit()

        val tomatnayaFragment = PizzaFragment()
        supportFragmentManager.beginTransaction().replace(R.id.tomatnayaFragment, tomatnayaFragment).commit()
    }
}