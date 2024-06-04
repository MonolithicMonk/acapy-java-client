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
 * MenuForm
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class MenuForm {
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    public static final String SERIALIZED_NAME_PARAMS = "params";
    @SerializedName(SERIALIZED_NAME_PARAMS)
    private List<MenuFormParam> params = null;
    public static final String SERIALIZED_NAME_SUBMIT_LABEL = "submit-label";
    @SerializedName(SERIALIZED_NAME_SUBMIT_LABEL)
    private String submitLabel;
    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
}