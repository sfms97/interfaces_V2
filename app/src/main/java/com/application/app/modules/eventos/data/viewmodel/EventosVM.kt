package com.application.app.modules.eventos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.eventos.`data`.model.EventosModel
import org.koin.core.KoinComponent

public class EventosVM : ViewModel(), KoinComponent {
  public val eventosModel: MutableLiveData<EventosModel> = MutableLiveData(EventosModel())

  public var navArguments: Bundle? = null
}
