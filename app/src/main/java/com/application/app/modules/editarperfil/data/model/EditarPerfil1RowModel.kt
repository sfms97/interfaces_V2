package com.application.app.modules.editarperfil.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EditarPerfil1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail1: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)

)
