package com.iamincendium.spacetraders.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class AcceptedContract(
    @SerialName("agent") val agent: Agent,
    @SerialName("contract") val contract: Contract,
)
