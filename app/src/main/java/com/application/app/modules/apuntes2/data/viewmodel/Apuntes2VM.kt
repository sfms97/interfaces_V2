package com.application.app.modules.apuntes2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.apuntes2.`data`.model.Apuntes2Model
import org.koin.core.KoinComponent

public class Apuntes2VM : ViewModel(), KoinComponent {
  public val apuntes2Model: MutableLiveData<Apuntes2Model> = MutableLiveData(Apuntes2Model())

  public var navArguments: Bundle? = null
}
