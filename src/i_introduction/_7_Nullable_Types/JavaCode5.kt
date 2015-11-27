package i_introduction._7_Nullable_Types

/**
 * Created by engeng on 11/27/15.
 */
class JavaCode5 {
    fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer?) {
        var personalInfo = client?.personalInfo ?: null
        var email = personalInfo?.email ?: null

        if (personalInfo == null || email == null || message == null) return

        mailer?.sendMessage(email, message)
    }
}