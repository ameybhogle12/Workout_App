package amey.bhogle.workoutapp

import amey.bhogle.workoutapp.databinding.ActivityMainBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //val flStartButton: FrameLayout = findViewById(R.id.flStart)
        binding?.flStart?.setOnClickListener{

            val intent = Intent(this, ExcersiseActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}