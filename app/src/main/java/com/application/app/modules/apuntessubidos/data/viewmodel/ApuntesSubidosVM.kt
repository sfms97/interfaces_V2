package com.application.app.modules.apuntessubidos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.apuntessubidos.`data`.model.ApuntesSubidosModel
import org.koin.core.KoinComponent

public class ApuntesSubidosVM : ViewModel(), KoinComponent {
  public val apuntesSubidosModel: MutableLiveData<ApuntesSubidosModel> =
      MutableLiveData(ApuntesSubidosModel())

  public var navArguments: Bundle? = null
}
