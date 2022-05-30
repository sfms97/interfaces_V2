package com.application.app.modules.apuntes.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ApuntesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAsignaturas: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_asignaturas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAadir: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_adir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEliminar: String? = MyApp.getInstance().resources.getString(R.string.lbl_eliminar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFsica: String? = MyApp.getInstance().resources.getString(R.string.lbl_f_sica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHistoria: String? = MyApp.getInstance().resources.getString(R.string.lbl_historia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProgramacin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_programaci_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterfacesDeU: String? =
      MyApp.getInstance().resources.getString(R.string.msg_interfaces_de_u)

)
