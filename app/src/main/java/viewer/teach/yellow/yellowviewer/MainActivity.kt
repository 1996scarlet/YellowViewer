package viewer.teach.yellow.yellowviewer

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val time = Time()
//        time.setToNow()
 //       val editor = EditText(this)
//        AlertDialog.Builder(this).setTitle("今天的密码：（加群678478321）")
//                .setView(editor).setCancelable(false)
//                .setPositiveButton("确定", { _, _ ->
//                    if (editor.text.toString() == ((time.monthDay * 48 + 2) * 1996 - 2017).toString()) {
//
//                    } else {
//                        super.onBackPressed()
//                    }
//                }).show()

//        val editText = findViewById(R.id.editNumber) as EditText

        sendNumber.setOnClickListener {
            val intent = Intent(this@MainActivity, VideoActivity::class.java)
            intent.putExtra("Number", editNumber.text.toString())
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val i = Intent(Intent.ACTION_MAIN)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        i.addCategory(Intent.CATEGORY_HOME)
        startActivity(i)
    }
}
