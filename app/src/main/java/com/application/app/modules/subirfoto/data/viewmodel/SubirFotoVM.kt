package com.application.app.modules.subirfoto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.subirfoto.`data`.model.SubirFotoModel
import org.koin.core.KoinComponent

public class SubirFotoVM : ViewModel(), KoinComponent {
  public val subirFotoModel: MutableLiveData<SubirFotoModel> = MutableLiveData(SubirFotoModel())

  public var navArguments: Bundle? = null
}
