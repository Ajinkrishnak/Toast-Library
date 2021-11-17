package com.ak.toastytoast

import android.content.Context
import android.widget.Toast

object SuccessToast {
    fun toast(context:Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}