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
 * InvitationCreateRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class InvitationCreateRequest {
    public static final String SERIALIZED_NAME_ACCEPT = "accept";
    @SerializedName(SERIALIZED_NAME_ACCEPT)
    private List<String> accept = null;
    public static final String SERIALIZED_NAME_ALIAS = "alias";
    @SerializedName(SERIALIZED_NAME_ALIAS)
    private String alias;
    public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
    @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
    private List<AttachmentDef> attachments = null;
    public static final String SERIALIZED_NAME_GOAL = "goal";
    @SerializedName(SERIALIZED_NAME_GOAL)
    private String goal;
    public static final String SERIALIZED_NAME_GOAL_CODE = "goal_code";
    @SerializedName(SERIALIZED_NAME_GOAL_CODE)
    private String goalCode;
    public static final String SERIALIZED_NAME_HANDSHAKE_PROTOCOLS = "handshake_protocols";
    @SerializedName(SERIALIZED_NAME_HANDSHAKE_PROTOCOLS)
    private List<String> handshakeProtocols = null;
    public static final String SERIALIZED_NAME_MEDIATION_ID = "mediation_id";
    @SerializedName(SERIALIZED_NAME_MEDIATION_ID)
    private String mediationId;
    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_METADATA)
    private Object metadata;
    public static final String SERIALIZED_NAME_MY_LABEL = "my_label";
    @SerializedName(SERIALIZED_NAME_MY_LABEL)
    private String myLabel;
    public static final String SERIALIZED_NAME_PROTOCOL_VERSION = "protocol_version";
    @SerializedName(SERIALIZED_NAME_PROTOCOL_VERSION)
    private String protocolVersion;
    public static final String SERIALIZED_NAME_USE_PUBLIC_DID = "use_public_did";
    @SerializedName(SERIALIZED_NAME_USE_PUBLIC_DID)
    private Boolean usePublicDid;
}