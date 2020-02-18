package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQAnalysisUpdateOutputModelCustomerCampaignProcedureInstanceRecord1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20015
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse20015   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQAnalysisUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("analysisUpdateActionTaskReference")
  private String analysisUpdateActionTaskReference = null;

  @JsonProperty("analysisUpdateActionTaskRecord")
  private Object analysisUpdateActionTaskRecord = null;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord = null;

  public InlineResponse20015 customerCampaignProcedureInstanceRecord(BQAnalysisUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQAnalysisUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQAnalysisUpdateOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public InlineResponse20015 analysisUpdateActionTaskReference(String analysisUpdateActionTaskReference) {
    this.analysisUpdateActionTaskReference = analysisUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return analysisUpdateActionTaskReference
  **/
  @ApiModelProperty(example = "AUATR763899", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  
    public String getAnalysisUpdateActionTaskReference() {
    return analysisUpdateActionTaskReference;
  }

  public void setAnalysisUpdateActionTaskReference(String analysisUpdateActionTaskReference) {
    this.analysisUpdateActionTaskReference = analysisUpdateActionTaskReference;
  }

  public InlineResponse20015 analysisUpdateActionTaskRecord(Object analysisUpdateActionTaskRecord) {
    this.analysisUpdateActionTaskRecord = analysisUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return analysisUpdateActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  
    public Object getAnalysisUpdateActionTaskRecord() {
    return analysisUpdateActionTaskRecord;
  }

  public void setAnalysisUpdateActionTaskRecord(Object analysisUpdateActionTaskRecord) {
    this.analysisUpdateActionTaskRecord = analysisUpdateActionTaskRecord;
  }

  public InlineResponse20015 updateResponseRecord(Object updateResponseRecord) {
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
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, inlineResponse20015.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.analysisUpdateActionTaskReference, inlineResponse20015.analysisUpdateActionTaskReference) &&
        Objects.equals(this.analysisUpdateActionTaskRecord, inlineResponse20015.analysisUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse20015.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, analysisUpdateActionTaskReference, analysisUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    analysisUpdateActionTaskReference: ").append(toIndentedString(analysisUpdateActionTaskReference)).append("\n");
    sb.append("    analysisUpdateActionTaskRecord: ").append(toIndentedString(analysisUpdateActionTaskRecord)).append("\n");
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
