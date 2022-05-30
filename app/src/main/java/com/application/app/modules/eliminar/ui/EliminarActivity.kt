package com.application.app.modules.eliminar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEliminarBinding
import com.application.app.modules.eliminar.`data`.viewmodel.EliminarVM
import com.application.app.modules.eventoeliminadp.ui.EventoEliminadpActivity
import kotlin.String
import kotlin.Unit

public class EliminarActivity : BaseActivity<ActivityEliminarBinding>(R.layout.activity_eliminar) {
  private val viewModel: EliminarVM by viewModels<EliminarVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eliminarVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtS.setOnClickListener {
      val destIntent = EventoEliminadpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "ELIMINAR_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EliminarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
