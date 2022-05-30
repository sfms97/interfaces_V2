package com.application.app.modules.subirfoto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySubirFotoBinding
import com.application.app.modules.fotosubida.ui.FotoSubidaActivity
import com.application.app.modules.subirfoto.`data`.viewmodel.SubirFotoVM
import kotlin.String
import kotlin.Unit

public class SubirFotoActivity :
    BaseActivity<ActivitySubirFotoBinding>(R.layout.activity_subir_foto) {
  private val viewModel: SubirFotoVM by viewModels<SubirFotoVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.subirFotoVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtSubir.setOnClickListener {
      val destIntent = FotoSubidaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SUBIR_FOTO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SubirFotoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
