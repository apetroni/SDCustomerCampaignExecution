package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2003   {
  @JsonProperty("customerCampaignProcedureUpdateActionTaskReference")
  private String customerCampaignProcedureUpdateActionTaskReference = null;

  @JsonProperty("customerCampaignProcedureUpdateActionTaskRecord")
  private Object customerCampaignProcedureUpdateActionTaskRecord = null;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord = null;

  public InlineResponse2003 customerCampaignProcedureUpdateActionTaskReference(String customerCampaignProcedureUpdateActionTaskReference) {
    this.customerCampaignProcedureUpdateActionTaskReference = customerCampaignProcedureUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerCampaignProcedureUpdateActionTaskReference
  **/
  @ApiModelProperty(example = "CCPUATR708360", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  
    public String getCustomerCampaignProcedureUpdateActionTaskReference() {
    return customerCampaignProcedureUpdateActionTaskReference;
  }

  public void setCustomerCampaignProcedureUpdateActionTaskReference(String customerCampaignProcedureUpdateActionTaskReference) {
    this.customerCampaignProcedureUpdateActionTaskReference = customerCampaignProcedureUpdateActionTaskReference;
  }

  public InlineResponse2003 customerCampaignProcedureUpdateActionTaskRecord(Object customerCampaignProcedureUpdateActionTaskRecord) {
    this.customerCampaignProcedureUpdateActionTaskRecord = customerCampaignProcedureUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCampaignProcedureUpdateActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  
    public Object getCustomerCampaignProcedureUpdateActionTaskRecord() {
    return customerCampaignProcedureUpdateActionTaskRecord;
  }

  public void setCustomerCampaignProcedureUpdateActionTaskRecord(Object customerCampaignProcedureUpdateActionTaskRecord) {
    this.customerCampaignProcedureUpdateActionTaskRecord = customerCampaignProcedureUpdateActionTaskRecord;
  }

  public InlineResponse2003 updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")
  
    public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.customerCampaignProcedureUpdateActionTaskReference, inlineResponse2003.customerCampaignProcedureUpdateActionTaskReference) &&
        Objects.equals(this.customerCampaignProcedureUpdateActionTaskRecord, inlineResponse2003.customerCampaignProcedureUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse2003.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureUpdateActionTaskReference, customerCampaignProcedureUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    customerCampaignProcedureUpdateActionTaskReference: ").append(toIndentedString(customerCampaignProcedureUpdateActionTaskReference)).append("\n");
    sb.append("    customerCampaignProcedureUpdateActionTaskRecord: ").append(toIndentedString(customerCampaignProcedureUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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
