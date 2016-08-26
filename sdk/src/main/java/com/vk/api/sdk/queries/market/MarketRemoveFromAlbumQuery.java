package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.removeFromAlbum method
 */
public class MarketRemoveFromAlbumQuery extends AbstractQueryBuilder<MarketRemoveFromAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param ownerId  value of "owner id" parameter.
     * @param itemId   value of "item id" parameter. Minimum is 0.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketRemoveFromAlbumQuery(VkApiClient client, Actor actor, int ownerId, int itemId, int... albumIds) {
        super(client, "market.removeFromAlbum", OkResponse.class);
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
    protected MarketRemoveFromAlbumQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item identifier
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketRemoveFromAlbumQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Collections ids to remove item from
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketRemoveFromAlbumQuery albumIds(int... value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected MarketRemoveFromAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "album_ids", "owner_id", "access_token");
    }
}
