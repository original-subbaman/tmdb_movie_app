package com.subbaabhishek.movieapp.domain.repository

import com.subbaabhishek.movieapp.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists() : List<Artist>?
    suspend fun updateArtists() : List<Artist>?
}