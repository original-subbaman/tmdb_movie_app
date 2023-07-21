package com.subbaabhishek.movieapp.domain.repository

import com.subbaabhishek.movieapp.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows() : List<TvShow>?
    suspend fun updateTvShows() : List<TvShow>?
}