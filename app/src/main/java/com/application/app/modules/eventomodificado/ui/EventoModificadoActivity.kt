package com.application.app.modules.eventomodificado.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEventoModificadoBinding
import com.application.app.modules.eventomodificado.`data`.viewmodel.EventoModificadoVM
import kotlin.String
import kotlin.Unit

public class EventoModificadoActivity :
    BaseActivity<ActivityEventoModificadoBinding>(R.layout.activity_evento_modificado) {
  private val viewModel: EventoModificadoVM by viewModels<EventoModificadoVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventoModificadoVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "EVENTO_MODIFICADO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventoModificadoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
