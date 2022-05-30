package com.application.app.modules.editarperfil.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class EditarPerfilModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditar: String? = MyApp.getInstance().resources.getString(R.string.lbl_editar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditar1: String? = MyApp.getInstance().resources.getString(R.string.lbl_editar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername1: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFirstname: String? = MyApp.getInstance().resources.getString(R.string.lbl_firstname)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFirstname1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_firstname)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTelfono: String? = MyApp.getInstance().resources.getString(R.string.lbl_tel_fono)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTelfono1: String? = MyApp.getInstance().resources.getString(R.string.lbl_tel_fono)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastname: String? = MyApp.getInstance().resources.getString(R.string.lbl_lastname)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastname1: String? = MyApp.getInstance().resources.getString(R.string.lbl_lastname)

)
