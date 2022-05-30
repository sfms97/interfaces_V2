package com.application.app.modules.signup.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastname: String? = MyApp.getInstance().resources.getString(R.string.lbl_lastname)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStudyEnjoy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_study_enjoy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)

)
