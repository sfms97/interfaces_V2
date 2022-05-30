package com.application.app.modules.editarperfil.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowEditarPerfil1Binding
import com.application.app.modules.editarperfil.`data`.model.EditarPerfil1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerEditarPerfilAdapter(
  public var list: List<EditarPerfil1RowModel>
) : RecyclerView.Adapter<RecyclerEditarPerfilAdapter.RowEditarPerfil1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEditarPerfil1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_editar_perfil1,parent,false)
    return RowEditarPerfil1VH(view)
  }

  public override fun onBindViewHolder(holder: RowEditarPerfil1VH, position: Int): Unit {
    val editarPerfil1RowModel = EditarPerfil1RowModel()
    // TODO uncomment following line after integration with data source
    // val editarPerfil1RowModel = list[position]
    holder.binding.editarPerfil1RowModel = editarPerfil1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EditarPerfil1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: EditarPerfil1RowModel
    ): Unit {
    }
  }

  public inner class RowEditarPerfil1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowEditarPerfil1Binding = RowEditarPerfil1Binding.bind(itemView)
  }
}
