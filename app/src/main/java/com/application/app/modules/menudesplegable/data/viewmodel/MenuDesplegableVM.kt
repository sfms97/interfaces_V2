package com.application.app.modules.menudesplegable.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.menudesplegable.`data`.model.MenuDesplegableModel
import org.koin.core.KoinComponent

public class MenuDesplegableVM : ViewModel(), KoinComponent {
  public val menuDesplegableModel: MutableLiveData<MenuDesplegableModel> =
      MutableLiveData(MenuDesplegableModel())

  public var navArguments: Bundle? = null
}
