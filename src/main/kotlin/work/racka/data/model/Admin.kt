package work.racka.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Admin(
    val email: String,
    val username: String,
    val hashPassword: String
)