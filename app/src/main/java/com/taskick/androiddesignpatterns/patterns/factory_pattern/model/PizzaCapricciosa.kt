package com.taskick.androiddesignpatterns.patterns.factory_pattern.model

import com.taskick.androiddesignpatterns.patterns.factory_pattern.Pizza


class PizzaCapricciosa : Pizza {

    override fun getName(): String {
        return "Capricciosa"
    }

    override fun getPrice(): String {
        return "7.00"
    }

    override fun getIngredients(): String {
        return "Pomodoro, Mozzarella, Funghi, Olive, Prosciutto cotto"
    }

}