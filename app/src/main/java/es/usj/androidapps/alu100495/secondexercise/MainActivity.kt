package es.usj.androidapps.alu100495.secondexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.on_create,Toast.LENGTH_SHORT)
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, R.string.on_restart,Toast.LENGTH_SHORT)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, R.string.on_start,Toast.LENGTH_SHORT)
    }
}