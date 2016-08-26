package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.addToAlbum method
 */
public class MarketAddToAlbumQuery extends AbstractQueryBuilder<MarketAddToAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param ownerId  value of "owner id" parameter.
     * @param itemId   value of "item id" parameter. Minimum is 0.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketAddToAlbumQuery(VkApiClient client, Actor actor, int ownerId, int itemId, int... albumIds) {
        super(client, "market.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
        albumIds(albumIds);
    }

    /**
     * Item owner identifier
     * &lt;blockquote&gt;Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community &lt;/blockquote&gt;
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item identifier
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Collections ids to add  item to
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery albumIds(int... value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected MarketAddToAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "album_ids", "owner_id", "access_token");
    }
}
