package com.vander.scaffold.form

import com.vander.scaffold.screen.Screen
import io.reactivex.Observable

interface FormIntents : Screen.Intents {
  val form: Form
  fun state(): Observable<FormData> = form.state()
}