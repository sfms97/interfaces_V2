package com.application.app.modules.verapuntes.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class VerApuntesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFsica: String? = MyApp.getInstance().resources.getString(R.string.lbl_f_sica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtApuntes1fech: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apuntes_1_fech)

)
