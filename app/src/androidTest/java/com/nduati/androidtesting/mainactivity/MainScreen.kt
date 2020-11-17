package com.nduati.androidtesting.mainactivity

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.nduati.androidtesting.R

class MainScreen() : Screen<MainScreen>() {
    val mainBtn = KButton{withId(R.id.main_button)}
    val ksnack = KView{withId(com.google.android.material.R.id.snackbar_text)}
}