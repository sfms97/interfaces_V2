package com.application.app.modules.apuntes2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityApuntes2Binding
import com.application.app.modules.apuntes2.`data`.viewmodel.Apuntes2VM
import com.application.app.modules.fotosubida1.ui.FotoSubida1Activity
import com.application.app.modules.verapuntes.ui.VerApuntesActivity
import kotlin.String
import kotlin.Unit

public class Apuntes2Activity : BaseActivity<ActivityApuntes2Binding>(R.layout.activity_apuntes_2) {
  private val viewModel: Apuntes2VM by viewModels<Apuntes2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.apuntes2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.viewRectangle3.setOnClickListener {
      val destIntent = VerApuntesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup.setOnClickListener {
      val destIntent = VerApuntesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    /*binding.viewRectangle19.setOnClickListener {
      val destIntent = FotoSubida1Activity.getIntent(this, null)
      startActivity(destIntent)
    }*/
  }

  public companion object {
    public const val TAG: String = "APUNTES2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Apuntes2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
