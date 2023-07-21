package com.subbaabhishek.movieapp.data.db

import androidx.room.Database
import com.subbaabhishek.movieapp.data.model.artist.Artist
import com.subbaabhishek.movieapp.data.model.movie.Movie
import com.subbaabhishek.movieapp.data.model.tvshow.TvShow

@Database(entities = [Movie::class, TvShow::class, Artist::class], version = 1, exportSchema = false)
abstract class TMDBDatabase {
    abstract fun movieDao() : MovieDao
    abstract fun tvDao() : TvShowDao
    abstract fun artistDao() : ArtistDao


}