/*
 * Ziti Edge Management
 * OpenZiti Edge Management API
 *
 * The version of the OpenAPI document: 0.26.39
 * Contact: help@openziti.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openziti.management.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openziti.management.ApiClient;
import org.openziti.management.JSON;

/** PostureCheckOperatingSystemPatch */
@JsonPropertyOrder({PostureCheckOperatingSystemPatch.JSON_PROPERTY_OPERATING_SYSTEMS})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2025-01-30T10:50:07.620098843-05:00[America/New_York]",
        comments = "Generator version: 7.11.0")
@JsonIgnoreProperties(
        value = "typeId", // ignore manually set typeId, it will be automatically generated by
        // Jackson during serialization
        allowSetters = true // allows the typeId to be set during deserialization
        )
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "typeId",
        visible = true)
public class PostureCheckOperatingSystemPatch extends PostureCheckPatch {
    public static final String JSON_PROPERTY_OPERATING_SYSTEMS = "operatingSystems";
    @javax.annotation.Nullable private List<OperatingSystem> operatingSystems = new ArrayList<>();

    public PostureCheckOperatingSystemPatch() {}

    public PostureCheckOperatingSystemPatch operatingSystems(
            @javax.annotation.Nullable List<OperatingSystem> operatingSystems) {
        this.operatingSystems = operatingSystems;
        return this;
    }

    public PostureCheckOperatingSystemPatch addOperatingSystemsItem(
            OperatingSystem operatingSystemsItem) {
        if (this.operatingSystems == null) {
            this.operatingSystems = new ArrayList<>();
        }
        this.operatingSystems.add(operatingSystemsItem);
        return this;
    }

    /**
     * Get operatingSystems
     *
     * @return operatingSystems
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<OperatingSystem> getOperatingSystems() {
        return operatingSystems;
    }

    @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOperatingSystems(
            @javax.annotation.Nullable List<OperatingSystem> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    @Override
    public PostureCheckOperatingSystemPatch roleAttributes(
            @javax.annotation.Nullable List<String> roleAttributes) {
        this.setRoleAttributes(roleAttributes);
        return this;
    }

    @Override
    public PostureCheckOperatingSystemPatch tags(@javax.annotation.Nullable Tags tags) {
        this.setTags(tags);
        return this;
    }

    @Override
    public PostureCheckOperatingSystemPatch typeId(
            @javax.annotation.Nonnull PostureCheckType typeId) {
        this.setTypeId(typeId);
        return this;
    }

    /** Return true if this postureCheckOperatingSystemPatch object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureCheckOperatingSystemPatch postureCheckOperatingSystemPatch =
                (PostureCheckOperatingSystemPatch) o;
        return Objects.equals(
                        this.operatingSystems, postureCheckOperatingSystemPatch.operatingSystems)
                && super.equals(o);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatingSystems, super.hashCode());
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostureCheckOperatingSystemPatch {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `roleAttributes` to the URL query string
        if (getRoleAttributes() != null) {
            for (int i = 0; i < getRoleAttributes().size(); i++) {
                joiner.add(
                        String.format(
                                "%sroleAttributes%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                ApiClient.valueToString(getRoleAttributes().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `tags` to the URL query string
        if (getTags() != null) {
            joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
        }

        // add `typeId` to the URL query string
        if (getTypeId() != null) {
            joiner.add(
                    String.format(
                            "%stypeId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getTypeId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `operatingSystems` to the URL query string
        if (getOperatingSystems() != null) {
            for (int i = 0; i < getOperatingSystems().size(); i++) {
                if (getOperatingSystems().get(i) != null) {
                    joiner.add(
                            getOperatingSystems()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%soperatingSystems%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }

    static {
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("postureCheckOperatingSystemPatch", PostureCheckOperatingSystemPatch.class);
        JSON.registerDiscriminator(PostureCheckOperatingSystemPatch.class, "typeId", mappings);
    }
}
