package com.application.app.modules.menudesplegable.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class MenuDesplegableModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubirApuntes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_subir_apuntes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTtulo: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_tulo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeleccionaLaA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selecciona_la_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeleccionaElF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selecciona_el_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubirApuntes1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_subir_apuntes2)

)
