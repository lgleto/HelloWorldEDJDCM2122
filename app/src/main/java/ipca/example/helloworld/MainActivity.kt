package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val textViewHelloWorld : TextView = TextView(this)
        textViewHelloWorld.text = "Hello world!"

        val buttonTranslate = Button(this)
        buttonTranslate.text = "Traduzir"
        buttonTranslate.setOnClickListener {
            textViewHelloWorld.text = "Olá Mundo!"
        }

        val linearLayout = LinearLayout(this)

        linearLayout.addView(textViewHelloWorld)
        linearLayout.addView(buttonTranslate)
        setContentView(linearLayout)
        //setContentView(textViewHelloWorld)
    }
}