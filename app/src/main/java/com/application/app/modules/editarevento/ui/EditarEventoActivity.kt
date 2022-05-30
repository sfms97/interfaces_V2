package com.application.app.modules.editarevento.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEditarEventoBinding
import com.application.app.modules.editarevento.`data`.viewmodel.EditarEventoVM
import com.application.app.modules.eventoeliminadp.ui.EventoEliminadpActivity
import com.application.app.modules.eventomodificado.ui.EventoModificadoActivity
import kotlin.String
import kotlin.Unit

public class EditarEventoActivity :
    BaseActivity<ActivityEditarEventoBinding>(R.layout.activity_editar_evento) {
  private val viewModel: EditarEventoVM by viewModels<EditarEventoVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editarEventoVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.viewRectangle3.setOnClickListener {
      val destIntent = EventoModificadoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangle18.setOnClickListener {
      val destIntent = EventoEliminadpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "EDITAR_EVENTO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditarEventoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
