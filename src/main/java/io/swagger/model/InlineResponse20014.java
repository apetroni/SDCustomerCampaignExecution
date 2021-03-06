package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1;
import io.swagger.model.BQExecutionRetrieveOutputModelExecutionInstanceAnalysis1;
import io.swagger.model.BQExecutionRetrieveOutputModelExecutionInstanceRecord1;
import io.swagger.model.BQExecutionRetrieveOutputModelExecutionInstanceReport1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20014
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse20014   {
  @JsonProperty("customerCampaignProcedureInstanceRecord")
  private BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord = null;

  @JsonProperty("executionInstanceRecord")
  private BQExecutionRetrieveOutputModelExecutionInstanceRecord1 executionInstanceRecord = null;

  @JsonProperty("executionRetrieveActionTaskReference")
  private String executionRetrieveActionTaskReference = null;

  @JsonProperty("executionRetrieveActionTaskRecord")
  private Object executionRetrieveActionTaskRecord = null;

  @JsonProperty("executionRetrieveActionResponse")
  private String executionRetrieveActionResponse = null;

  @JsonProperty("executionInstanceReport")
  private BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReport = null;

  @JsonProperty("executionInstanceAnalysis")
  private BQExecutionRetrieveOutputModelExecutionInstanceAnalysis1 executionInstanceAnalysis = null;

  public InlineResponse20014 customerCampaignProcedureInstanceRecord(BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
    return this;
  }

  /**
   * Get customerCampaignProcedureInstanceRecord
   * @return customerCampaignProcedureInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 getCustomerCampaignProcedureInstanceRecord() {
    return customerCampaignProcedureInstanceRecord;
  }

  public void setCustomerCampaignProcedureInstanceRecord(BQExecutionRetrieveOutputModelCustomerCampaignProcedureInstanceRecord1 customerCampaignProcedureInstanceRecord) {
    this.customerCampaignProcedureInstanceRecord = customerCampaignProcedureInstanceRecord;
  }

  public InlineResponse20014 executionInstanceRecord(BQExecutionRetrieveOutputModelExecutionInstanceRecord1 executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
    return this;
  }

  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionRetrieveOutputModelExecutionInstanceRecord1 getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionRetrieveOutputModelExecutionInstanceRecord1 executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }

  public InlineResponse20014 executionRetrieveActionTaskReference(String executionRetrieveActionTaskReference) {
    this.executionRetrieveActionTaskReference = executionRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance retrieve service call 
   * @return executionRetrieveActionTaskReference
  **/
  @ApiModelProperty(example = "ERATR734644", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance retrieve service call ")
  
    public String getExecutionRetrieveActionTaskReference() {
    return executionRetrieveActionTaskReference;
  }

  public void setExecutionRetrieveActionTaskReference(String executionRetrieveActionTaskReference) {
    this.executionRetrieveActionTaskReference = executionRetrieveActionTaskReference;
  }

  public InlineResponse20014 executionRetrieveActionTaskRecord(Object executionRetrieveActionTaskRecord) {
    this.executionRetrieveActionTaskRecord = executionRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return executionRetrieveActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  
    public Object getExecutionRetrieveActionTaskRecord() {
    return executionRetrieveActionTaskRecord;
  }

  public void setExecutionRetrieveActionTaskRecord(Object executionRetrieveActionTaskRecord) {
    this.executionRetrieveActionTaskRecord = executionRetrieveActionTaskRecord;
  }

  public InlineResponse20014 executionRetrieveActionResponse(String executionRetrieveActionResponse) {
    this.executionRetrieveActionResponse = executionRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return executionRetrieveActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")
  
    public String getExecutionRetrieveActionResponse() {
    return executionRetrieveActionResponse;
  }

  public void setExecutionRetrieveActionResponse(String executionRetrieveActionResponse) {
    this.executionRetrieveActionResponse = executionRetrieveActionResponse;
  }

  public InlineResponse20014 executionInstanceReport(BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
    return this;
  }

  /**
   * Get executionInstanceReport
   * @return executionInstanceReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionRetrieveOutputModelExecutionInstanceReport1 getExecutionInstanceReport() {
    return executionInstanceReport;
  }

  public void setExecutionInstanceReport(BQExecutionRetrieveOutputModelExecutionInstanceReport1 executionInstanceReport) {
    this.executionInstanceReport = executionInstanceReport;
  }

  public InlineResponse20014 executionInstanceAnalysis(BQExecutionRetrieveOutputModelExecutionInstanceAnalysis1 executionInstanceAnalysis) {
    this.executionInstanceAnalysis = executionInstanceAnalysis;
    return this;
  }

  /**
   * Get executionInstanceAnalysis
   * @return executionInstanceAnalysis
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BQExecutionRetrieveOutputModelExecutionInstanceAnalysis1 getExecutionInstanceAnalysis() {
    return executionInstanceAnalysis;
  }

  public void setExecutionInstanceAnalysis(BQExecutionRetrieveOutputModelExecutionInstanceAnalysis1 executionInstanceAnalysis) {
    this.executionInstanceAnalysis = executionInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.customerCampaignProcedureInstanceRecord, inlineResponse20014.customerCampaignProcedureInstanceRecord) &&
        Objects.equals(this.executionInstanceRecord, inlineResponse20014.executionInstanceRecord) &&
        Objects.equals(this.executionRetrieveActionTaskReference, inlineResponse20014.executionRetrieveActionTaskReference) &&
        Objects.equals(this.executionRetrieveActionTaskRecord, inlineResponse20014.executionRetrieveActionTaskRecord) &&
        Objects.equals(this.executionRetrieveActionResponse, inlineResponse20014.executionRetrieveActionResponse) &&
        Objects.equals(this.executionInstanceReport, inlineResponse20014.executionInstanceReport) &&
        Objects.equals(this.executionInstanceAnalysis, inlineResponse20014.executionInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCampaignProcedureInstanceRecord, executionInstanceRecord, executionRetrieveActionTaskReference, executionRetrieveActionTaskRecord, executionRetrieveActionResponse, executionInstanceReport, executionInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    customerCampaignProcedureInstanceRecord: ").append(toIndentedString(customerCampaignProcedureInstanceRecord)).append("\n");
    sb.append("    executionInstanceRecord: ").append(toIndentedString(executionInstanceRecord)).append("\n");
    sb.append("    executionRetrieveActionTaskReference: ").append(toIndentedString(executionRetrieveActionTaskReference)).append("\n");
    sb.append("    executionRetrieveActionTaskRecord: ").append(toIndentedString(executionRetrieveActionTaskRecord)).append("\n");
    sb.append("    executionRetrieveActionResponse: ").append(toIndentedString(executionRetrieveActionResponse)).append("\n");
    sb.append("    executionInstanceReport: ").append(toIndentedString(executionInstanceReport)).append("\n");
    sb.append("    executionInstanceAnalysis: ").append(toIndentedString(executionInstanceAnalysis)).append("\n");
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
