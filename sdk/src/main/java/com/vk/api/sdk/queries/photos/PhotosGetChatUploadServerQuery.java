package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.photos.responses.GetChatUploadServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getChatUploadServer method
 */
public class PhotosGetChatUploadServerQuery extends AbstractQueryBuilder<PhotosGetChatUploadServerQuery, GetChatUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param chatId value of "chat id" parameter. Minimum is 0.
     */
    public PhotosGetChatUploadServerQuery(VkApiClient client, Actor actor, int chatId) {
        super(client, "photos.getChatUploadServer", GetChatUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * ID of the chat for which you want to upload a cover photo.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetChatUploadServerQuery chatId(int value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * @param value value of "crop x" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetChatUploadServerQuery cropX(Integer value) {
        return unsafeParam("crop_x", value);
    }

    /**
     * @param value value of "crop y" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetChatUploadServerQuery cropY(Integer value) {
        return unsafeParam("crop_y", value);
    }

    /**
     * Width (in pixels) of the photo after cropping.
     *
     * @param value value of "crop width" parameter. Minimum is 200.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetChatUploadServerQuery cropWidth(Integer value) {
        return unsafeParam("crop_width", value);
    }

    @Override
    protected PhotosGetChatUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("chat_id", "access_token");
    }
}
