package com.application.app.modules.fotosubida.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFotoSubidaBinding
import com.application.app.modules.fotosubida.`data`.viewmodel.FotoSubidaVM
import kotlin.String
import kotlin.Unit

public class FotoSubidaActivity :
    BaseActivity<ActivityFotoSubidaBinding>(R.layout.activity_foto_subida) {
  private val viewModel: FotoSubidaVM by viewModels<FotoSubidaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fotoSubidaVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "FOTO_SUBIDA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FotoSubidaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
