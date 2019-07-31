package br.com.wisley.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondaryActivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        var tvnome = findViewById<TextView>(R.id.nome)

        val bundle = intent.getBundleExtra("Bundle")
        val nome = bundle.getParcelable<Aluno>("key")

        tvnome.setText(nome.nome.toString())
    }
}

