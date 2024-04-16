package za.ac.iie.st10444751

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val age = intent.getIntExtra("age", 0)

        // Access the textView using findViewById or synthetic binding
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = findMatchedFigures(age).joinToString(", ")
    }

    private fun findMatchedFigures(age: Int): List<String> {
        // Define historical figures with their ages at death
        val figures = mapOf(
            "Henry The Young King" to 20,
            "Lady Jane Grey" to 21,
            "Percy Bysshe Shelley" to 22,
            "Pocahontas" to 23,
            "Ralph Steiman" to 24,
            "Sylvia Plath" to 25,
            "Alexander IV" to 26,
            "Kurt Cobain" to 27,
            "John Keats" to 28,
            "Li Bai" to 29,
            "Steve Biko" to 30,
            "Franz Schubert" to 31,
            "Alexander the Great" to 32,
            "Jesus Christ" to 33,
            "Marcus Aurelius" to 34,
            "Mozart" to 35,
            "Princess Diana" to 36,
            "Rosalind Franklin" to 37,
            "George Orwell" to 38,
            "Martin Luther King" to 39,
            "Attila the Hun" to 40,
            "Napoleon Bonaparte" to 41,
            "Mary I of England" to 42,
            "Edward II of England" to 43,
            "Pablo Escobar" to 44,
            "Freddy Mercury" to 45,
            "John F Kennedy" to 46,
            "Grigori Pasputin" to 47,
            "Virgin Mary" to 48,
            "Alexander Hamilton" to 49,
            "Sergei Einstein" to 50,
            "John Smith" to 51,
            "William Shakespeare" to 52,
            "James K Park" to 53,
            "Elliot Ness" to 54,
            "Julius Ceasar" to 55,
            "Abraham Lincoln" to 56,
            "Amerigo Vespucci" to 57,
            "Niccolo Machaveli" to 58,
            "William the Conquerer" to 59,
            "Theodore Roosevelt" to 60,
            "Ernest Hemingway" to 61,
            "Aristole" to 62,
            "Francisco Pizarro" to 63,
            "Karl Marx" to 64,
            "Walt Disney" to 65,
            "Marie Curie" to 66,
            "Leonardo da Vinci" to 67,
            "Edward I of England" to 68,
            "Elizabeth I" to 69,
            "Howard Hughes" to 70,
            "Princess Margaret" to 71,
            "Confucius" to 72,
            "Charles Darwin" to 73,
            "Joseph Stalin" to 74,
            "Pythagoras" to 75,
            "Albert Einstein" to 76,
            "Galileo" to 77,
            "Mahatma Gandhi" to 78,
            "Ho Chi Minh" to 79,
            "Kofi Annan" to 80,
            "Joan Rivers" to 81,
            "Nell Armstrong" to 82,
            "J.Paul Getty" to 83,
            "Maria Caldero" to 84,
            "Thomas Carlyle" to 85,
            "John Forbes Nash Jr" to 86,
            "Mother Theresa" to 87,
            "Harry Truman" to 88,
            "Harper Lee" to 89,
            "Winston Churchill" to 90,
            "Pablo Picasso" to 91,
            "Rosa Parks" to 92,
            "Gerald Ford" to 93,
            "George Bernard Shaw" to 94,
            "Nelson Mandela" to 95,
            "Elizabeth II" to 96,
            "John Darwin Rockefeller" to 97,
            "Cleopatra" to 98,
            "Prince Phillip" to 99,
            "Storm Thurmond" to 100
            // Add more historical figures as needed
        )

        // Find figures with the same age as input age
        return figures.filterValues { it == age }.keys.toList()
    }
}







