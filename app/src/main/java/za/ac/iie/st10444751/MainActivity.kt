package za.ac.iie.st10444751

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageInput: EditText = findViewById(R.id.ageInput)
        val matchButton: Button = findViewById(R.id.match)
        val clearButton: Button = findViewById(R.id.clearButton)

        matchButton.setOnClickListener {
            Log.d("MainActivity", "Starting ResultActivity.kt")
            val ageText = ageInput.text.toString().trim()
            if (ageText.isNotEmpty() && ageText.toIntOrNull() != null) {
                val age = ageText.toInt()
                if (age in 20..100) {
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("age", age)
                    startActivity(intent)
                } else {
                    showToast("Enter an age between 20 and 100.")
                }
            } else {
                showToast("Please enter a valid age.")
            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}