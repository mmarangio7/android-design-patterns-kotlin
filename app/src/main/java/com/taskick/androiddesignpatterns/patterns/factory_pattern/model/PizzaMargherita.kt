package com.taskick.androiddesignpatterns.patterns.factory_pattern.model

import com.taskick.androiddesignpatterns.patterns.factory_pattern.Pizza


class PizzaMargherita : Pizza {

    override fun getName(): String {
        return "Margherita"
    }

    override fun getPrice(): String {
        return "5.00"
    }

    override fun getIngredients(): String {
        return "Pomodoro, Mozzarella"
    }

}
