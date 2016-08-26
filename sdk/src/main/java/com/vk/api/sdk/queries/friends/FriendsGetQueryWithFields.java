package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.friends.responses.GetFieldsResponse;
import com.vk.api.sdk.queries.Field;

import java.util.Collections;
import java.util.List;

/**
 * Query for Friends.get method
 */
public class FriendsGetQueryWithFields extends AbstractQueryBuilder<FriendsGetQueryWithFields, GetFieldsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetQueryWithFields(VkApiClient client, Actor actor, Field... fields) {
        super(client, "friends.get", GetFieldsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public FriendsGetQueryWithFields(VkApiClient client, Field... fields) {
        super(client, "friends.get", GetFieldsResponse.class);
        fields(fields);
    }

    /**
     * User ID. By default, the current user ID.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Sort order:
     * ''name'' - by name (enabled only if the "fields" parameter is used)
     * ''hints'' - by rating, similar to how friends are sorted in My friends section
     * <p>
     * This parameter is available only for desktop applications.
     *
     * @param value value of "order" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields order(String value) {
        return unsafeParam("order", value);
    }

    /**
     * ID of the friend list returned by the desktop applications.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    /**
     * Number of friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Profile fields to return. Sample values: ''uid'', ''first_name'', ''last_name'', ''nickname'', ''sex'', ''bdate'' (birthdate), ''city'', ''country'', ''timezone'', ''photo'', ''photo_medium'', ''photo_big'', ''domain'', ''has_mobile'', ''rate'', ''contacts'', ''education''.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetQueryWithFields fields(Field... value) {
        return unsafeParam("fields", value);
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
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetQueryWithFields nameCase(String value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected FriendsGetQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
