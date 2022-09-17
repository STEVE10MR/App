package upt.solmovi.meditac.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import upt.solmovi.meditac.R
import upt.solmovi.meditac.databinding.FragmentIngresarAppBinding
import upt.solmovi.meditac.databinding.FragmentPerfilMedicoBinding


class perfil_medico : Fragment() {


    private var _binding : FragmentPerfilMedicoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPerfilMedicoBinding.inflate(inflater,container,false)


        val args = perfil_medicoArgs.fromBundle(requireArguments())

        binding.txtSetTitle.text = args.titulo
        binding.txtSetNombre.text = args.nombre
        binding.txtSetApellidos.text = args.apellidos
        binding.txtSetDescripcion.text = args.descripcion
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /*
        binding.txtRegister.setOnClickListener {view: View->
            view.findNavController().navigate(R.id.action_ingresar_app_to_crear_cuenta_01)
        }
        Toast.makeText(context,"Click", Toast.LENGTH_LONG).show()
        */

    }
}