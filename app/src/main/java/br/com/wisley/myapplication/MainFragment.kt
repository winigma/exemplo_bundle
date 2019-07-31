package br.com.wisley.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val intent = Intent(activity, SecondaryActivity::class.java)
        val bundle = Bundle()
        val parcel = Aluno("Wisley Souza")


        bundle.putParcelable("key", parcel)
        intent.putExtra("Bundle", bundle)

        startActivity(intent)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}