package com.nduati.androidtesting.mainactivity

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.nduati.androidtesting.R

class MainScreen() : Screen<MainScreen>() {
    val mainBtn = KButton{withId(R.id.main_button)}
    val ksnack = KView{withId(com.google.android.material.R.id.snackbar_text)}
    val navigtBtn = KButton{withId(R.id.navigate_to_page2_button)}
    val inptBox = KEditText{withId(R.id.mainEditText)}
}