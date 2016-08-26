package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.friends.responses.GetAvailableForCallResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getAvailableForCall method
 */
public class FriendsGetAvailableForCallQuery extends AbstractQueryBuilder<FriendsGetAvailableForCallQuery, GetAvailableForCallResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetAvailableForCallQuery(VkApiClient client, Actor actor) {
        super(client, "friends.getAvailableForCall", GetAvailableForCallResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default)
     * ''gen'' - genitive
     * ''dat'' - dative
     * ''acc'' - accusative
     * ''ins'' - instrumental
     * ''abl'' - prepositional
     *
     * @param value value of "name case" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetAvailableForCallQuery nameCase(String value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected FriendsGetAvailableForCallQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
