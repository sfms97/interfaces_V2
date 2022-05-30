package com.application.app.modules.eventoaadido.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.eventoaadido.`data`.model.EventoAAdidoModel
import org.koin.core.KoinComponent

public class EventoAAdidoVM : ViewModel(), KoinComponent {
  public val eventoAAdidoModel: MutableLiveData<EventoAAdidoModel> =
      MutableLiveData(EventoAAdidoModel())

  public var navArguments: Bundle? = null
}
