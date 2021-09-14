package com.taskick.androiddesignpatterns.patterns.factory_pattern.model

import com.taskick.androiddesignpatterns.patterns.factory_pattern.Pizza


class PizzaDiavola : Pizza {

    override fun getName(): String {
        return "Diavola"
    }

    override fun getPrice(): String {
        return "6.00"
    }

    override fun getIngredients(): String {
        return "Pomodoro, Mozzarella, Salame piccante"
    }

}