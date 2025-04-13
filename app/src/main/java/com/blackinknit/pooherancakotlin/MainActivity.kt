package com.blackinknit.pooherancakotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var  nomeTextView: TextView
    private lateinit var  dataAdmissaoTextView: TextView
    private lateinit var  salarioTextView: TextView
    private lateinit var  bonificacaoTextView: TextView
    private lateinit var  numeroFuncionariosTextView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            inciciarComponentesLayout();
            criarObjetos();


    /**    lateinit var victor: Funcionario
        victor.setNome("victor")
        victor.setSalario(1200)
        victor.setDataAdmissao("01/02/1197")

        lateinit var gerenteLucas: Gerente
        gerenteLucas.setNome("lucas")
        gerenteLucas.setBonificacao(10.5)
        gerenteLucas.setNumeroFuncionarios(12)

    */

        }



    private fun inciciarComponentesLayout() {
        nomeTextView = findViewById(R.id.nomeTextView)
        dataAdmissaoTextView = findViewById(R.id.dataAdmissaoTextView)
        salarioTextView = findViewById(R.id.salarioTextView)
        bonificacaoTextView = findViewById(R.id.bonificacaoTextView)
        numeroFuncionariosTextView = findViewById(R.id.numeroFuncionariosTextView)
    }

    /**
    private fun criarObjetos() {

        var victor = Funcionario ()
        victor.setNome("victor")
        victor.setDataAdmissao("01/02/1998")
        victor.setSalario(1500)


        nomeTextView.text =


    } */

    private fun criarObjetos() {

        var victor = Funcionario()
        victor.setNome("Victor")
        victor.setDataAdmissao("01/02/1998")
        victor.setSalario(1500)

        var gerenteLucas = Gerente()
        gerenteLucas.setNome("Lucas")
        gerenteLucas.setDataAdmissao("15/03/2005")
        gerenteLucas.setSalario(3000)
        gerenteLucas.setBonificacao(1000.0)
        gerenteLucas.setNumeroFuncionarios(12)

        nomeTextView.text = victor.getNome()
        dataAdmissaoTextView.text = victor.getDataAdmissao()
        salarioTextView.text = victor.getSalario().toString()

        bonificacaoTextView.text = gerenteLucas.getBonificacao().toString()
        numeroFuncionariosTextView.text = gerenteLucas.getNumeroFuncionarios().toString()

    }
}