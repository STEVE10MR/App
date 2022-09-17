package upt.solmovi.meditac.bd_simu

import android.util.Log


object Medico_data {
    val medicosList = listOf(
        Medico(
            id = 1,
            Nombre = "Rafael Patricio",
            apellido ="Valdez Piedra",
            especialidad = "Medicina General",
            sexo = "Hombre",
            edad = 45,
            descripcion = "Un medico comprometivo con su trabajo, ademas de ser uno de los mejores medicos en su especialidad a nivel nacional.",
            medicoImageUrl =  "https://media.traveler.es/photos/613760adcb06ad0f20e11980/master/w_1280,c_limit/202931.jpg"

        ),
        Medico(
            id = 2,
            Nombre = "Marlen Fiorella",
            apellido ="Ticona Flores",
            especialidad = "Psicologia",
            sexo = "Mujer",
            edad = 32,
            descripcion = "Un medico comprometivo con su trabajo, ademas de ser uno de los mejores medicos en su especialidad a nivel nacional.",
            medicoImageUrl =  "https://i.ibb.co/y0MxrYv/mg.jpg"
        ),
        Medico(
            id = 3,
            Nombre = "Maricarmen Marin",
            apellido ="Choque Cama",
            especialidad = "Psicologia",
            sexo = "Mujer",
            edad = 33,
            descripcion = "Un medico comprometivo con su trabajo, ademas de ser uno de los mejores medicos en su especialidad a nivel nacional.",
            medicoImageUrl =  "https://i.ibb.co/y0MxrYv/mg.jpg"
        ),
        Medico(
            id = 4,
            Nombre = "Raquel Maria",
            apellido ="Vela Otoño",
            especialidad = "Psicologia",
            sexo = "Mujer",
            edad = 32,
            descripcion = "Un medico comprometivo con su trabajo, ademas de ser uno de los mejores medicos en su especialidad a nivel nacional.",
            medicoImageUrl =  "https://i.ibb.co/y0MxrYv/mg.jpg"
        ),
        Medico(
            id = 5,
            Nombre = "Federico Ralon",
            apellido ="Ramos Vargas",
            especialidad = "Medicina General",
            sexo = "Hombre",
            edad = 44,
            descripcion = "Un medico comprometivo con su trabajo, ademas de ser uno de los mejores medicos en su especialidad a nivel nacional.",
            medicoImageUrl =  "https://media.traveler.es/photos/613760adcb06ad0f20e11980/master/w_1280,c_limit/202931.jpg"
        ),
        Medico(
            id = 6,
            Nombre = "Watson Jakson",
            apellido ="Toledo Soto",
            especialidad = "Medicina General",
            sexo = "Hombre",
            edad = 47,
            descripcion = "Un medico comprometivo con su trabajo, ademas de ser uno de los mejores medicos en su especialidad a nivel nacional.",
            medicoImageUrl =  "https://media.traveler.es/photos/613760adcb06ad0f20e11980/master/w_1280,c_limit/202931.jpg"
        ),

        )

    fun GetList(): List<Medico> {

        return medicosList
    }
}