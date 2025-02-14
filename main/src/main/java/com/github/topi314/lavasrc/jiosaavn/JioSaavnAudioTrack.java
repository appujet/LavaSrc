package com.github.topi314.lavasrc.jiosaavn;

import com.github.topi314.lavasrc.ExtendedAudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import com.sedmelluq.discord.lavaplayer.track.playback.LocalAudioTrackExecutor;
import org.jetbrains.annotations.Nullable;

public class JioSaavnAudioTrack extends ExtendedAudioTrack {

	public JioSaavnAudioTrack(AudioTrackInfo trackInfo, @Nullable String albumName, @Nullable String albumUrl, @Nullable String artistUrl, @Nullable String artistArtworkUrl, @Nullable String previewUrl, boolean isPreview) {
		super(trackInfo, albumName, albumUrl, artistUrl, artistArtworkUrl, previewUrl, isPreview);
	}

	@Override
	public void process(LocalAudioTrackExecutor localAudioTrackExecutor) throws Exception {

	}
}
