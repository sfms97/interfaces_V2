package com.application.app.modules.eventomodificado.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EventoModificadoModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEVENTOMODIFICA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_evento_modifica)

)
