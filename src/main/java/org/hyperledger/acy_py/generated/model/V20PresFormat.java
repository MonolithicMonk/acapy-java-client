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

/**
 * V20PresFormat
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20PresFormat {
    public static final String SERIALIZED_NAME_ATTACH_ID = "attach_id";
    @SerializedName(SERIALIZED_NAME_ATTACH_ID)
    private String attachId;
    public static final String SERIALIZED_NAME_FORMAT = "format";
    @SerializedName(SERIALIZED_NAME_FORMAT)
    private String format;
}