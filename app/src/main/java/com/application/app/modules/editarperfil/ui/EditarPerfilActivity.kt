package com.application.app.modules.editarperfil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEditarPerfilBinding
import com.application.app.modules.editarperfil.`data`.model.EditarPerfil1RowModel
import com.application.app.modules.editarperfil.`data`.viewmodel.EditarPerfilVM
import com.application.app.modules.perfil.ui.PerfilActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class EditarPerfilActivity :
    BaseActivity<ActivityEditarPerfilBinding>(R.layout.activity_editar_perfil) {
  private val viewModel: EditarPerfilVM by viewModels<EditarPerfilVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerEditarPerfilAdapter =
    RecyclerEditarPerfilAdapter(viewModel.recyclerEditarPerfilList.value?:mutableListOf())
    //binding.recyclerEditarPerfil.adapter = recyclerEditarPerfilAdapter
    recyclerEditarPerfilAdapter.setOnItemClickListener(
    object : RecyclerEditarPerfilAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EditarPerfil1RowModel) {
        onClickRecyclerEditarPerfil(view, position, item)
      }
    }
    )
    viewModel.recyclerEditarPerfilList.observe(this) {
      recyclerEditarPerfilAdapter.updateData(it)
    }
    binding.editarPerfilVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.constraintGroup183.setOnClickListener {
      val destIntent = PerfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerEditarPerfil(
    view: View,
    position: Int,
    item: EditarPerfil1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "EDITAR_PERFIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditarPerfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
