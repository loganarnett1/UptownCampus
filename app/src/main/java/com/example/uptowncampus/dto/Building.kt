package com.example.uptowncampus.dto

import com.google.gson.annotations.SerializedName

data class Building(var id : Int = 0, var buildingName : String) {
    override fun toString(): String {
        return buildingName
    }
}