package com.application.app.modules.eliminar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.eliminar.`data`.model.EliminarModel
import org.koin.core.KoinComponent

public class EliminarVM : ViewModel(), KoinComponent {
  public val eliminarModel: MutableLiveData<EliminarModel> = MutableLiveData(EliminarModel())

  public var navArguments: Bundle? = null
}
