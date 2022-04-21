package com.ak.toastytoast.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.ak.toastytoast.R

object Toasty {
    val LENGTH_SHORT = Toast.LENGTH_SHORT
    val LENGTH_LONG = Toast.LENGTH_LONG
    private var lastToast: Toast? = null
    private const val allowQueue = true

    fun success(context: Context, message: String, duration: Int):Toast {
        val currentToast = Toast.makeText(context, "", duration)

        val toastLayout: View =
            (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                .inflate(R.layout.layout_toasty, null)

        toastLayout.background.setTint(ContextCompat.getColor(context, R.color.green))

        val icon = toastLayout.findViewById<ImageView>(R.id.iv_icon)
        val messageTextView = toastLayout.findViewById<TextView>(R.id.tv_message)
        messageTextView.text = message

        currentToast.view = toastLayout
        if (allowQueue) {
            if (lastToast != null) lastToast?.cancel()
            lastToast = currentToast
        }

        return currentToast
    }

    fun error(context: Context, message: String, duration: Int):Toast {
        val currentToast = Toast.makeText(context, "", duration)
        val toastLayout: View =
            (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                .inflate(R.layout.layout_toasty, null)

        toastLayout.background.setTint(ContextCompat.getColor(context, R.color.red))
        val icon = toastLayout.findViewById<ImageView>(R.id.iv_icon)
        val messageTextView = toastLayout.findViewById<TextView>(R.id.tv_message)
        messageTextView.text = message

        currentToast.view = toastLayout
        if (allowQueue) {
            if (lastToast != null) lastToast?.cancel()
            lastToast = currentToast
        }

        return currentToast
    }

    fun warning(context: Context, message: String, duration: Int):Toast {
        val currentToast = Toast.makeText(context, "", duration)
        val toastLayout: View =
            (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                .inflate(R.layout.layout_toasty, null)

        toastLayout.background.setTint(ContextCompat.getColor(context, R.color.yellow))
        val icon = toastLayout.findViewById<ImageView>(R.id.iv_icon)
        val messageTextView = toastLayout.findViewById<TextView>(R.id.tv_message)
        messageTextView.text = message

        currentToast.view = toastLayout
        if (allowQueue) {
            if (lastToast != null) lastToast?.cancel()
            lastToast = currentToast
        }

        return currentToast
    }
}