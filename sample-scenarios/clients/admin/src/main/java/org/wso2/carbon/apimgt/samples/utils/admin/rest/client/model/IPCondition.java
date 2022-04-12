/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.1.66/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.ThrottleCondition;

/**
 * IPCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T13:06:20.200+05:30")
public class IPCondition extends ThrottleCondition {
  /**
   * Type of the IP condition. Allowed values are \"IPRange\" and \"IPSpecific\"
   */
  public enum IpConditionTypeEnum {
    @SerializedName("IPRange")
    IPRANGE("IPRange"),
    
    @SerializedName("IPSpecific")
    IPSPECIFIC("IPSpecific");

    private String value;

    IpConditionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ipConditionType")
  private IpConditionTypeEnum ipConditionType = null;

  @SerializedName("specificIP")
  private String specificIP = null;

  @SerializedName("startingIP")
  private String startingIP = null;

  @SerializedName("endingIP")
  private String endingIP = null;

  public IPCondition ipConditionType(IpConditionTypeEnum ipConditionType) {
    this.ipConditionType = ipConditionType;
    return this;
  }

   /**
   * Type of the IP condition. Allowed values are \"IPRange\" and \"IPSpecific\"
   * @return ipConditionType
  **/
  @ApiModelProperty(example = "null", value = "Type of the IP condition. Allowed values are \"IPRange\" and \"IPSpecific\"")
  public IpConditionTypeEnum getIpConditionType() {
    return ipConditionType;
  }

  public void setIpConditionType(IpConditionTypeEnum ipConditionType) {
    this.ipConditionType = ipConditionType;
  }

  public IPCondition specificIP(String specificIP) {
    this.specificIP = specificIP;
    return this;
  }

   /**
   * Specific IP when \"IPSpecific\" is used as the ipConditionType
   * @return specificIP
  **/
  @ApiModelProperty(example = "null", value = "Specific IP when \"IPSpecific\" is used as the ipConditionType")
  public String getSpecificIP() {
    return specificIP;
  }

  public void setSpecificIP(String specificIP) {
    this.specificIP = specificIP;
  }

  public IPCondition startingIP(String startingIP) {
    this.startingIP = startingIP;
    return this;
  }

   /**
   * Staring IP when \"IPRange\" is used as the ipConditionType
   * @return startingIP
  **/
  @ApiModelProperty(example = "null", value = "Staring IP when \"IPRange\" is used as the ipConditionType")
  public String getStartingIP() {
    return startingIP;
  }

  public void setStartingIP(String startingIP) {
    this.startingIP = startingIP;
  }

  public IPCondition endingIP(String endingIP) {
    this.endingIP = endingIP;
    return this;
  }

   /**
   * Ending IP when \"IPRange\" is used as the ipConditionType
   * @return endingIP
  **/
  @ApiModelProperty(example = "null", value = "Ending IP when \"IPRange\" is used as the ipConditionType")
  public String getEndingIP() {
    return endingIP;
  }

  public void setEndingIP(String endingIP) {
    this.endingIP = endingIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPCondition ipCondition = (IPCondition) o;
    return Objects.equals(this.ipConditionType, ipCondition.ipConditionType) &&
        Objects.equals(this.specificIP, ipCondition.specificIP) &&
        Objects.equals(this.startingIP, ipCondition.startingIP) &&
        Objects.equals(this.endingIP, ipCondition.endingIP) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipConditionType, specificIP, startingIP, endingIP, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipConditionType: ").append(toIndentedString(ipConditionType)).append("\n");
    sb.append("    specificIP: ").append(toIndentedString(specificIP)).append("\n");
    sb.append("    startingIP: ").append(toIndentedString(startingIP)).append("\n");
    sb.append("    endingIP: ").append(toIndentedString(endingIP)).append("\n");
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

