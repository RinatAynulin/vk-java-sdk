package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.photos.responses.GetAllResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getAll method
 */
public class PhotosGetAllQuery extends AbstractQueryBuilder<PhotosGetAllQuery, GetAllResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetAllQuery(VkApiClient client, Actor actor) {
        super(client, "photos.getAll", GetAllResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of a user or community that owns the photos.
     * Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Offset needed to return a specific subset of photos. By default, ''0''.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of photos to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * ''1'' - to return image sizes in special format.
     *
     * @param value value of "photo sizes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery photoSizes(Boolean value) {
        return unsafeParam("photo_sizes", value);
    }

    /**
     * ''1'' - to return photos only from standard albums
     * ''0'' - to return all photos including those in service albums, e.g., "My wall photos" (default)
     *
     * @param value value of "no service albums" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery noServiceAlbums(Boolean value) {
        return unsafeParam("no_service_albums", value);
    }

    /**
     * ''1'' - to show information about photos being hidden from the block above the wall.
     *
     * @param value value of "need hidden" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery needHidden(Boolean value) {
        return unsafeParam("need_hidden", value);
    }

    /**
     * ''1'' - not to return photos being hidden from the block above the wall. Works only with &lt;code&gt;owner_id&gt;0&lt;/code&gt;, &lt;code&gt;no_service_albums&lt;/code&gt; is ignored.
     *
     * @param value value of "skip hidden" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllQuery skipHidden(Boolean value) {
        return unsafeParam("skip_hidden", value);
    }

    @Override
    protected PhotosGetAllQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
