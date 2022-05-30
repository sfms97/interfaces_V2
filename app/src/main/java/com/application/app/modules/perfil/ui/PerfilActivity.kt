package com.application.app.modules.perfil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPerfilBinding
import com.application.app.modules.calendario.ui.CalendarioActivity
import com.application.app.modules.editarperfil.ui.EditarPerfilActivity
import com.application.app.modules.ocio.ui.OcioActivity
import com.application.app.modules.perfil.`data`.viewmodel.PerfilVM
import com.application.app.modules.subirfoto.ui.SubirFotoActivity
import kotlin.String
import kotlin.Unit

public class PerfilActivity : BaseActivity<ActivityPerfilBinding>(R.layout.activity_perfil) {
  private val viewModel: PerfilVM by viewModels<PerfilVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.perfilVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtSubirFoto.setOnClickListener {
      val destIntent = SubirFotoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtEditar.setOnClickListener {
      val destIntent = EditarPerfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup2.setOnClickListener {
      val destIntent = CalendarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup1.setOnClickListener {
      val destIntent = OcioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "PERFIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PerfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
