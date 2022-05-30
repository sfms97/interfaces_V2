package com.application.app.modules.eventoeliminadp.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EventoEliminadpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEventoEliminad: String? =
      MyApp.getInstance().resources.getString(R.string.msg_evento_eliminad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEventoEliminad1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_evento_eliminad)

)
