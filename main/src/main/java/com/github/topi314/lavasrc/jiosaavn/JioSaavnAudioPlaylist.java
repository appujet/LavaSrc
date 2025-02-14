package com.github.topi314.lavasrc.jiosaavn;

import com.github.topi314.lavasrc.ExtendedAudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JioSaavnAudioPlaylist extends ExtendedAudioPlaylist {
	public JioSaavnAudioPlaylist(String name, List<AudioTrack> tracks, @NotNull Type type, @Nullable String url, @Nullable String artworkURL, @Nullable String author, @Nullable Integer totalTracks) {
		super(name, tracks, type, url, artworkURL, author, totalTracks);
	}
}
