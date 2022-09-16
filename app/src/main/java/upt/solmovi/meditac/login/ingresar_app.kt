package upt.solmovi.meditac.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import upt.solmovi.meditac.R
import upt.solmovi.meditac.databinding.FragmentIngresarAppBinding


class ingresar_app : Fragment() {

    //private lateinit var binding : FragmentIngresarAppBinding
    private var _binding : FragmentIngresarAppBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIngresarAppBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.txtRegister.setOnClickListener {view: View->
            view.findNavController().navigate(R.id.action_ingresar_app_to_crear_cuenta_01)
        }
        Toast.makeText(context,"Click",Toast.LENGTH_LONG).show()
    }

}



