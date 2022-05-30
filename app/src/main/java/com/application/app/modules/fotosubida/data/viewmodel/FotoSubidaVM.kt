package com.application.app.modules.fotosubida.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.fotosubida.`data`.model.FotoSubidaModel
import org.koin.core.KoinComponent

public class FotoSubidaVM : ViewModel(), KoinComponent {
  public val fotoSubidaModel: MutableLiveData<FotoSubidaModel> = MutableLiveData(FotoSubidaModel())

  public var navArguments: Bundle? = null
}
