package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord;
import io.swagger.model.CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2009
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse2009   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("candidateSelectionInstanceRecord")
  private CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord = null;

  @JsonProperty("candidateSelectionUpdateActionTaskReference")
  private String candidateSelectionUpdateActionTaskReference = null;

  @JsonProperty("candidateSelectionUpdateActionTaskRecord")
  private Object candidateSelectionUpdateActionTaskRecord = null;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord = null;

  public InlineResponse2009 customerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCustomerCampaignProcedureInstanceRecord customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public InlineResponse2009 candidateSelectionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
    return this;
  }

  /**
   * Get candidateSelectionInstanceRecord
   * @return candidateSelectionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord getCandidateSelectionInstanceRecord() {
    return candidateSelectionInstanceRecord;
  }

  public void setCandidateSelectionInstanceRecord(CustomercampaignexecutionsdreferenceidcustomercampaignprocedurecrreferenceidcandidateselectionbqreferenceidupdateCandidateSelectionInstanceRecord candidateSelectionInstanceRecord) {
    this.candidateSelectionInstanceRecord = candidateSelectionInstanceRecord;
  }

  public InlineResponse2009 candidateSelectionUpdateActionTaskReference(String candidateSelectionUpdateActionTaskReference) {
    this.candidateSelectionUpdateActionTaskReference = candidateSelectionUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return candidateSelectionUpdateActionTaskReference
  **/
  @ApiModelProperty(example = "CSUATR763477", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  
    public String getCandidateSelectionUpdateActionTaskReference() {
    return candidateSelectionUpdateActionTaskReference;
  }

  public void setCandidateSelectionUpdateActionTaskReference(String candidateSelectionUpdateActionTaskReference) {
    this.candidateSelectionUpdateActionTaskReference = candidateSelectionUpdateActionTaskReference;
  }

  public InlineResponse2009 candidateSelectionUpdateActionTaskRecord(Object candidateSelectionUpdateActionTaskRecord) {
    this.candidateSelectionUpdateActionTaskRecord = candidateSelectionUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return candidateSelectionUpdateActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  
    public Object getCandidateSelectionUpdateActionTaskRecord() {
    return candidateSelectionUpdateActionTaskRecord;
  }

  public void setCandidateSelectionUpdateActionTaskRecord(Object candidateSelectionUpdateActionTaskRecord) {
    this.candidateSelectionUpdateActionTaskRecord = candidateSelectionUpdateActionTaskRecord;
  }

  public InlineResponse2009 updateResponseRecord(Object updateResponseRecord) {
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
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, inlineResponse2009.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.candidateSelectionInstanceRecord, inlineResponse2009.candidateSelectionInstanceRecord) &&
        Objects.equals(this.candidateSelectionUpdateActionTaskReference, inlineResponse2009.candidateSelectionUpdateActionTaskReference) &&
        Objects.equals(this.candidateSelectionUpdateActionTaskRecord, inlineResponse2009.candidateSelectionUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse2009.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, candidateSelectionInstanceRecord, candidateSelectionUpdateActionTaskReference, candidateSelectionUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    candidateSelectionInstanceRecord: ").append(toIndentedString(candidateSelectionInstanceRecord)).append("\n");
    sb.append("    candidateSelectionUpdateActionTaskReference: ").append(toIndentedString(candidateSelectionUpdateActionTaskReference)).append("\n");
    sb.append("    candidateSelectionUpdateActionTaskRecord: ").append(toIndentedString(candidateSelectionUpdateActionTaskRecord)).append("\n");
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
