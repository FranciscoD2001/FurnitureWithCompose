package com.example.probandoerrores.model

import com.example.probandoerrores.R

data class DataIntroduccion(

    val imgTutorial : Int

)

val tutorialList = listOf(
    DataIntroduccion(
        R.drawable.viewpager1
    ),
    DataIntroduccion(
        R.drawable.viewpager2
    ),
    DataIntroduccion(
        R.drawable.viewpager3
    )

)

