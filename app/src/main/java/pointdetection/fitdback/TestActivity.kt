package pointdetection.fitdback

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.widget.Button
import com.pointdetection.fitdback.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE) // 이것도 안됨
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        // btnFitnessStart 버튼을 클릭하여 CameraActivity 실행
        val fitnessStartBtn = findViewById<Button>(R.id.btnFitnessStart)
        fitnessStartBtn.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }
}