package com.example.individual6m5

fun main() {

    var cuentaH: CuentaBancaria = CuentaBancaria("Hernan", 200000.0)
    println(cuentaH)
    cuentaH.mostrarSaldo()
    cuentaH.deposito(30000.0)
    cuentaH.retiro(-3000.0)
    cuentaH.retiro(2500.0)
    cuentaH.deposito(400000.0)
    cuentaH.retiro(250000.0)
    cuentaH.mostrarHistorial()
    cuentaH.mostrarSaldo()


    var cuentaD: CuentaBancaria = CuentaBancaria("Daniela", 3080000.0)
    println(cuentaD)
    cuentaD.mostrarSaldo()
    cuentaD.deposito(130000.0)
    cuentaD.retiro(40000.0)
    cuentaD.retiro(250000.0)
    cuentaD.deposito(4600000.0)
    cuentaD.retiro(2500000.0)
    cuentaD.mostrarHistorial()
    cuentaD.mostrarSaldo()

    var cuentaF: CuentaBancaria = CuentaBancaria("Fernanda", 72000.0)
    println(cuentaF)
    cuentaF.mostrarSaldo()
    cuentaF.deposito(2000.0)
    cuentaF.retiro(40000.0)
    cuentaF.retiro(8000.0)
    cuentaF.deposito(600000.0)
    cuentaF.retiro(250000.0)
    cuentaF.mostrarHistorial()
    cuentaF.mostrarSaldo()
}