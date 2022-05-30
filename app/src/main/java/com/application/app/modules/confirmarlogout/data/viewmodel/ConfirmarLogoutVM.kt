package com.application.app.modules.confirmarlogout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.confirmarlogout.`data`.model.ConfirmarLogoutModel
import org.koin.core.KoinComponent

public class ConfirmarLogoutVM : ViewModel(), KoinComponent {
  public val confirmarLogoutModel: MutableLiveData<ConfirmarLogoutModel> =
      MutableLiveData(ConfirmarLogoutModel())

  public var navArguments: Bundle? = null
}
