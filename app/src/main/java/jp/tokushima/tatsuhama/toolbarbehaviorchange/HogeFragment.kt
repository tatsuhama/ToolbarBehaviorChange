package jp.tokushima.tatsuhama.toolbarbehaviorchange


import android.support.v7.widget.RecyclerView
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class HogeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_hoge, container, false)
        val recyclerView = view.findViewById(R.id.recycler_view) as RecyclerView
        val items = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
        recyclerView.adapter = HogeAdapter(items)
        return view
    }

    class HogeAdapter(private val items: List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
            if (holder is HogeViewHolder) {
                holder.bind(items[position])
            }
        }

        override fun getItemCount(): Int = items.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = HogeViewHolder(parent)

    }

    private class HogeViewHolder(parent: ViewGroup)
        : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)) {

        fun bind(text: String) {
            (itemView.findViewById(R.id.item_text) as TextView).text = text
        }
    }
}