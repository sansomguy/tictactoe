package com.jamber.tictactoe.services

class SessionService {
    companion object {
        private var LoggedIn = false;
        fun isLoggedIn(): Boolean {
            return LoggedIn;
        }

        fun logIn() {
            LoggedIn = true;
        }
    }

}