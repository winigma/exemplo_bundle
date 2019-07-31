package br.com.wisley.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = MainFragment()

        // Get the support fragment manager instance
        val manager = supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        // Replace the fragment on container
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)

        // Finishing the transition
        transaction.commit()


        /*val intent = Intent(this, SecondaryActivity::class.java)
        val bundle = Bundle()
        val parcel = Aluno("Wisley Souza")


        bundle.putParcelable("key", parcel)
        intent.putExtra("Bundle", bundle)

        startActivity(intent)*/



    }
}
