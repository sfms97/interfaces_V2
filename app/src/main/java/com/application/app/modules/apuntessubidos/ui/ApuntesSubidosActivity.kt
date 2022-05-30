package com.application.app.modules.apuntessubidos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityApuntesSubidosBinding
import com.application.app.modules.apuntessubidos.`data`.viewmodel.ApuntesSubidosVM
import kotlin.String
import kotlin.Unit

public class ApuntesSubidosActivity :
    BaseActivity<ActivityApuntesSubidosBinding>(R.layout.activity_apuntes_subidos) {
  private val viewModel: ApuntesSubidosVM by viewModels<ApuntesSubidosVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.apuntesSubidosVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "APUNTES_SUBIDOS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ApuntesSubidosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
