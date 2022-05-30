package com.application.app.modules.apuntes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityApuntesBinding
import com.application.app.modules.aadirasignatura.ui.AAdirAsignaturaActivity
import com.application.app.modules.apuntes.`data`.viewmodel.ApuntesVM
import com.application.app.modules.apuntes2.ui.Apuntes2Activity
import com.application.app.modules.eliminar.ui.EliminarActivity
import kotlin.String
import kotlin.Unit

public class ApuntesActivity : BaseActivity<ActivityApuntesBinding>(R.layout.activity_apuntes) {
  private val viewModel: ApuntesVM by viewModels<ApuntesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.apuntesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.viewRectangle20.setOnClickListener {
      val destIntent = EliminarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangle19.setOnClickListener {
      val destIntent = AAdirAsignaturaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFsica.setOnClickListener {
      val destIntent = Apuntes2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APUNTES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ApuntesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
