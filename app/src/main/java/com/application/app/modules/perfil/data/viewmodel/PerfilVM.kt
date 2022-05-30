package com.application.app.modules.perfil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.perfil.`data`.model.PerfilModel
import org.koin.core.KoinComponent

public class PerfilVM : ViewModel(), KoinComponent {
  public val perfilModel: MutableLiveData<PerfilModel> = MutableLiveData(PerfilModel())

  public var navArguments: Bundle? = null
}
