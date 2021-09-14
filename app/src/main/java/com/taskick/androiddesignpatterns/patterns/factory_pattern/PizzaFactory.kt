package com.taskick.androiddesignpatterns.patterns.factory_pattern

import com.taskick.androiddesignpatterns.patterns.factory_pattern.model.PizzaCapricciosa
import com.taskick.androiddesignpatterns.patterns.factory_pattern.model.PizzaDiavola
import com.taskick.androiddesignpatterns.patterns.factory_pattern.model.PizzaMargherita


enum class PizzaType {
    MARGHERITA,
    DIAVOLA,
    CAPRICCIOSA
}

interface Pizza {
    fun getName(): String
    fun getPrice(): String
    fun getIngredients(): String
}


object PizzaFactory {

    fun createPizza(pizzaType: PizzaType) : Pizza = when(pizzaType) {
        PizzaType.MARGHERITA -> PizzaMargherita()
        PizzaType.DIAVOLA -> PizzaDiavola()
        PizzaType.CAPRICCIOSA -> PizzaCapricciosa()
    }

}
