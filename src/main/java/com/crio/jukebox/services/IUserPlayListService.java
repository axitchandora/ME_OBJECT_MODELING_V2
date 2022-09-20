package com.crio.jukebox.services;

import java.util.List;
import com.crio.jukebox.dtos.UserPlayedSongDto;
import com.crio.jukebox.entities.PlayList;
import com.crio.jukebox.entities.Song;
import com.crio.jukebox.entities.SongPlayingOrder;
import com.crio.jukebox.exceptions.InvalidOperationException;
import com.crio.jukebox.exceptions.PlayListNotFoundException;
import com.crio.jukebox.exceptions.SongNotFoundException;
import com.crio.jukebox.exceptions.UserNotFoundException;

public interface IUserPlayListService {
    public UserPlayedSongDto playSongById(String userId,String songId) throws UserNotFoundException,SongNotFoundException;
    public UserPlayedSongDto playSongByOrder(String userId,SongPlayingOrder playingOrder) throws UserNotFoundException;
    public PlayList createPlayList(String userId,String PlayListName,List<String>songs) throws UserNotFoundException,SongNotFoundException;
    public void deletePlayList(String userId,String PlayListId) throws UserNotFoundException,PlayListNotFoundException;
    public PlayList addSongToPlayList(String userId, String playListId, List<String>songs) throws UserNotFoundException,PlayListNotFoundException,SongNotFoundException, InvalidOperationException;
    public PlayList deleteSongFromPlayList(String userId,String playListId,List<String>songs) throws UserNotFoundException,PlayListNotFoundException,SongNotFoundException, InvalidOperationException;

    public UserPlayedSongDto setCurrentPlayList(String userId,String playListId) throws UserNotFoundException,PlayListNotFoundException;

}