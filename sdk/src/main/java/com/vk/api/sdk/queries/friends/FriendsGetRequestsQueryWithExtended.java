package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.friends.responses.GetRequestsExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getRequests method
 */
public class FriendsGetRequestsQueryWithExtended extends AbstractQueryBuilder<FriendsGetRequestsQueryWithExtended, GetRequestsExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetRequestsQueryWithExtended(VkApiClient client, Actor actor) {
        super(client, "friends.getRequests", GetRequestsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Offset needed to return a specific subset of friend requests.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of friend requests to return (default 100, maximum 1000).
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * "1" - to return response messages from users who have sent a friend request or, if "suggested" is set to "1", to return a list of suggested friends
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetRequestsQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * "1" - to return a list of mutual friends (up to 20), if any
     *
     * @param value value of "need mutual" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithExtended needMutual(Boolean value) {
        return unsafeParam("need_mutual", value);
    }

    /**
     * "1" - to return outgoing requests
     * "0" - to return incoming requests (default)
     *
     * @param value value of "out" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithExtended out(Boolean value) {
        return unsafeParam("out", value);
    }

    /**
     * Sort order:
     * "1" - by number of mutual friends
     * "0" - by date
     *
     * @param value value of "sort" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithExtended sort(FriendsGetRequestsSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * "1" - to return a list of suggested friends
     * "0" - to return friend requests (default)
     *
     * @param value value of "suggested" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithExtended suggested(Boolean value) {
        return unsafeParam("suggested", value);
    }

    @Override
    protected FriendsGetRequestsQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
