package com.hihasan.flex


object DataUtils {
    private lateinit var dataModels: Array<DataModel>

    fun dataModel() {
        dataModels = arrayOf(
            DataModel("Tv"),
            DataModel("fridge"),
            DataModel("Sony"),
            DataModel("Samsung Tv"),
            DataModel("Lorem Ipsum this a test"),
            DataModel("Coca Cola"),
            DataModel("Pepsi"),
            DataModel("7-up")
        )
    }
}