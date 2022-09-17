package upt.solmovi.meditac.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import upt.solmovi.meditac.Adaptador.AdapterMedico
import upt.solmovi.meditac.R
import upt.solmovi.meditac.bd_simu.Medico
import upt.solmovi.meditac.bd_simu.Medico_data
import upt.solmovi.meditac.databinding.FragmentHomeAppBinding
import java.lang.Exception


class home_app : Fragment() {
    private var _binding : FragmentHomeAppBinding? = null
    private val binding get() = _binding!!






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeAppBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {

            binding.rvMedicos.layoutManager = LinearLayoutManager(binding.rvMedicos.context)

            val listamedicos = ArrayList<Medico>()


            for (x in Medico_data.GetList())
            {
                listamedicos.add(x)
            }

            val adapterMedico = AdapterMedico(listamedicos)
            binding.rvMedicos.adapter=adapterMedico
            binding.rvMedicos.get(1).context

        }
        catch (ex:Exception)
        {
            Toast.makeText(context,"Erro al mostrar datos",Toast.LENGTH_SHORT).show()
        }

    }


}