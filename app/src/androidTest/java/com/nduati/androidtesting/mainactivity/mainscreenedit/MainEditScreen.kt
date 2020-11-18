package com.nduati.androidtesting.mainactivity.mainscreenedit

import com.agoda.kakao.common.views.KView
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.nduati.androidtesting.R

class MainEditScreen() : Screen<MainEditScreen>() {
    val mainEdtTxt  = KEditText{withId(R.id.mainEditText)}
    val mainEdtBtn = KButton{withId(R.id.edtBtn)}
    val snackEdtBar = KView{withId(com.google.android.material.R.id.snackbar_text)}
}