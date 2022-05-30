package com.application.app.modules.aadirasignatura.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.aadirasignatura.`data`.model.AAdirAsignaturaModel
import org.koin.core.KoinComponent

public class AAdirAsignaturaVM : ViewModel(), KoinComponent {
  public val aAdirAsignaturaModel: MutableLiveData<AAdirAsignaturaModel> =
      MutableLiveData(AAdirAsignaturaModel())

  public var navArguments: Bundle? = null
}
