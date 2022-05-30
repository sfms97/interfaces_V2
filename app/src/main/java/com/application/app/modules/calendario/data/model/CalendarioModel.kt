package com.application.app.modules.calendario.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class CalendarioModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCalendario: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_calendario)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditar: String? = MyApp.getInstance().resources.getString(R.string.lbl_editar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAadirEvento: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_a_adir_evento)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAbril2022: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_abril_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterfaces: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_interfaces)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExamen: String? = MyApp.getInstance().resources.getString(R.string.lbl_examen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProyecto: String? = MyApp.getInstance().resources.getString(R.string.lbl_proyecto)

)
