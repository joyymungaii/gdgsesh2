package com.example.gdgsesh.model

import com.example.gdgsesh.R

class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Paris", R.drawable.paris, 1_500_000))
        cities.add(City("Barcelona", R.drawable.Barcelona, 1_100_000))
        cities.add(City("Beijing", R.drawable.Beijing, 1_900_000))
        cities.add(City("Liverpool", R.drawable.Liverpool, 400_000))
        cities.add(City("London", R.drawable.London, 2_100_000))
        cities.add(City("Moscow", R.drawable.Moscow, 3_700_000))
        cities.add(City("Scotland", R.drawable.Scotland, 1_800_000))
        cities.add(City("Tokyo", R.drawable.Tokyo, 700_000))

    }

    fun getCities() = cities
}
