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

/** PostureCheckProcessMultiCreate */
@JsonPropertyOrder({
    PostureCheckProcessMultiCreate.JSON_PROPERTY_PROCESSES,
    PostureCheckProcessMultiCreate.JSON_PROPERTY_SEMANTIC
})
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
public class PostureCheckProcessMultiCreate extends PostureCheckCreate {
    public static final String JSON_PROPERTY_PROCESSES = "processes";
    @javax.annotation.Nonnull private List<ProcessMulti> processes = new ArrayList<>();

    public static final String JSON_PROPERTY_SEMANTIC = "semantic";
    @javax.annotation.Nonnull private Semantic semantic;

    public PostureCheckProcessMultiCreate() {}

    public PostureCheckProcessMultiCreate processes(
            @javax.annotation.Nonnull List<ProcessMulti> processes) {
        this.processes = processes;
        return this;
    }

    public PostureCheckProcessMultiCreate addProcessesItem(ProcessMulti processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    /**
     * Get processes
     *
     * @return processes
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PROCESSES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ProcessMulti> getProcesses() {
        return processes;
    }

    @JsonProperty(JSON_PROPERTY_PROCESSES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setProcesses(@javax.annotation.Nonnull List<ProcessMulti> processes) {
        this.processes = processes;
    }

    public PostureCheckProcessMultiCreate semantic(@javax.annotation.Nonnull Semantic semantic) {
        this.semantic = semantic;
        return this;
    }

    /**
     * Get semantic
     *
     * @return semantic
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SEMANTIC)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Semantic getSemantic() {
        return semantic;
    }

    @JsonProperty(JSON_PROPERTY_SEMANTIC)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSemantic(@javax.annotation.Nonnull Semantic semantic) {
        this.semantic = semantic;
    }

    @Override
    public PostureCheckProcessMultiCreate roleAttributes(
            @javax.annotation.Nullable List<String> roleAttributes) {
        this.setRoleAttributes(roleAttributes);
        return this;
    }

    @Override
    public PostureCheckProcessMultiCreate tags(@javax.annotation.Nullable Tags tags) {
        this.setTags(tags);
        return this;
    }

    @Override
    public PostureCheckProcessMultiCreate typeId(
            @javax.annotation.Nonnull PostureCheckType typeId) {
        this.setTypeId(typeId);
        return this;
    }

    /** Return true if this postureCheckProcessMultiCreate object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostureCheckProcessMultiCreate postureCheckProcessMultiCreate =
                (PostureCheckProcessMultiCreate) o;
        return Objects.equals(this.processes, postureCheckProcessMultiCreate.processes)
                && Objects.equals(this.semantic, postureCheckProcessMultiCreate.semantic)
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
        return Objects.hash(processes, semantic, super.hashCode());
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
        sb.append("class PostureCheckProcessMultiCreate {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
        sb.append("    semantic: ").append(toIndentedString(semantic)).append("\n");
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

        // add `processes` to the URL query string
        if (getProcesses() != null) {
            for (int i = 0; i < getProcesses().size(); i++) {
                if (getProcesses().get(i) != null) {
                    joiner.add(
                            getProcesses()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sprocesses%s%s",
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

        // add `semantic` to the URL query string
        if (getSemantic() != null) {
            joiner.add(
                    String.format(
                            "%ssemantic%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getSemantic()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }

    static {
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("postureCheckProcessMultiCreate", PostureCheckProcessMultiCreate.class);
        JSON.registerDiscriminator(PostureCheckProcessMultiCreate.class, "typeId", mappings);
    }
}
