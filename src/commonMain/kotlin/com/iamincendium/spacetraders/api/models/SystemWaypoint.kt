package com.iamincendium.spacetraders.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class SystemWaypoint(
    @SerialName("symbol") val symbol: String,
    @SerialName("type") val type: WaypointType,
    @SerialName("x") val x: Int,
    @SerialName("y") val y: Int,
)
