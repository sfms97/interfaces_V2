package com.application.app.modules.calendario.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowCalendario1Binding
import com.application.app.modules.calendario.`data`.model.Calendario1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGridAdapter(
  public var list: List<Calendario1RowModel>
) : RecyclerView.Adapter<RecyclerGridAdapter.RowCalendario1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCalendario1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_calendario1,parent,false)
    return RowCalendario1VH(view)
  }

  public override fun onBindViewHolder(holder: RowCalendario1VH, position: Int): Unit {
    val calendario1RowModel = Calendario1RowModel()
    // TODO uncomment following line after integration with data source
    // val calendario1RowModel = list[position]
    holder.binding.calendario1RowModel = calendario1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Calendario1RowModel>): Unit {
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
      item: Calendario1RowModel
    ): Unit {
    }
  }

  public inner class RowCalendario1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCalendario1Binding = RowCalendario1Binding.bind(itemView)
    init {
      binding.btnFr.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Calendario1RowModel())
      }
    }
  }
}
