/*
 * Ziti Edge Client
 * OpenZiti Edge Client API
 *
 * The version of the OpenAPI document: 0.26.27
 * Contact: help@openziti.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openziti.edge.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import org.openziti.edge.ApiClient;

/** Jwk */
@JsonPropertyOrder({
    Jwk.JSON_PROPERTY_ALG,
    Jwk.JSON_PROPERTY_CRV,
    Jwk.JSON_PROPERTY_D,
    Jwk.JSON_PROPERTY_DP,
    Jwk.JSON_PROPERTY_DQ,
    Jwk.JSON_PROPERTY_E,
    Jwk.JSON_PROPERTY_KEY_OPS,
    Jwk.JSON_PROPERTY_KID,
    Jwk.JSON_PROPERTY_KTY,
    Jwk.JSON_PROPERTY_N,
    Jwk.JSON_PROPERTY_OTH,
    Jwk.JSON_PROPERTY_P,
    Jwk.JSON_PROPERTY_Q,
    Jwk.JSON_PROPERTY_QI,
    Jwk.JSON_PROPERTY_USE,
    Jwk.JSON_PROPERTY_X,
    Jwk.JSON_PROPERTY_X5C,
    Jwk.JSON_PROPERTY_X5T,
    Jwk.JSON_PROPERTY_X5T_HASH_S256,
    Jwk.JSON_PROPERTY_X5U,
    Jwk.JSON_PROPERTY_Y
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-09-04T10:11:22.635226-04:00[America/New_York]",
        comments = "Generator version: 7.8.0")
public class Jwk {
    public static final String JSON_PROPERTY_ALG = "alg";
    private String alg;

    public static final String JSON_PROPERTY_CRV = "crv";
    private String crv;

    public static final String JSON_PROPERTY_D = "d";
    private String d;

    public static final String JSON_PROPERTY_DP = "dp";
    private String dp;

    public static final String JSON_PROPERTY_DQ = "dq";
    private String dq;

    public static final String JSON_PROPERTY_E = "e";
    private String e;

    public static final String JSON_PROPERTY_KEY_OPS = "key_ops";
    private List<String> keyOps = new ArrayList<>();

    public static final String JSON_PROPERTY_KID = "kid";
    private String kid;

    public static final String JSON_PROPERTY_KTY = "kty";
    private String kty;

    public static final String JSON_PROPERTY_N = "n";
    private String n;

    public static final String JSON_PROPERTY_OTH = "oth";
    private List<OtherPrime> oth = new ArrayList<>();

    public static final String JSON_PROPERTY_P = "p";
    private String p;

    public static final String JSON_PROPERTY_Q = "q";
    private String q;

    public static final String JSON_PROPERTY_QI = "qi";
    private String qi;

    public static final String JSON_PROPERTY_USE = "use";
    private String use;

    public static final String JSON_PROPERTY_X = "x";
    private String x;

    public static final String JSON_PROPERTY_X5C = "x5c";
    private List<String> x5c = new ArrayList<>();

    public static final String JSON_PROPERTY_X5T = "x5t";
    private String x5t;

    public static final String JSON_PROPERTY_X5T_HASH_S256 = "x5t#S256";
    private String x5tHashS256;

    public static final String JSON_PROPERTY_X5U = "x5u";
    private String x5u;

    public static final String JSON_PROPERTY_Y = "y";
    private String y;

    public Jwk() {}

    public Jwk alg(String alg) {
        this.alg = alg;
        return this;
    }

    /**
     * Algorithm intended for use with the key.
     *
     * @return alg
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ALG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAlg() {
        return alg;
    }

    @JsonProperty(JSON_PROPERTY_ALG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAlg(String alg) {
        this.alg = alg;
    }

    public Jwk crv(String crv) {
        this.crv = crv;
        return this;
    }

    /**
     * Curve for ECC Public Keys.
     *
     * @return crv
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CRV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCrv() {
        return crv;
    }

    @JsonProperty(JSON_PROPERTY_CRV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCrv(String crv) {
        this.crv = crv;
    }

    public Jwk d(String d) {
        this.d = d;
        return this;
    }

    /**
     * ECC Private Key or RSA Private Exponent.
     *
     * @return d
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getD() {
        return d;
    }

    @JsonProperty(JSON_PROPERTY_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setD(String d) {
        this.d = d;
    }

    public Jwk dp(String dp) {
        this.dp = dp;
        return this;
    }

    /**
     * First Factor CRT Exponent for RSA.
     *
     * @return dp
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDp() {
        return dp;
    }

    @JsonProperty(JSON_PROPERTY_DP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDp(String dp) {
        this.dp = dp;
    }

    public Jwk dq(String dq) {
        this.dq = dq;
        return this;
    }

    /**
     * Second Factor CRT Exponent for RSA.
     *
     * @return dq
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DQ)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDq() {
        return dq;
    }

    @JsonProperty(JSON_PROPERTY_DQ)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDq(String dq) {
        this.dq = dq;
    }

    public Jwk e(String e) {
        this.e = e;
        return this;
    }

    /**
     * Exponent for RSA Public Key.
     *
     * @return e
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getE() {
        return e;
    }

    @JsonProperty(JSON_PROPERTY_E)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setE(String e) {
        this.e = e;
    }

    public Jwk keyOps(List<String> keyOps) {
        this.keyOps = keyOps;
        return this;
    }

    public Jwk addKeyOpsItem(String keyOpsItem) {
        if (this.keyOps == null) {
            this.keyOps = new ArrayList<>();
        }
        this.keyOps.add(keyOpsItem);
        return this;
    }

    /**
     * Intended key operations, e.g., sign, verify.
     *
     * @return keyOps
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_KEY_OPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getKeyOps() {
        return keyOps;
    }

    @JsonProperty(JSON_PROPERTY_KEY_OPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setKeyOps(List<String> keyOps) {
        this.keyOps = keyOps;
    }

    public Jwk kid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Key ID.
     *
     * @return kid
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_KID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getKid() {
        return kid;
    }

    @JsonProperty(JSON_PROPERTY_KID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setKid(String kid) {
        this.kid = kid;
    }

    public Jwk kty(String kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Key Type.
     *
     * @return kty
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_KTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getKty() {
        return kty;
    }

    @JsonProperty(JSON_PROPERTY_KTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setKty(String kty) {
        this.kty = kty;
    }

    public Jwk n(String n) {
        this.n = n;
        return this;
    }

    /**
     * Modulus for RSA Public Key.
     *
     * @return n
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_N)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getN() {
        return n;
    }

    @JsonProperty(JSON_PROPERTY_N)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setN(String n) {
        this.n = n;
    }

    public Jwk oth(List<OtherPrime> oth) {
        this.oth = oth;
        return this;
    }

    public Jwk addOthItem(OtherPrime othItem) {
        if (this.oth == null) {
            this.oth = new ArrayList<>();
        }
        this.oth.add(othItem);
        return this;
    }

    /**
     * Other Primes Info not represented by the first two primes.
     *
     * @return oth
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<OtherPrime> getOth() {
        return oth;
    }

    @JsonProperty(JSON_PROPERTY_OTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOth(List<OtherPrime> oth) {
        this.oth = oth;
    }

    public Jwk p(String p) {
        this.p = p;
        return this;
    }

    /**
     * First Prime Factor for RSA.
     *
     * @return p
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_P)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getP() {
        return p;
    }

    @JsonProperty(JSON_PROPERTY_P)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setP(String p) {
        this.p = p;
    }

    public Jwk q(String q) {
        this.q = q;
        return this;
    }

    /**
     * Second Prime Factor for RSA.
     *
     * @return q
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_Q)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQ() {
        return q;
    }

    @JsonProperty(JSON_PROPERTY_Q)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQ(String q) {
        this.q = q;
    }

    public Jwk qi(String qi) {
        this.qi = qi;
        return this;
    }

    /**
     * First CRT Coefficient for RSA.
     *
     * @return qi
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_QI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQi() {
        return qi;
    }

    @JsonProperty(JSON_PROPERTY_QI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQi(String qi) {
        this.qi = qi;
    }

    public Jwk use(String use) {
        this.use = use;
        return this;
    }

    /**
     * Public key use, e.g., sig (signature) or enc (encryption).
     *
     * @return use
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_USE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUse() {
        return use;
    }

    @JsonProperty(JSON_PROPERTY_USE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUse(String use) {
        this.use = use;
    }

    public Jwk x(String x) {
        this.x = x;
        return this;
    }

    /**
     * X Coordinate for ECC Public Keys.
     *
     * @return x
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_X)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getX() {
        return x;
    }

    @JsonProperty(JSON_PROPERTY_X)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setX(String x) {
        this.x = x;
    }

    public Jwk x5c(List<String> x5c) {
        this.x5c = x5c;
        return this;
    }

    public Jwk addX5cItem(String x5cItem) {
        if (this.x5c == null) {
            this.x5c = new ArrayList<>();
        }
        this.x5c.add(x5cItem);
        return this;
    }

    /**
     * X.509 Certificate Chain.
     *
     * @return x5c
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_X5C)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getX5c() {
        return x5c;
    }

    @JsonProperty(JSON_PROPERTY_X5C)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setX5c(List<String> x5c) {
        this.x5c = x5c;
    }

    public Jwk x5t(String x5t) {
        this.x5t = x5t;
        return this;
    }

    /**
     * X.509 Certificate SHA-1 Thumbprint.
     *
     * @return x5t
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_X5T)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getX5t() {
        return x5t;
    }

    @JsonProperty(JSON_PROPERTY_X5T)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setX5t(String x5t) {
        this.x5t = x5t;
    }

    public Jwk x5tHashS256(String x5tHashS256) {
        this.x5tHashS256 = x5tHashS256;
        return this;
    }

    /**
     * X.509 Certificate SHA-256 Thumbprint.
     *
     * @return x5tHashS256
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_X5T_HASH_S256)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getX5tHashS256() {
        return x5tHashS256;
    }

    @JsonProperty(JSON_PROPERTY_X5T_HASH_S256)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setX5tHashS256(String x5tHashS256) {
        this.x5tHashS256 = x5tHashS256;
    }

    public Jwk x5u(String x5u) {
        this.x5u = x5u;
        return this;
    }

    /**
     * X.509 URL.
     *
     * @return x5u
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_X5U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getX5u() {
        return x5u;
    }

    @JsonProperty(JSON_PROPERTY_X5U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setX5u(String x5u) {
        this.x5u = x5u;
    }

    public Jwk y(String y) {
        this.y = y;
        return this;
    }

    /**
     * Y Coordinate for ECC Public Keys.
     *
     * @return y
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_Y)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getY() {
        return y;
    }

    @JsonProperty(JSON_PROPERTY_Y)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setY(String y) {
        this.y = y;
    }

    /** Return true if this jwk object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Jwk jwk = (Jwk) o;
        return Objects.equals(this.alg, jwk.alg)
                && Objects.equals(this.crv, jwk.crv)
                && Objects.equals(this.d, jwk.d)
                && Objects.equals(this.dp, jwk.dp)
                && Objects.equals(this.dq, jwk.dq)
                && Objects.equals(this.e, jwk.e)
                && Objects.equals(this.keyOps, jwk.keyOps)
                && Objects.equals(this.kid, jwk.kid)
                && Objects.equals(this.kty, jwk.kty)
                && Objects.equals(this.n, jwk.n)
                && Objects.equals(this.oth, jwk.oth)
                && Objects.equals(this.p, jwk.p)
                && Objects.equals(this.q, jwk.q)
                && Objects.equals(this.qi, jwk.qi)
                && Objects.equals(this.use, jwk.use)
                && Objects.equals(this.x, jwk.x)
                && Objects.equals(this.x5c, jwk.x5c)
                && Objects.equals(this.x5t, jwk.x5t)
                && Objects.equals(this.x5tHashS256, jwk.x5tHashS256)
                && Objects.equals(this.x5u, jwk.x5u)
                && Objects.equals(this.y, jwk.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                alg,
                crv,
                d,
                dp,
                dq,
                e,
                keyOps,
                kid,
                kty,
                n,
                oth,
                p,
                q,
                qi,
                use,
                x,
                x5c,
                x5t,
                x5tHashS256,
                x5u,
                y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Jwk {\n");
        sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
        sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
        sb.append("    d: ").append(toIndentedString(d)).append("\n");
        sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
        sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
        sb.append("    e: ").append(toIndentedString(e)).append("\n");
        sb.append("    keyOps: ").append(toIndentedString(keyOps)).append("\n");
        sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
        sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
        sb.append("    n: ").append(toIndentedString(n)).append("\n");
        sb.append("    oth: ").append(toIndentedString(oth)).append("\n");
        sb.append("    p: ").append(toIndentedString(p)).append("\n");
        sb.append("    q: ").append(toIndentedString(q)).append("\n");
        sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
        sb.append("    use: ").append(toIndentedString(use)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
        sb.append("    x5t: ").append(toIndentedString(x5t)).append("\n");
        sb.append("    x5tHashS256: ").append(toIndentedString(x5tHashS256)).append("\n");
        sb.append("    x5u: ").append(toIndentedString(x5u)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

        // add `alg` to the URL query string
        if (getAlg() != null) {
            joiner.add(
                    String.format(
                            "%salg%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getAlg()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `crv` to the URL query string
        if (getCrv() != null) {
            joiner.add(
                    String.format(
                            "%scrv%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getCrv()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `d` to the URL query string
        if (getD() != null) {
            joiner.add(
                    String.format(
                            "%sd%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getD()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `dp` to the URL query string
        if (getDp() != null) {
            joiner.add(
                    String.format(
                            "%sdp%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getDp()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `dq` to the URL query string
        if (getDq() != null) {
            joiner.add(
                    String.format(
                            "%sdq%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getDq()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `e` to the URL query string
        if (getE() != null) {
            joiner.add(
                    String.format(
                            "%se%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getE()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `key_ops` to the URL query string
        if (getKeyOps() != null) {
            for (int i = 0; i < getKeyOps().size(); i++) {
                joiner.add(
                        String.format(
                                "%skey_ops%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                ApiClient.valueToString(getKeyOps().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `kid` to the URL query string
        if (getKid() != null) {
            joiner.add(
                    String.format(
                            "%skid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getKid()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `kty` to the URL query string
        if (getKty() != null) {
            joiner.add(
                    String.format(
                            "%skty%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getKty()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `n` to the URL query string
        if (getN() != null) {
            joiner.add(
                    String.format(
                            "%sn%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getN()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `oth` to the URL query string
        if (getOth() != null) {
            for (int i = 0; i < getOth().size(); i++) {
                if (getOth().get(i) != null) {
                    joiner.add(
                            getOth().get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%soth%s%s",
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

        // add `p` to the URL query string
        if (getP() != null) {
            joiner.add(
                    String.format(
                            "%sp%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getP()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `q` to the URL query string
        if (getQ() != null) {
            joiner.add(
                    String.format(
                            "%sq%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getQ()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `qi` to the URL query string
        if (getQi() != null) {
            joiner.add(
                    String.format(
                            "%sqi%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getQi()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `use` to the URL query string
        if (getUse() != null) {
            joiner.add(
                    String.format(
                            "%suse%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getUse()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `x` to the URL query string
        if (getX() != null) {
            joiner.add(
                    String.format(
                            "%sx%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getX()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `x5c` to the URL query string
        if (getX5c() != null) {
            for (int i = 0; i < getX5c().size(); i++) {
                joiner.add(
                        String.format(
                                "%sx5c%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                ApiClient.valueToString(getX5c().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        // add `x5t` to the URL query string
        if (getX5t() != null) {
            joiner.add(
                    String.format(
                            "%sx5t%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getX5t()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `x5t#S256` to the URL query string
        if (getX5tHashS256() != null) {
            joiner.add(
                    String.format(
                            "%sx5t#S256%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getX5tHashS256()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `x5u` to the URL query string
        if (getX5u() != null) {
            joiner.add(
                    String.format(
                            "%sx5u%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getX5u()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `y` to the URL query string
        if (getY() != null) {
            joiner.add(
                    String.format(
                            "%sy%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            ApiClient.valueToString(getY()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
