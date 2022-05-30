package com.application.app.modules.confirmarlogout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityConfirmarLogoutBinding
import com.application.app.modules.confirmarlogout.`data`.viewmodel.ConfirmarLogoutVM
import com.application.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

public class ConfirmarLogoutActivity :
    BaseActivity<ActivityConfirmarLogoutBinding>(R.layout.activity_confirmar_logout) {
  private val viewModel: ConfirmarLogoutVM by viewModels<ConfirmarLogoutVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.confirmarLogoutVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtS.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "CONFIRMAR_LOGOUT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConfirmarLogoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
