package com.example.individual6m5

import android.service.quicksettings.Tile
import java.time.LocalDate
enum class transacciones{
    Despositó, Retiró, Fallido
}
class Transacción{
    private var tipoTransacción: transacciones
    private var monto:Double
    private var horario:LocalDate

    constructor(tipoTransacción: transacciones, monto:Double)  {
        this.tipoTransacción=tipoTransacción
        horario=LocalDate.now()
        when(tipoTransacción){
            transacciones.Retiró->this.monto=monto*-1
            transacciones.Fallido->this.monto=0.0
            else->this.monto = monto
        }

    }
    fun mostrarDatos(){
        println("$horario - $tipoTransacción $monto")
    }
}
