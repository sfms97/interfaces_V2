package com.application.app.modules.aadirasignatura.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AAdirAsignaturaModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNombreDeLaAs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_de_la_as)

)
