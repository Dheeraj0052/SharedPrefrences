package app.dheeraj.sharedprefrences

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedprefrences= getSharedPreferences("myrefrences",Context.MODE_PRIVATE)
        val retrivedtext=sharedprefrences.getString("name","")
        edittext.setText(retrivedtext)

        bttn.setOnClickListener(){
            val input=edittext.text.toString()

            val editor =sharedprefrences.edit()
            editor.putString("name",input)
            editor.apply()

        }
    }
}
