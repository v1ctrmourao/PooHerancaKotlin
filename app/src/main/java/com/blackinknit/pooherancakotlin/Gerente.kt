package com.blackinknit.pooherancakotlin

class Gerente : Funcionario() {
    private var bonificacao: Double? = null
    private var numeroFuncionarios: Int? = null

    fun getBonificacao(): Double? {
        return bonificacao
    }
    fun setBonificacao(bonificacao: Double) {
        this.bonificacao = bonificacao
    }
    fun getNumeroFuncionarios(): Int? {
        return numeroFuncionarios
    }
    fun setNumeroFuncionarios(numeroFuncionarios: Int) {
        this.numeroFuncionarios = numeroFuncionarios
    }
}