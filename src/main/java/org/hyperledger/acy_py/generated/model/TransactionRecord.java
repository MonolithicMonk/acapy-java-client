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
import java.util.Map;

/**
 * TransactionRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class TransactionRecord {
    public static final String SERIALIZED_NAME_TYPE = "_type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private String connectionId;
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_ENDORSER_WRITE_TXN = "endorser_write_txn";
    @SerializedName(SERIALIZED_NAME_ENDORSER_WRITE_TXN)
    private Boolean endorserWriteTxn;
    public static final String SERIALIZED_NAME_FORMATS = "formats";
    @SerializedName(SERIALIZED_NAME_FORMATS)
    private List<Map<String, String>> formats = null;
    public static final String SERIALIZED_NAME_MESSAGES_ATTACH = "messages_attach";
    @SerializedName(SERIALIZED_NAME_MESSAGES_ATTACH)
    private List<Object> messagesAttach = null;
    public static final String SERIALIZED_NAME_META_DATA = "meta_data";
    @SerializedName(SERIALIZED_NAME_META_DATA)
    private Object metaData;
    public static final String SERIALIZED_NAME_SIGNATURE_REQUEST = "signature_request";
    @SerializedName(SERIALIZED_NAME_SIGNATURE_REQUEST)
    private List<Object> signatureRequest = null;
    public static final String SERIALIZED_NAME_SIGNATURE_RESPONSE = "signature_response";
    @SerializedName(SERIALIZED_NAME_SIGNATURE_RESPONSE)
    private List<Object> signatureResponse = null;
    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
    @SerializedName(SERIALIZED_NAME_THREAD_ID)
    private String threadId;
    public static final String SERIALIZED_NAME_TIMING = "timing";
    @SerializedName(SERIALIZED_NAME_TIMING)
    private Object timing;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
    public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
    @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
    private String transactionId;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}