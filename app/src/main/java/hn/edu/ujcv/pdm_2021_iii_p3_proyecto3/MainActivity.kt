package hn.edu.ujcv.pdm_2021_iii_p3_proyecto3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val toolbar: Toolbar = findViewById(R.id.toolbar)
        //setSupportActionBar(toolbar)
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_ingresar.setOnClickListener { login() }

    }

    fun login(){
        if(txt_usuario.text.toString()=="Delivery" && txt_contrasena.text.toString()=="12345"){
            principal()
        }else{
            Toast.makeText(applicationContext,"Usuario o Contraseña Incorrectos",Toast.LENGTH_SHORT).show()
        }
    }

    fun principal(){
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}