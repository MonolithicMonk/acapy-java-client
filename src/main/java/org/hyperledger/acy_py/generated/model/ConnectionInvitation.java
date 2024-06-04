/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.3
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ConnectionInvitation
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class ConnectionInvitation {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_DID = "did";
    @SerializedName(SERIALIZED_NAME_DID)
    private String did;
    public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
    @SerializedName(SERIALIZED_NAME_IMAGE_URL)
    private String imageUrl;
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
    public static final String SERIALIZED_NAME_RECIPIENT_KEYS = "recipientKeys";
    @SerializedName(SERIALIZED_NAME_RECIPIENT_KEYS)
    private List<String> recipientKeys = null;
    public static final String SERIALIZED_NAME_ROUTING_KEYS = "routingKeys";
    @SerializedName(SERIALIZED_NAME_ROUTING_KEYS)
    private List<String> routingKeys = null;
    public static final String SERIALIZED_NAME_SERVICE_ENDPOINT = "serviceEndpoint";
    @SerializedName(SERIALIZED_NAME_SERVICE_ENDPOINT)
    private String serviceEndpoint;
}