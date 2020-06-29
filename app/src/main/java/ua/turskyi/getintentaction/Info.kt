package ua.turskyi.getintentaction

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.sql.Date
import java.text.SimpleDateFormat
import java.util.*

class Info : AppCompatActivity(R.layout.info) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // получаем Intent, который вызывал это Activity
        val intent = intent
        // читаем из него action
        val action = intent.action

        var format = ""
        var textInfo = ""

        // в зависимости от action заполняем переменные
        if (action == "ua.turskyi.intent.action.showtime") {
            format = "HH:mm:ss"
            textInfo = "Time: "
        } else if (action == "ua.turskyi.intent.action.showdate") {
            format = "dd.MM.yyyy"
            textInfo = "Date: "
        }

        // в зависимости от содержимого переменной format
        // получаем дату или время в переменную datetime
        val sdf = SimpleDateFormat(format, Locale.getDefault())
        val datetime = sdf.format(Date(System.currentTimeMillis()))

        val tvDate = findViewById<TextView>(R.id.tvInfo)
        tvDate.text = applicationContext.getString(R.string.info_messages, textInfo, datetime)
    }
}