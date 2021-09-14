package com.taskick.androiddesignpatterns

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.taskick.androiddesignpatterns.patterns.factory_pattern.Pizza
import com.taskick.androiddesignpatterns.patterns.factory_pattern.PizzaFactory
import com.taskick.androiddesignpatterns.patterns.factory_pattern.PizzaType

/**
 *  --- FACTORY PATTERN ---
 *  Output will be:
 *   Pizza Margherita
 *   Price: 5.00
 *   Ingredients: Pomodoro, Mozzarella
 * */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* --- --- --- FACTORY PATTERN --- --- --- */
        useFactoryPatter()

    }



    fun useFactoryPatter() {
        val pizzaType = "MARGHERITA"

        val pizza: Pizza = PizzaFactory.createPizza(when (pizzaType) {
            "MARGHERITA" -> PizzaType.MARGHERITA
            "DIAVOLA" -> PizzaType.DIAVOLA
            "CAPRICCIOSA" -> PizzaType.CAPRICCIOSA
            else -> throw IllegalArgumentException("Unvalid argument")
        })

        Log.d("FACTORY_PATTERN", " \nPizza ${pizza.getName()}\nPrice: ${pizza.getPrice()}\nIngredients: ${pizza.getIngredients()}")
    }


}