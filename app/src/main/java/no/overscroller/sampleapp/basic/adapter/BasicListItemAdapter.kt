package no.overscroller.sampleapp.basic.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import no.overscroller.sampleapp.R
import no.overscroller.sampleapp.basic.viewholder.BasicItemViewHolder

class BasicListItemAdapter(private val items: List<String>) : RecyclerView.Adapter<BasicItemViewHolder>() {

    // region Holder Creation
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BasicItemViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.row_item_basic,
            parent,
            false
        )
    )
    // endregion

    // region Binding
    override fun onBindViewHolder(holder: BasicItemViewHolder, position: Int) {
        holder.bind(items[position])
    }
    // endregion

    // region Miscellaneous
    override fun getItemCount(): Int = items.count()
    // endregion

}