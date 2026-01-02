package com.antinna.lethelpsms

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class SmsFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        // TODO: Handle FCM message.
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // TODO: Send token to server.
    }
}