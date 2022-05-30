package com.application.app.modules.ampliar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.ampliar.`data`.model.AmpliarModel
import org.koin.core.KoinComponent

public class AmpliarVM : ViewModel(), KoinComponent {
  public val ampliarModel: MutableLiveData<AmpliarModel> = MutableLiveData(AmpliarModel())

  public var navArguments: Bundle? = null
}
