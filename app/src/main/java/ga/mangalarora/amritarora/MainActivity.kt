package ga.mangalarora.amritarora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onBackPressed() {
          finish()
        super.onBackPressed()
    }

    fun startActivity(view: View?){

        startActivity(Intent(applicationContext,NewActivity::class.java))
    }
}
