package com.application.app.modules.eventoaadido.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EventoAAdidoModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEVENTOAADIDO: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_evento_a_adido)

)
