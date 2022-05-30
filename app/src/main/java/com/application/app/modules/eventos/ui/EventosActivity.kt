package com.application.app.modules.eventos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEventosBinding
import com.application.app.modules.eventoaadido.ui.EventoAAdidoActivity
import com.application.app.modules.eventos.`data`.viewmodel.EventosVM
import kotlin.String
import kotlin.Unit

public class EventosActivity : BaseActivity<ActivityEventosBinding>(R.layout.activity_eventos) {
  private val viewModel: EventosVM by viewModels<EventosVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventosVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.viewRectangle3.setOnClickListener {
      val destIntent = EventoAAdidoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "EVENTOS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
