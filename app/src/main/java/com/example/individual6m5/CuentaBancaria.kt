package com.example.individual6m5
class noFundsException(message:String):Exception(message)
class CuentaBancaria {
    private var nombreCuenta:String
    private var saldoDisponible:Double
    private var historial:ArrayList<Transacción>
    constructor(nombreCuenta:String, saldoDisponible:Double){
        this.nombreCuenta= nombreCuenta
        if(saldoDisponible<0){
            this.saldoDisponible =0.0;

        }else{
            this.saldoDisponible = saldoDisponible
        }
        this.historial= arrayListOf()
    }
    fun deposito(deposito:Double){

        var transc: Transacción=Transacción(transacciones.Despositó,deposito)
        if(deposito<=0){
            transc=Transacción(transacciones.Fallido,deposito)
            historial.add(transc)
        }else{
            this.saldoDisponible+=deposito
            historial.add(transc)
        }

    }
    fun retiro(retiro:Double){
        var transc: Transacción=Transacción(transacciones.Retiró,retiro)
        if(retiro<=0){
            transc=Transacción(transacciones.Fallido,retiro)
            historial.add(transc)

        }else if(retiro>saldoDisponible){
            transc=Transacción(transacciones.Fallido,retiro)
            historial.add(transc)
        }else{
            this.saldoDisponible-=retiro
            historial.add(transc)
        }


    }
    fun mostrarSaldo(){
        println("Saldo: $saldoDisponible")
    }
    fun mostrarHistorial(){
        println("Historial: " )
        for (transacción in this.historial) {
            print("\t$nombreCuenta ")
            transacción.mostrarDatos()
        }
    }

    override fun toString(): String {
        return nombreCuenta
    }
}