package com.application.app.modules.menudesplegable.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityMenuDesplegableBinding
import com.application.app.modules.apuntessubidos.ui.ApuntesSubidosActivity
import com.application.app.modules.menudesplegable.`data`.viewmodel.MenuDesplegableVM
import kotlin.String
import kotlin.Unit

public class MenuDesplegableActivity :
    BaseActivity<ActivityMenuDesplegableBinding>(R.layout.activity_menu_desplegable) {
  private val viewModel: MenuDesplegableVM by viewModels<MenuDesplegableVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuDesplegableVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtSubirApuntes1.setOnClickListener {
      val destIntent = ApuntesSubidosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "MENU_DESPLEGABLE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuDesplegableActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
