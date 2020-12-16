package no.overscroller.sampleapp.basic.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import no.overscroller.sampleapp.R

class BasicItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

    // region Properties
    private val textView: TextView = view.findViewById(R.id.text)
    // endregion

    // region View Holder Setup & Bind
    fun bind(item: String) {
        textView.text = item
    }
    // endregion

}