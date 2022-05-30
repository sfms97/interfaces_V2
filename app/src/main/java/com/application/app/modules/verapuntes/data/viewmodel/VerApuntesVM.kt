package com.application.app.modules.verapuntes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.verapuntes.`data`.model.VerApuntesModel
import org.koin.core.KoinComponent

public class VerApuntesVM : ViewModel(), KoinComponent {
  public val verApuntesModel: MutableLiveData<VerApuntesModel> = MutableLiveData(VerApuntesModel())

  public var navArguments: Bundle? = null
}
