package com.application.app.modules.login.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegstrate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reg_strate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStudyEnjoy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_study_enjoy)

)
