package com.application.app.modules.ocio.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class OcioModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOcioCercano: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ocio_cercano)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBuscar: String? = MyApp.getInstance().resources.getString(R.string.lbl_buscar)

)
