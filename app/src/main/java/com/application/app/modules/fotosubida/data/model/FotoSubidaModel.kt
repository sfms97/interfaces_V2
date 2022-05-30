package com.application.app.modules.fotosubida.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FotoSubidaModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFotoSubida: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_foto_subida)

)
