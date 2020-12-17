package no.overscroller.sampleapp.basic.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import no.overscroller.sampleapp.R
import no.overscroller.sampleapp.util.asAnimalResource

class BasicItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

    // region Properties
    private val textView: TextView = view.findViewById(R.id.text)
    private val imageView: ImageView = view.findViewById(R.id.image)
    // endregion

    // region View Holder Setup & Bind
    fun bind(item: String) {
        textView.text = item
        imageView.setImageResource(item.asAnimalResource())
    }
    // endregion

}