package com.subbaabhishek.movieapp.domain.usecase

import com.subbaabhishek.movieapp.data.model.artist.Artist
import com.subbaabhishek.movieapp.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepo : ArtistRepository) {

    suspend fun execute() : List<Artist>? = artistRepo.getArtists()
}