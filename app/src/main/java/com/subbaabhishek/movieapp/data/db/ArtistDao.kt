package com.subbaabhishek.movieapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.subbaabhishek.movieapp.data.model.artist.Artist
import com.subbaabhishek.movieapp.data.model.movie.Movie
import com.subbaabhishek.movieapp.data.model.tvshow.TvShow

@Dao
interface ArtistDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtist(artists: List<Artist>)

    @Query("DELETE FROM popular_artists")
    suspend fun deleteAllArtists()

    @Query("SELECT * FROM popular_artists")
    suspend fun getArtists() : List<Artist>
}