package upt.solmovi.meditac.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import upt.solmovi.meditac.R
import upt.solmovi.meditac.databinding.FragmentCrearCuentaAppBinding
import upt.solmovi.meditac.databinding.FragmentIngresarAppBinding
import java.lang.Exception


class crear_cuenta_app : Fragment() {


    private var _binding : FragmentCrearCuentaAppBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCrearCuentaAppBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.txtLogin.setOnClickListener {view: View->
            view.findNavController().navigate(R.id.action_crear_cuenta_app_to_ingresar_app02)
        }
        try {
            binding.btnCrear.setOnClickListener {view: View->

                val email = binding.txtEmail.text
                val password = binding.txtPassword.text
                val firstname = binding.txtFirtsname.text
                val lastname = binding.txtLastname.text

                if(setUser(email.toString(),password.toString(),firstname.toString(),lastname.toString())) {

                    view.findNavController()
                    .navigate(R.id.action_crear_cuenta_app_to_ingresar_app02)

                    Toast.makeText(context,"Usuario Registrado",Toast.LENGTH_LONG).show()
                    }



                else {Toast.makeText(context,"Usuario no Registrado",Toast.LENGTH_LONG).show()}
            }
        }
        catch (ex: Exception)
        {
            Toast.makeText(context,"Error al obtener datos",Toast.LENGTH_LONG)
        }
    }

    private fun setUser(email: String, password: String, lastname: String, firstname: String): Boolean {
        if(email == "" || password == ""|| lastname == ""|| firstname == "") return false
        return true
    }


}


