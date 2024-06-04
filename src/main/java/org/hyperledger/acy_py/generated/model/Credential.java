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

import java.util.ArrayList;
import java.util.List;

/**
 * Credential
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class Credential {
    public static final String SERIALIZED_NAME_AT_CONTEXT = "@context";
    @SerializedName(SERIALIZED_NAME_AT_CONTEXT)
    private List<Object> atContext = new ArrayList<>();
    public static final String SERIALIZED_NAME_CREDENTIAL_SUBJECT = "credentialSubject";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_SUBJECT)
    private Object credentialSubject;
    public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
    @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
    private String expirationDate;
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    public static final String SERIALIZED_NAME_ISSUANCE_DATE = "issuanceDate";
    @SerializedName(SERIALIZED_NAME_ISSUANCE_DATE)
    private String issuanceDate;
    public static final String SERIALIZED_NAME_ISSUER = "issuer";
    @SerializedName(SERIALIZED_NAME_ISSUER)
    private Object issuer;
    public static final String SERIALIZED_NAME_PROOF = "proof";
    @SerializedName(SERIALIZED_NAME_PROOF)
    private LinkedDataProof proof;
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private List<String> type = new ArrayList<>();
}
