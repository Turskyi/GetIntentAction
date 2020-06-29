package ua.turskyi.getintentaction

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main), View.OnClickListener {

    /**
     * @Description Called when the activity is first created.
     * */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnTime.setOnClickListener(this)
        btnDate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent: Intent

        when (v.id) {
            R.id.btnTime -> {
                intent = Intent("ua.turskyi.intent.action.showtime")
                startActivity(intent)
            }
            R.id.btnDate -> {
                intent = Intent("ua.turskyi.intent.action.showdate")
                startActivity(intent)
            }
        }
    }
}