package com.application.app.modules.calendario.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCalendarioBinding
import com.application.app.modules.calendario.`data`.model.Calendario1RowModel
import com.application.app.modules.calendario.`data`.viewmodel.CalendarioVM
import com.application.app.modules.editarevento.ui.EditarEventoActivity
import com.application.app.modules.eventos.ui.EventosActivity
import com.application.app.modules.ocio.ui.OcioActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CalendarioActivity :
    BaseActivity<ActivityCalendarioBinding>(R.layout.activity_calendario) {
  private val viewModel: CalendarioVM by viewModels<CalendarioVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGridAdapter =
    RecyclerGridAdapter(viewModel.recyclerGridList.value?:mutableListOf())
   // binding.recyclerGrid.adapter = recyclerGridAdapter
    recyclerGridAdapter.setOnItemClickListener(
    object : RecyclerGridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Calendario1RowModel) {
        onClickRecyclerGrid(view, position, item)
      }
    }
    )
    viewModel.recyclerGridList.observe(this) {
      recyclerGridAdapter.updateData(it)
    }
    binding.calendarioVM = viewModel
  }

  public override fun setUpClicks(): Unit {
/*      val destIntent = EditarEventoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtExamen.setOnClickListener {
      val destIntent = EditarEventoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtInterfaces.setOnClickListener {
      val destIntent = EditarEventoActivity.getIntent(this, null)
      startActivity(destIntent)
    }*/
    binding.viewRectangle9.setOnClickListener {
      val destIntent = EventosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup1.setOnClickListener {
      val destIntent = OcioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGrid(
    view: View,
    position: Int,
    item: Calendario1RowModel
  ): Unit {
    when(view.id) {
      R.id.btnFr ->  {
        val destIntent = EditarEventoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "CALENDARIO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CalendarioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
