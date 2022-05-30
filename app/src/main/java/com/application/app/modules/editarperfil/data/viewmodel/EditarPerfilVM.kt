package com.application.app.modules.editarperfil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.editarperfil.`data`.model.EditarPerfil1RowModel
import com.application.app.modules.editarperfil.`data`.model.EditarPerfilModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class EditarPerfilVM : ViewModel(), KoinComponent {
  public val editarPerfilModel: MutableLiveData<EditarPerfilModel> =
      MutableLiveData(EditarPerfilModel())

  public var navArguments: Bundle? = null

  public val recyclerEditarPerfilList: MutableLiveData<MutableList<EditarPerfil1RowModel>> =
      MutableLiveData(mutableListOf())
}
