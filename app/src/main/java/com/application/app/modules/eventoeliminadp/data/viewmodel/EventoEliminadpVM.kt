package com.application.app.modules.eventoeliminadp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.eventoeliminadp.`data`.model.EventoEliminadpModel
import org.koin.core.KoinComponent

public class EventoEliminadpVM : ViewModel(), KoinComponent {
  public val eventoEliminadpModel: MutableLiveData<EventoEliminadpModel> =
      MutableLiveData(EventoEliminadpModel())

  public var navArguments: Bundle? = null
}
