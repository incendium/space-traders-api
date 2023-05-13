package com.iamincendium.spacetraders.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class SellCargoRequest(
    @SerialName("symbol") val symbol: String,
    @SerialName("units") val units: Int,
)
