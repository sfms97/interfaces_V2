package com.application.app.modules.editarevento.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EditarEventoModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtComentarios: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comentarios)
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
  public var txtModificar: String? = MyApp.getInstance().resources.getString(R.string.lbl_modificar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEliminar: String? = MyApp.getInstance().resources.getString(R.string.lbl_eliminar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTtuloDelEven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_t_tulo_del_even)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTtuloDelEven1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_t_tulo_del_even)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTtulo: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_tulo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAsignatura1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_asignatura)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtComentarios1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_comentarios)

)
