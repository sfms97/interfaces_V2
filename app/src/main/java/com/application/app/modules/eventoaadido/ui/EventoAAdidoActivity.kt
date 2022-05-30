package com.application.app.modules.eventoaadido.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEventoAAdidoBinding
import com.application.app.modules.eventoaadido.`data`.viewmodel.EventoAAdidoVM
import kotlin.String
import kotlin.Unit

public class EventoAAdidoActivity :
    BaseActivity<ActivityEventoAAdidoBinding>(R.layout.activity_evento_a_adido) {
  private val viewModel: EventoAAdidoVM by viewModels<EventoAAdidoVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventoAAdidoVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "EVENTO_A_ADIDO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventoAAdidoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
