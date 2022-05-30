package com.application.app.modules.ocio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.ocio.`data`.model.OcioModel
import org.koin.core.KoinComponent

public class OcioVM : ViewModel(), KoinComponent {
  public val ocioModel: MutableLiveData<OcioModel> = MutableLiveData(OcioModel())

  public var navArguments: Bundle? = null
}
