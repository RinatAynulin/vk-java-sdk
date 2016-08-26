package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.audio.AudioAddAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioAddQuery;
import com.vk.api.sdk.queries.audio.AudioDeleteAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioDeleteQuery;
import com.vk.api.sdk.queries.audio.AudioEditAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioEditQuery;
import com.vk.api.sdk.queries.audio.AudioGetAlbumsQuery;
import com.vk.api.sdk.queries.audio.AudioGetBroadcastListQuery;
import com.vk.api.sdk.queries.audio.AudioGetByIdQuery;
import com.vk.api.sdk.queries.audio.AudioGetCountQuery;
import com.vk.api.sdk.queries.audio.AudioGetLyricsQuery;
import com.vk.api.sdk.queries.audio.AudioGetPopularQuery;
import com.vk.api.sdk.queries.audio.AudioGetQuery;
import com.vk.api.sdk.queries.audio.AudioGetRecommendationsQuery;
import com.vk.api.sdk.queries.audio.AudioGetUploadServerQuery;
import com.vk.api.sdk.queries.audio.AudioMoveToAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioReorderQuery;
import com.vk.api.sdk.queries.audio.AudioRestoreQuery;
import com.vk.api.sdk.queries.audio.AudioSaveQuery;
import com.vk.api.sdk.queries.audio.AudioSearchQuery;
import com.vk.api.sdk.queries.audio.AudioSetBroadcastQuery;

/**
 * List of Audio methods
 */
public class Audio extends AbstractAction {
    public Audio(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of audio files of a user or community.
     */
    public AudioGetQuery get(Actor actor) {
        return new AudioGetQuery(getClient(), actor);
    }

    /**
     * Returns information about audio files by their IDs.
     */
    public AudioGetByIdQuery getById(Actor actor, String... audios) {
        return new AudioGetByIdQuery(getClient(), actor, audios);
    }

    /**
     * Returns lyrics associated with an audio file.
     */
    public AudioGetLyricsQuery getLyrics(Actor actor, int lyricsId) {
        return new AudioGetLyricsQuery(getClient(), actor, lyricsId);
    }

    /**
     * Returns a list of audio files.
     */
    public AudioSearchQuery search(Actor actor) {
        return new AudioSearchQuery(getClient(), actor);
    }

    /**
     * Returns the server address to upload audio files.
     */
    public AudioGetUploadServerQuery getUploadServer(Actor actor) {
        return new AudioGetUploadServerQuery(getClient(), actor);
    }

    /**
     * Saves audio files after successful uploading.
     */
    public AudioSaveQuery save(Actor actor, int server, String audio) {
        return new AudioSaveQuery(getClient(), actor, server, audio);
    }

    /**
     * Copies an audio file to a user page or community page.
     */
    public AudioAddQuery add(Actor actor, int audioId, int ownerId) {
        return new AudioAddQuery(getClient(), actor, audioId, ownerId);
    }

    /**
     * Deletes an audio file from a user page or community page.
     */
    public AudioDeleteQuery delete(Actor actor, int audioId, int ownerId) {
        return new AudioDeleteQuery(getClient(), actor, audioId, ownerId);
    }

    /**
     * Edits an audio file on a user or community page.
     */
    public AudioEditQuery edit(Actor actor, int ownerId, int audioId) {
        return new AudioEditQuery(getClient(), actor, ownerId, audioId);
    }

    /**
     * Reorders an audio file, placing it between other specified audio files.
     */
    public AudioReorderQuery reorder(Actor actor, int audioId) {
        return new AudioReorderQuery(getClient(), actor, audioId);
    }

    /**
     * Restores a deleted audio file.
     */
    public AudioRestoreQuery restore(Actor actor, int audioId) {
        return new AudioRestoreQuery(getClient(), actor, audioId);
    }

    /**
     * Returns a list of audio albums of a user or community.
     */
    public AudioGetAlbumsQuery getAlbums(Actor actor) {
        return new AudioGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Creates an empty audio album.
     */
    public AudioAddAlbumQuery addAlbum(Actor actor, String title) {
        return new AudioAddAlbumQuery(getClient(), actor, title);
    }

    /**
     * Edits the title of an audio album.
     */
    public AudioEditAlbumQuery editAlbum(Actor actor, int albumId, String title) {
        return new AudioEditAlbumQuery(getClient(), actor, albumId, title);
    }

    /**
     * Deletes an audio album.
     */
    public AudioDeleteAlbumQuery deleteAlbum(Actor actor, int albumId) {
        return new AudioDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Moves audio files to an album.
     */
    public AudioMoveToAlbumQuery moveToAlbum(Actor actor, int... audioIds) {
        return new AudioMoveToAlbumQuery(getClient(), actor, audioIds);
    }

    /**
     * Activates an audio broadcast to the status of a user or community.
     */
    public AudioSetBroadcastQuery setBroadcast(Actor actor) {
        return new AudioSetBroadcastQuery(getClient(), actor);
    }

    /**
     * Returns a list of the user's friends and communities that are broadcasting music in their statuses.
     */
    public AudioGetBroadcastListQuery getBroadcastList(Actor actor) {
        return new AudioGetBroadcastListQuery(getClient(), actor);
    }

    /**
     * Returns a list of suggested audio files based on a user's playlist or a particular audio file.
     */
    public AudioGetRecommendationsQuery getRecommendations(Actor actor) {
        return new AudioGetRecommendationsQuery(getClient(), actor);
    }

    /**
     * Returns a list of audio files from the "Popular".
     */
    public AudioGetPopularQuery getPopular(Actor actor) {
        return new AudioGetPopularQuery(getClient(), actor);
    }

    /**
     * Returns the total number of audio files on a user or community page.
     */
    public AudioGetCountQuery getCount(Actor actor, int ownerId) {
        return new AudioGetCountQuery(getClient(), actor, ownerId);
    }
}
