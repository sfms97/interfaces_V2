package com.application.app.modules.eventoeliminadp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEventoEliminadpBinding
import com.application.app.modules.eventoeliminadp.`data`.viewmodel.EventoEliminadpVM
import kotlin.String
import kotlin.Unit

public class EventoEliminadpActivity :
    BaseActivity<ActivityEventoEliminadpBinding>(R.layout.activity_evento_eliminadp) {
  private val viewModel: EventoEliminadpVM by viewModels<EventoEliminadpVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eventoEliminadpVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "EVENTO_ELIMINADP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EventoEliminadpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
