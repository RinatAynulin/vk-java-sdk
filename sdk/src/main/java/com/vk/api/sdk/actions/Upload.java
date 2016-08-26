package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.queries.upload.UploadAudioQuery;
import com.vk.api.sdk.queries.upload.UploadDocQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoMarketAlbumQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoMarketQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoMessageQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoOwnerQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoQuery;
import com.vk.api.sdk.queries.upload.UploadPhotoWallQuery;
import com.vk.api.sdk.queries.upload.UploadVideoQuery;

import java.io.File;

/**
 * Created by tsivarev on 17.08.16.
 */
public class Upload extends AbstractAction {

    public Upload(VkApiClient vkApiClient) {
        super(vkApiClient);
    }

    public UploadPhotoQuery photo(String uploadUrl, File file) {
        return new UploadPhotoQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketAlbumQuery photoMarketAlbum(String uploadUrl, File file) {
        return new UploadPhotoMarketAlbumQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMarketQuery photoMarket(String uploadUrl, File file) {
        return new UploadPhotoMarketQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoMessageQuery photoMessage(String uploadUrl, File file) {
        return new UploadPhotoMessageQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoOwnerQuery photoOwner(String uploadUrl, File file) {
        return new UploadPhotoOwnerQuery(getClient(), uploadUrl, file);
    }

    public UploadPhotoWallQuery photoWall(String uploadUrl, File file) {
        return new UploadPhotoWallQuery(getClient(), uploadUrl, file);
    }

    public UploadVideoQuery video(String uploadUrl, File file) {
        return new UploadVideoQuery(getClient(), uploadUrl, file);
    }

    public UploadAudioQuery audio(String uploadUrl, File file) {
        return new UploadAudioQuery(getClient(), uploadUrl, file);
    }

    public UploadDocQuery doc(String uploadUrl, File file) {
        return new UploadDocQuery(getClient(), uploadUrl, file);
    }
}
