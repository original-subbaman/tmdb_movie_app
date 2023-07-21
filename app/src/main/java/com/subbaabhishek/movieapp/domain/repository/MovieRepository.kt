package com.subbaabhishek.movieapp.domain.repository

import com.subbaabhishek.movieapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies() : List<Movie>?
    suspend fun updateMovies() : List<Movie>?

}