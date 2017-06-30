package viewer.teach.yellow.yellowviewer

import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.widget.MediaController
import android.widget.VideoView

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)//设置全屏

        setContentView(R.layout.activity_video)

        val videoView = this.findViewById(R.id.video) as VideoView
        videoView.setMediaController(MediaController(this))
        val uri = Uri.parse("http://120.52.72.23/data1.cache.directory/media/videos/iphone/${intent.getStringExtra("Number")}.mp4")
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

    override fun onResume() {
        if (requestedOrientation != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        }
        super.onResume()
    }
}
