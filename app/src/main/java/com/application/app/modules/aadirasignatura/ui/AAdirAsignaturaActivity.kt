package com.application.app.modules.aadirasignatura.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAAdirAsignaturaBinding
import com.application.app.modules.aadirasignatura.`data`.viewmodel.AAdirAsignaturaVM
import kotlin.String
import kotlin.Unit

public class AAdirAsignaturaActivity :
    BaseActivity<ActivityAAdirAsignaturaBinding>(R.layout.activity_a_adir_asignatura) {
  private val viewModel: AAdirAsignaturaVM by viewModels<AAdirAsignaturaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aAdirAsignaturaVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "A_ADIR_ASIGNATURA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AAdirAsignaturaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
