package com.application.app.modules.apuntes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.apuntes.`data`.model.ApuntesModel
import org.koin.core.KoinComponent

public class ApuntesVM : ViewModel(), KoinComponent {
  public val apuntesModel: MutableLiveData<ApuntesModel> = MutableLiveData(ApuntesModel())

  public var navArguments: Bundle? = null
}
