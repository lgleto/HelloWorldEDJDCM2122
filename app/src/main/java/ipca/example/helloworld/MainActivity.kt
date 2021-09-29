package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        val buttonTranslate = findViewById<Button>(R.id.buttonTranslate)
        buttonTranslate.setOnClickListener {
            val dateNow = Date()

            textViewHelloWorld.text = dateNow.timeString()
        }

    }
}

fun Date.timeString() : String  {
    val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return sdf.format(this)
}
