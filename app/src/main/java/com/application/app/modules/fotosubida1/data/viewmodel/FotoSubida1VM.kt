package com.application.app.modules.fotosubida1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.fotosubida1.`data`.model.FotoSubida1Model
import org.koin.core.KoinComponent

public class FotoSubida1VM : ViewModel(), KoinComponent {
  public val fotoSubida1Model: MutableLiveData<FotoSubida1Model> =
      MutableLiveData(FotoSubida1Model())

  public var navArguments: Bundle? = null
}
