package com.application.app.modules.subirfoto.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SubirFotoModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubirFoto: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_subir_foto2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeleccionaLaF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selecciona_la_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubir: String? = MyApp.getInstance().resources.getString(R.string.lbl_subir)

)
