package com.application.app.modules.ocio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOcioBinding
import com.application.app.modules.calendario.ui.CalendarioActivity
import com.application.app.modules.ocio.`data`.viewmodel.OcioVM
import kotlin.String
import kotlin.Unit

public class OcioActivity : BaseActivity<ActivityOcioBinding>(R.layout.activity_ocio) {
  private val viewModel: OcioVM by viewModels<OcioVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ocioVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageGroup1.setOnClickListener {
      val destIntent = CalendarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "OCIO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OcioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
