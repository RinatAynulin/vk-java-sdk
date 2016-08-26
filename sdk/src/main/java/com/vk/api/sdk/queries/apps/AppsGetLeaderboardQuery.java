package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.apps.responses.GetLeaderboardResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getLeaderboard method
 */
public class AppsGetLeaderboardQuery extends AbstractQueryBuilder<AppsGetLeaderboardQuery, GetLeaderboardResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param type   value of "type" parameter.
     */
    public AppsGetLeaderboardQuery(VkApiClient client, Actor actor, String type) {
        super(client, "apps.getLeaderboard", GetLeaderboardResponse.class);
        accessToken(actor.getAccessToken());
        type(type);
    }

    /**
     * Leaderboard type. Possible values:
     * ''level'' - by level;
     * ''points'' - by mission points;
     * ''score'' - by score (apps.getScore).
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsGetLeaderboardQuery type(String value) {
        return unsafeParam("type", value);
    }

    /**
     * Rating type.  Possible values:
     * ''1'' - global rating among all players;
     * ''0'' - rating among user friends.
     *
     * @param value value of "global" parameter. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetLeaderboardQuery global(Boolean value) {
        return unsafeParam("global", value);
    }

    @Override
    protected AppsGetLeaderboardQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type", "access_token");
    }
}
