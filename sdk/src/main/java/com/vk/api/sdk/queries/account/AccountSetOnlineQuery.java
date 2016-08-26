package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.setOnline method
 */
public class AccountSetOnlineQuery extends AbstractQueryBuilder<AccountSetOnlineQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AccountSetOnlineQuery(VkApiClient client, Actor actor) {
        super(client, "account.setOnline", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set voip
     *
     * @param value value of "voip" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetOnlineQuery voip(Boolean value) {
        return unsafeParam("voip", value);
    }

    @Override
    protected AccountSetOnlineQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
