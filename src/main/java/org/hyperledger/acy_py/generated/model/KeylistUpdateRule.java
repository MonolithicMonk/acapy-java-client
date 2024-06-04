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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * KeylistUpdateRule
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class KeylistUpdateRule {
    /**
     * Action for specific key
     */
    @JsonAdapter(ActionEnum.Adapter.class)
    public enum ActionEnum {
        ADD("add"),

        REMOVE("remove");

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ActionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ActionEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ACTION = "action";
    @SerializedName(SERIALIZED_NAME_ACTION)
    private ActionEnum action;
    public static final String SERIALIZED_NAME_RECIPIENT_KEY = "recipient_key";
    @SerializedName(SERIALIZED_NAME_RECIPIENT_KEY)
    private String recipientKey;
}
