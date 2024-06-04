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

import java.util.UUID;

/**
 * V20CredExFree
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20CredExFree {
    public static final String SERIALIZED_NAME_AUTO_REMOVE = "auto_remove";
    @SerializedName(SERIALIZED_NAME_AUTO_REMOVE)
    private Boolean autoRemove;
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private UUID connectionId;
    public static final String SERIALIZED_NAME_CREDENTIAL_PREVIEW = "credential_preview";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_PREVIEW)
    private V20CredPreview credentialPreview;
    public static final String SERIALIZED_NAME_FILTER = "filter";
    @SerializedName(SERIALIZED_NAME_FILTER)
    private V20CredFilter filter;
    public static final String SERIALIZED_NAME_REPLACEMENT_ID = "replacement_id";
    @SerializedName(SERIALIZED_NAME_REPLACEMENT_ID)
    private String replacementId;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
    public static final String SERIALIZED_NAME_VERIFICATION_METHOD = "verification_method";
    @SerializedName(SERIALIZED_NAME_VERIFICATION_METHOD)
    private String verificationMethod;
}
