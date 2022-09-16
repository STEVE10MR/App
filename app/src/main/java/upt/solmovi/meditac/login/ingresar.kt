package upt.solmovi.meditac.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import upt.solmovi.meditac.R
import upt.solmovi.meditac.databinding.FragmentIngresarBinding


class ingresar : Fragment() {

    private var _binding: FragmentIngresarBinding?=null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIngresarBinding.inflate(inflater,container,false)

        binding.btncrearCuenta.setOnClickListener{view: View->
            view.findNavController().navigate(R.id.action_ingresar_to_crear)
        }
        return binding.root
    }

}