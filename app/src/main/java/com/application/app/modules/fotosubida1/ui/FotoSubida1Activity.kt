package com.application.app.modules.fotosubida1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFotoSubida1Binding
import com.application.app.modules.fotosubida1.`data`.viewmodel.FotoSubida1VM
import kotlin.String
import kotlin.Unit

public class FotoSubida1Activity :
    BaseActivity<ActivityFotoSubida1Binding>(R.layout.activity_foto_subida1) {
  private val viewModel: FotoSubida1VM by viewModels<FotoSubida1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fotoSubida1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "FOTO_SUBIDA1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FotoSubida1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
