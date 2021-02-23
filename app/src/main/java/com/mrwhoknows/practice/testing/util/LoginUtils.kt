package com.mrwhoknows.practice.testing.util

object LoginUtils {

    fun isValidUser(
        email: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (email.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty())
            return false

        return password == confirmedPassword
    }
}