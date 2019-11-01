package ua.turskyi.getintentaction

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity(), View.OnClickListener {

    /**
     * @Description Called when the activity is first created.
     * */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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