package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.aadirasignatura.ui.AAdirAsignaturaActivity
import com.application.app.modules.ampliar.ui.AmpliarActivity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.apuntes.ui.ApuntesActivity
import com.application.app.modules.apuntes2.ui.Apuntes2Activity
import com.application.app.modules.apuntessubidos.ui.ApuntesSubidosActivity
import com.application.app.modules.calendario.ui.CalendarioActivity
import com.application.app.modules.confirmarlogout.ui.ConfirmarLogoutActivity
import com.application.app.modules.editarevento.ui.EditarEventoActivity
import com.application.app.modules.editarperfil.ui.EditarPerfilActivity
import com.application.app.modules.eliminar.ui.EliminarActivity
import com.application.app.modules.eventoaadido.ui.EventoAAdidoActivity
import com.application.app.modules.eventoeliminadp.ui.EventoEliminadpActivity
import com.application.app.modules.eventomodificado.ui.EventoModificadoActivity
import com.application.app.modules.eventos.ui.EventosActivity
import com.application.app.modules.fotosubida.ui.FotoSubidaActivity
import com.application.app.modules.fotosubida1.ui.FotoSubida1Activity
import com.application.app.modules.login.ui.LoginActivity
import com.application.app.modules.menudesplegable.ui.MenuDesplegableActivity
import com.application.app.modules.ocio.ui.OcioActivity
import com.application.app.modules.perfil.ui.PerfilActivity
import com.application.app.modules.signup.ui.SignUpActivity
import com.application.app.modules.subirfoto.ui.SubirFotoActivity
import com.application.app.modules.verapuntes.ui.VerApuntesActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearEditarPerfil.setOnClickListener {
      val destIntent = EditarPerfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearVerApuntes.setOnClickListener {
      val destIntent = VerApuntesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventoModificado.setOnClickListener {
      val destIntent = EventoModificadoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFotoSubida1.setOnClickListener {
      val destIntent = FotoSubida1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearApuntes.setOnClickListener {
      val destIntent = ApuntesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventoEliminadp.setOnClickListener {
      val destIntent = EventoEliminadpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCalendario.setOnClickListener {
      val destIntent = CalendarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSubirFoto.setOnClickListener {
      val destIntent = SubirFotoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAmpliar.setOnClickListener {
      val destIntent = AmpliarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearApuntes2.setOnClickListener {
      val destIntent = Apuntes2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventos.setOnClickListener {
      val destIntent = EventosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearApuntesSubidos.setOnClickListener {
      val destIntent = ApuntesSubidosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAadirAsignatura.setOnClickListener {
      val destIntent = AAdirAsignaturaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOcio.setOnClickListener {
      val destIntent = OcioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPerfil.setOnClickListener {
      val destIntent = PerfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEliminar.setOnClickListener {
      val destIntent = EliminarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEditarEvento.setOnClickListener {
      val destIntent = EditarEventoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFotoSubida.setOnClickListener {
      val destIntent = FotoSubidaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEventoAadido.setOnClickListener {
      val destIntent = EventoAAdidoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMenuDesplegable.setOnClickListener {
      val destIntent = MenuDesplegableActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConfirmarLogout.setOnClickListener {
      val destIntent = ConfirmarLogoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
