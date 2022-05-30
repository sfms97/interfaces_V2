package com.application.app.modules.eventos.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EventosModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAadir: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_adir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEventos: String? = MyApp.getInstance().resources.getString(R.string.lbl_eventos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTtulo: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_tulo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAsignatura: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_asignatura)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFecha: String? = MyApp.getInstance().resources.getString(R.string.lbl_fecha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtComentarios: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comentarios)

)
