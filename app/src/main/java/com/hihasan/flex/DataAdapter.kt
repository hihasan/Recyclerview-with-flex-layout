package com.hihasan.flex

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import java.util.ArrayList

class DataAdapter(private val dataModel: ArrayList<DataModel>, private var context: Context) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val menuAdapter = inflater.inflate(R.layout.single_data_view, parent, false)
        val viewHolder = ViewHolder(menuAdapter)
        context = parent.context
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv.text = dataModel[position].name
    }

    override fun getItemCount(): Int {
        return dataModel.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv: AppCompatTextView

        init {
            tv = itemView.findViewById(R.id.tv)
        }
    }
}