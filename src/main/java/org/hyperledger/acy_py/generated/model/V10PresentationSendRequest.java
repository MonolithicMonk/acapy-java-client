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

import java.util.HashMap;
import java.util.Map;

/**
 * V10PresentationSendRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V10PresentationSendRequest {
    public static final String SERIALIZED_NAME_AUTO_REMOVE = "auto_remove";
    @SerializedName(SERIALIZED_NAME_AUTO_REMOVE)
    private Boolean autoRemove;
    public static final String SERIALIZED_NAME_REQUESTED_ATTRIBUTES = "requested_attributes";
    @SerializedName(SERIALIZED_NAME_REQUESTED_ATTRIBUTES)
    private Map<String, IndyRequestedCredsRequestedAttr> requestedAttributes = new HashMap<>();
    public static final String SERIALIZED_NAME_REQUESTED_PREDICATES = "requested_predicates";
    @SerializedName(SERIALIZED_NAME_REQUESTED_PREDICATES)
    private Map<String, IndyRequestedCredsRequestedPred> requestedPredicates = new HashMap<>();
    public static final String SERIALIZED_NAME_SELF_ATTESTED_ATTRIBUTES = "self_attested_attributes";
    @SerializedName(SERIALIZED_NAME_SELF_ATTESTED_ATTRIBUTES)
    private Map<String, String> selfAttestedAttributes = new HashMap<>();
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
}