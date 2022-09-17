package upt.solmovi.meditac.bd_simu

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


    )
    fun GetUserId(gmail:String,password:String): Int {
        for(userdata in user_data.usuarioList)
        {
            if((userdata.gmail == gmail) && (userdata.contrasenia == password))
            {
                return userdata.id
            }
        }
        return 0
    }
}