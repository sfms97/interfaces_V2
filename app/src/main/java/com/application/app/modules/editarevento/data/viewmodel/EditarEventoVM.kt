package com.application.app.modules.editarevento.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.editarevento.`data`.model.EditarEventoModel
import org.koin.core.KoinComponent

public class EditarEventoVM : ViewModel(), KoinComponent {
  public val editarEventoModel: MutableLiveData<EditarEventoModel> =
      MutableLiveData(EditarEventoModel())

  public var navArguments: Bundle? = null
}
