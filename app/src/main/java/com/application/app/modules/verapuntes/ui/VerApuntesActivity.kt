package com.application.app.modules.verapuntes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityVerApuntesBinding
import com.application.app.modules.ampliar.ui.AmpliarActivity
import com.application.app.modules.verapuntes.`data`.viewmodel.VerApuntesVM
import kotlin.String
import kotlin.Unit

public class VerApuntesActivity :
    BaseActivity<ActivityVerApuntesBinding>(R.layout.activity_ver_apuntes) {
  private val viewModel: VerApuntesVM by viewModels<VerApuntesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verApuntesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageZoomIn.setOnClickListener {
      val destIntent = AmpliarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "VER_APUNTES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VerApuntesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
