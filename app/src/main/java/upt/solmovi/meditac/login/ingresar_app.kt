package upt.solmovi.meditac.login

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigator
import upt.solmovi.meditac.R
import upt.solmovi.meditac.bd_simu.user_data
import upt.solmovi.meditac.databinding.FragmentIngresarAppBinding
import java.lang.Exception


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
        try {
            binding.btnIniciar.setOnClickListener {view: View->

                val email = binding.txtEmailLogin.text
                val password = binding.txtContrasena.text
                val idUser=getUserId(email.toString(),password.toString())
                if(idUser != null) {view.findNavController()
                    .navigate(ingresar_appDirections.actionIngresarFragmentToHomeApp2(idUser))}
                else {Toast.makeText(context,"Usuario no encontrado",Toast.LENGTH_LONG).show()}
            }
        }
        catch (ex:Exception)
        {
            Toast.makeText(context,"Error al obtener datos",Toast.LENGTH_LONG)
        }
    }
    private fun getUserId(gmail:String,password:String): Int? {
        return user_data.GetUserId(gmail,password)
    }
    fun getString(txt:TextView?): String {
        if(txt == null) return ""
        return txt.toString()
    }
}

