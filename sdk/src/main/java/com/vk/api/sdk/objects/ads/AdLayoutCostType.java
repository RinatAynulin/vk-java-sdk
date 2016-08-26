package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

/**
 * Cost type
 */
public enum AdLayoutCostType {
    @SerializedName("0")
    PER_CLICKS(0),

    @SerializedName("1")
    PER_IMPRESSIONS(1);

    private final Integer value;

    AdLayoutCostType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
