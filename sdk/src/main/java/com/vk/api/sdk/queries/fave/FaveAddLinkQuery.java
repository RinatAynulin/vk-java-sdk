package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.addLink method
 */
public class FaveAddLinkQuery extends AbstractQueryBuilder<FaveAddLinkQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param link   value of "link" parameter.
     */
    public FaveAddLinkQuery(VkApiClient client, Actor actor, String link) {
        super(client, "fave.addLink", OkResponse.class);
        accessToken(actor.getAccessToken());
        link(link);
    }

    /**
     * Link URL.
     *
     * @param value value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveAddLinkQuery link(String value) {
        return unsafeParam("link", value);
    }

    /**
     * Description text.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveAddLinkQuery text(String value) {
        return unsafeParam("text", value);
    }

    @Override
    protected FaveAddLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link", "access_token");
    }
}
