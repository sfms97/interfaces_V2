package com.application.app.modules.confirmarlogout.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ConfirmarLogoutModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeguroQueQui: String? =
      MyApp.getInstance().resources.getString(R.string.msg_seguro_que_qui)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtS: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)

)
