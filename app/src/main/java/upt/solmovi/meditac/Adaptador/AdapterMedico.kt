package upt.solmovi.meditac.Adaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import upt.solmovi.meditac.R
import upt.solmovi.meditac.bd_simu.Medico

class AdapterMedico(val List:ArrayList<Medico>): RecyclerView.Adapter<AdapterMedico.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMedico.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_element,parent,false)
        return ViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem=List[position]

        holder.title.text= currentItem.especialidad
        holder.name.text= currentItem.Nombre
        holder.image.text=currentItem.Nombre

        holder.itemView.findViewById<Button>(R.id.btn_info).setOnClickListener {
            Toast.makeText(it.context,"Click Informaciuon",Toast.LENGTH_SHORT).show()
        }
    }
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView)
    {
        val title : TextView = ItemView.findViewById(R.id.txt_title)
        val name : TextView = ItemView.findViewById(R.id.txt_name)
        val image : TextView = ItemView.findViewById(R.id.txt_name)


    }
}



