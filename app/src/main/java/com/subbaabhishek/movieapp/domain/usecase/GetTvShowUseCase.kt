package com.subbaabhishek.movieapp.domain.usecase

import com.subbaabhishek.movieapp.data.model.tvshow.TvShow
import com.subbaabhishek.movieapp.domain.repository.TvShowRepository

class GetTvShowUseCase(private val tvShowRepository : TvShowRepository) {
    suspend fun execute() : List<TvShow>? = tvShowRepository.getTvShows()
}