package viewer.teach.yellow.yellowviewer

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.editNumber) as EditText

        findViewById(R.id.sendNumber).setOnClickListener {
            val intent = Intent(this@MainActivity, VideoActivity::class.java)
            intent.putExtra("Number", editText.text.toString())
            startActivity(intent)
        }
    }
}
