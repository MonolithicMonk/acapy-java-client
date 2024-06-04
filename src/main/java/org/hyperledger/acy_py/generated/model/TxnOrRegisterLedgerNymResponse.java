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
 * TxnOrRegisterLedgerNymResponse
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class TxnOrRegisterLedgerNymResponse {
    public static final String SERIALIZED_NAME_SUCCESS = "success";
    @SerializedName(SERIALIZED_NAME_SUCCESS)
    private Boolean success;
    public static final String SERIALIZED_NAME_TXN = "txn";
    @SerializedName(SERIALIZED_NAME_TXN)
    private TransactionRecord txn;
}
