package com.iamincendium.spacetraders.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class WaypointTrait(
    @SerialName("symbol") val symbol: Symbol,
    @SerialName("name") val name: String,
    @SerialName("description") val description: String,
) {
    @Serializable
    public enum class Symbol {
        @SerialName("UNCHARTED") UNCHARTED,
        @SerialName("MARKETPLACE") MARKETPLACE,
        @SerialName("SHIPYARD") SHIPYARD,
        @SerialName("OUTPOST") OUTPOST,
        @SerialName("SCATTERED_SETTLEMENTS") SCATTERED_SETTLEMENTS,
        @SerialName("SPRAWLING_CITIES") SPRAWLING_CITIES,
        @SerialName("MEGA_STRUCTURES") MEGA_STRUCTURES,
        @SerialName("OVERCROWDED") OVERCROWDED,
        @SerialName("HIGH_TECH") HIGH_TECH,
        @SerialName("CORRUPT") CORRUPT,
        @SerialName("BUREAUCRATIC") BUREAUCRATIC,
        @SerialName("TRADING_HUB") TRADING_HUB,
        @SerialName("INDUSTRIAL") INDUSTRIAL,
        @SerialName("BLACK_MARKET") BLACK_MARKET,
        @SerialName("RESEARCH_FACILITY") RESEARCH_FACILITY,
        @SerialName("MILITARY_BASE") MILITARY_BASE,
        @SerialName("SURVEILLANCE_OUTPOST") SURVEILLANCE_OUTPOST,
        @SerialName("EXPLORATION_OUTPOST") EXPLORATION_OUTPOST,
        @SerialName("MINERAL_DEPOSITS") MINERAL_DEPOSITS,
        @SerialName("COMMON_METAL_DEPOSITS") COMMON_METAL_DEPOSITS,
        @SerialName("PRECIOUS_METAL_DEPOSITS") PRECIOUS_METAL_DEPOSITS,
        @SerialName("RARE_METAL_DEPOSITS") RARE_METAL_DEPOSITS,
        @SerialName("METHANE_POOLS") METHANE_POOLS,
        @SerialName("ICE_CRYSTALS") ICE_CRYSTALS,
        @SerialName("EXPLOSIVE_GASES") EXPLOSIVE_GASES,
        @SerialName("STRONG_MAGNETOSPHERE") STRONG_MAGNETOSPHERE,
        @SerialName("VIBRANT_AURORAS") VIBRANT_AURORAS,
        @SerialName("SALT_FLATS") SALT_FLATS,
        @SerialName("CANYONS") CANYONS,
        @SerialName("PERPETUAL_DAYLIGHT") PERPETUAL_DAYLIGHT,
        @SerialName("PERPETUAL_OVERCAST") PERPETUAL_OVERCAST,
        @SerialName("DRY_SEABEDS") DRY_SEABEDS,
        @SerialName("MAGMA_SEAS") MAGMA_SEAS,
        @SerialName("SUPERVOLCANOES") SUPERVOLCANOES,
        @SerialName("ASH_CLOUDS") ASH_CLOUDS,
        @SerialName("VAST_RUINS") VAST_RUINS,
        @SerialName("MUTATED_FLORA") MUTATED_FLORA,
        @SerialName("TERRAFORMED") TERRAFORMED,
        @SerialName("EXTREME_TEMPERATURES") EXTREME_TEMPERATURES,
        @SerialName("EXTREME_PRESSURE") EXTREME_PRESSURE,
        @SerialName("DIVERSE_LIFE") DIVERSE_LIFE,
        @SerialName("SCARCE_LIFE") SCARCE_LIFE,
        @SerialName("FOSSILS") FOSSILS,
        @SerialName("WEAK_GRAVITY") WEAK_GRAVITY,
        @SerialName("STRONG_GRAVITY") STRONG_GRAVITY,
        @SerialName("CRUSHING_GRAVITY") CRUSHING_GRAVITY,
        @SerialName("TOXIC_ATMOSPHERE") TOXIC_ATMOSPHERE,
        @SerialName("CORROSIVE_ATMOSPHERE") CORROSIVE_ATMOSPHERE,
        @SerialName("BREATHABLE_ATMOSPHERE") BREATHABLE_ATMOSPHERE,
        @SerialName("JOVIAN") JOVIAN,
        @SerialName("ROCKY") ROCKY,
        @SerialName("VOLCANIC") VOLCANIC,
        @SerialName("FROZEN") FROZEN,
        @SerialName("SWAMP") SWAMP,
        @SerialName("BARREN") BARREN,
        @SerialName("TEMPERATE") TEMPERATE,
        @SerialName("JUNGLE") JUNGLE,
        @SerialName("OCEAN") OCEAN,
        @SerialName("STRIPPED") STRIPPED,
    }
}
