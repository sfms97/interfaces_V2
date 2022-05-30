package com.application.app.modules.eventomodificado.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.eventomodificado.`data`.model.EventoModificadoModel
import org.koin.core.KoinComponent

public class EventoModificadoVM : ViewModel(), KoinComponent {
  public val eventoModificadoModel: MutableLiveData<EventoModificadoModel> =
      MutableLiveData(EventoModificadoModel())

  public var navArguments: Bundle? = null
}
