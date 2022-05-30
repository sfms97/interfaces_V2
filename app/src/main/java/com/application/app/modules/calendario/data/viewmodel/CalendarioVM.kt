package com.application.app.modules.calendario.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.calendario.`data`.model.Calendario1RowModel
import com.application.app.modules.calendario.`data`.model.CalendarioModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class CalendarioVM : ViewModel(), KoinComponent {
  public val calendarioModel: MutableLiveData<CalendarioModel> = MutableLiveData(CalendarioModel())

  public var navArguments: Bundle? = null

  public val recyclerGridList: MutableLiveData<MutableList<Calendario1RowModel>> =
      MutableLiveData(mutableListOf())
}
