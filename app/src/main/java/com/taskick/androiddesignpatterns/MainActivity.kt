package com.taskick.androiddesignpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.taskick.androiddesignpatterns.patterns.factory_pattern.BookFactory
import com.taskick.androiddesignpatterns.patterns.factory_pattern.Pizza
import com.taskick.androiddesignpatterns.patterns.factory_pattern.PizzaType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pizzaType = "MARGHERITA"

        val pizza: Pizza = BookFactory.createPizza(when (pizzaType) {
            "MARGHERITA" -> PizzaType.MARGHERITA
            "DIAVOLA" -> PizzaType.DIAVOLA
            "CAPRICCIOSA" -> PizzaType.CAPRICCIOSA
            else -> throw IllegalArgumentException("Unvalid argument")
        })

        Log.d("FACTORY_PATTERN", " \nPizza ${pizza.getName()}\nPrice: ${pizza.getPrice()}\nIngredients: ${pizza.getIngredients()}")


    }
}