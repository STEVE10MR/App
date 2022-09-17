package upt.solmovi.meditac.bd_simu

import android.util.Log
import android.widget.Toast

object user_data {
    val usuarioList = listOf(
        usuario(
            id = 1,
            Nombre = "Rafael Patricio",
            apellido ="Valdez Piedra",
            gmail="rafvalde@gmail.com",
            contrasenia="upt2022",
            medicoImageUrl =  "https://i.imgur.com/xN839kU.png"
        ),
        usuario(
            id = 2,
            Nombre = "Steve",
            apellido ="PP",
            gmail="test@gmail.com",
            contrasenia="123",
            medicoImageUrl =  "https://i.imgur.com/xN839kU.png"
        ),


    )
    fun GetUserId(gmail:String,password:String): Int? {
        for(userdata in user_data.usuarioList)
        {
            if((userdata.gmail == gmail) && (userdata.contrasenia == password))
            {
                Log.w("<------------------->","${userdata.Nombre}")
                return userdata.id
            }
        }
        return null
    }
    fun GetInfoUser(id:Int): ArrayList<String>? {
        for(userdata in user_data.usuarioList)
        {
            if((userdata.id == id))
            {
                return arrayListOf<String>()
            }
        }
        return null
    }

}