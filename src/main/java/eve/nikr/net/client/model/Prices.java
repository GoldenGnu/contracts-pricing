/*
 * Contract Appraisal
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eve.nikr.net.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Prices
 */

public class Prices implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_TYPE_NAME = "type_name";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_MEDIAN = "median";
  @SerializedName(SERIALIZED_NAME_MEDIAN)
  private Long median;

  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private Long average;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Long minimum;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Long maximum;

  public static final String SERIALIZED_NAME_FIVE_PERCENT = "fivePercent";
  @SerializedName(SERIALIZED_NAME_FIVE_PERCENT)
  private Long fivePercent;

  public static final String SERIALIZED_NAME_CONTRACTS = "contracts";
  @SerializedName(SERIALIZED_NAME_CONTRACTS)
  private Integer contracts;

  public Prices typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Prices typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(example = "Damage Control II Blueprint", required = true, value = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Prices median(Long median) {
    this.median = median;
    return this;
  }

   /**
   * Get median
   * @return median
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMedian() {
    return median;
  }

  public void setMedian(Long median) {
    this.median = median;
  }

  public Prices average(Long average) {
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getAverage() {
    return average;
  }

  public void setAverage(Long average) {
    this.average = average;
  }

  public Prices minimum(Long minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMinimum() {
    return minimum;
  }

  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }

  public Prices maximum(Long maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMaximum() {
    return maximum;
  }

  public void setMaximum(Long maximum) {
    this.maximum = maximum;
  }

  public Prices fivePercent(Long fivePercent) {
    this.fivePercent = fivePercent;
    return this;
  }

   /**
   * Get fivePercent
   * @return fivePercent
  **/
  @ApiModelProperty(value = "")
  public Long getFivePercent() {
    return fivePercent;
  }

  public void setFivePercent(Long fivePercent) {
    this.fivePercent = fivePercent;
  }

  public Prices contracts(Integer contracts) {
    this.contracts = contracts;
    return this;
  }

   /**
   * Get contracts
   * @return contracts
  **/
  @ApiModelProperty(value = "")
  public Integer getContracts() {
    return contracts;
  }

  public void setContracts(Integer contracts) {
    this.contracts = contracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prices prices = (Prices) o;
    return Objects.equals(this.typeId, prices.typeId) &&
        Objects.equals(this.typeName, prices.typeName) &&
        Objects.equals(this.median, prices.median) &&
        Objects.equals(this.average, prices.average) &&
        Objects.equals(this.minimum, prices.minimum) &&
        Objects.equals(this.maximum, prices.maximum) &&
        Objects.equals(this.fivePercent, prices.fivePercent) &&
        Objects.equals(this.contracts, prices.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, typeName, median, average, minimum, maximum, fivePercent, contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prices {\n");
    
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    fivePercent: ").append(toIndentedString(fivePercent)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
