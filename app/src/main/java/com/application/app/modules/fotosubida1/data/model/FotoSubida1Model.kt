package com.application.app.modules.fotosubida1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FotoSubida1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArchivoDescarg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_archivo_descarg)

)
