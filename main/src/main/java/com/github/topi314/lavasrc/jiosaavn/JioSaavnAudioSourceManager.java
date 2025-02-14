package com.github.topi314.lavasrc.jiosaavn;

import com.github.topi314.lavasearch.AudioSearchManager;
import com.github.topi314.lavasearch.result.AudioSearchResult;
import com.github.topi314.lavasrc.ExtendedAudioSourceManager;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.tools.io.HttpConfigurable;
import com.sedmelluq.discord.lavaplayer.track.AudioItem;
import com.sedmelluq.discord.lavaplayer.track.AudioReference;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.DataInput;
import java.io.IOException;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;

public class JioSaavnAudioSourceManager extends ExtendedAudioSourceManager implements HttpConfigurable, AudioSearchManager {
	private static final Pattern JIOSAAVN_REGEX = Pattern.compile(
		"https://www\\.jiosaavn\\.com/(?<type>album|featured|song|s/playlist|artist)/[^/]+/(?<id>[A-Za-z0-9_,\\-]+)"
	);
	public static final String SEARCH_PREFIX = "jssearch:";
	public static final String RECOMMENDATIONS_PREFIX = "jsrec:";
	public static final String PREVIEW_PREFIX = "jsprev:";
	private final String apiUrl;

	public JioSaavnAudioSourceManager(String apiUrl, int playlistTrackLimit, int recommendationsTrackLimit) {
		if (apiUrl == null || apiUrl.isEmpty()) {
			throw new IllegalArgumentException("JioSaavn API URL cannot be null or empty.");
		}
		this.apiUrl = apiUrl;

	}

	@NotNull
	@Override
	public String getSourceName() {
		return "jiosaavn";
	}

	@Override
	public @Nullable AudioSearchResult loadSearch(@NotNull String s, @NotNull Set<AudioSearchResult.Type> set) {
		return null;
	}

	@Override
	public AudioItem loadItem(AudioPlayerManager audioPlayerManager, AudioReference audioReference) {
		return null;
	}

	@Override
	public AudioTrack decodeTrack(AudioTrackInfo audioTrackInfo, DataInput dataInput) throws IOException {
		return null;
	}

	@Override
	public void shutdown() {

	}

	@Override
	public void configureRequests(Function<RequestConfig, RequestConfig> function) {

	}

	@Override
	public void configureBuilder(Consumer<HttpClientBuilder> consumer) {

	}
}
