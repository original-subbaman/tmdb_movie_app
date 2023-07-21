package com.subbaabhishek.movieapp.domain.usecase

import com.subbaabhishek.movieapp.data.model.movie.Movie
import com.subbaabhishek.movieapp.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepo : MovieRepository) {

    suspend fun execute() : List<Movie> ? = movieRepo.getMovies()


}