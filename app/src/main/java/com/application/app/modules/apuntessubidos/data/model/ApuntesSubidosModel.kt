package com.application.app.modules.apuntessubidos.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ApuntesSubidosModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtApuntesSubidos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_apuntes_subidos)

)
