package io.androidedu.hoop.dto

import io.androidedu.hoop.Model.CallsModel
import io.androidedu.hoop.Model.StatusModel
import io.androidedu.hoop.model.ChatModel

data class ServicesDto(
    val summary: String,
    val images: ArrayList<ChatModel>,
    val weight: Int,
    val source: StatusModel,
    val media: ArrayList<CallsModel>,
    val updateDate: String
)