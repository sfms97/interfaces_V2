package com.application.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLoginBinding
import com.application.app.modules.calendario.ui.CalendarioActivity
import com.application.app.modules.login.`data`.viewmodel.LoginVM
import com.application.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtRegstrate.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangle3.setOnClickListener {
      val destIntent = CalendarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
