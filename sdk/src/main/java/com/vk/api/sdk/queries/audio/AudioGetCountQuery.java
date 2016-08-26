package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getCount method
 */
public class AudioGetCountQuery extends AbstractQueryBuilder<AudioGetCountQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public AudioGetCountQuery(VkApiClient client, Actor actor, int ownerId) {
        super(client, "audio.getCount", Integer.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
    }

    /**
     * ID of the user or community that owns the audio files. By default, current user ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioGetCountQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    @Override
    protected AudioGetCountQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}
