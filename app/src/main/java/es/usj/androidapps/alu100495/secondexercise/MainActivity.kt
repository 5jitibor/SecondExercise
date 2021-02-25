package es.usj.androidapps.alu100495.secondexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="LIFECYCLE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.on_create,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, R.string.on_restart,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onRestart")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, R.string.on_start,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, R.string.on_resume,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, R.string.on_pause,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, R.string.on_stop,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, R.string.on_destroy,Toast.LENGTH_SHORT).show()
        Log.v(TAG,"onDestroy")
    }
}