package com.itesm.covapp.utils

import android.content.Context
import android.content.Intent
import com.itesm.covapp.ui.activities.HomeActivity
import com.itesm.covapp.ui.activities.LogInActivity
import com.itesm.covapp.ui.activities.SignUpActivity
import com.itesm.covapp.ui.activities.WelcomeActivity

object Intents {
    fun goToLogin(context: Context){
        val intent = Intent(context, LogInActivity::class.java)
        context.startActivity(intent)
    }

    fun goToHome(context: Context){
        val intent = Intent(context, HomeActivity::class.java)
        context.startActivity(intent)
    }

    fun goToWelcome(context: Context){
        val intent = Intent(context, WelcomeActivity::class.java)
        context.startActivity(intent)
    }

    fun goToSignUp(context: Context){
        val intent = Intent(context, SignUpActivity::class.java)
    }
}