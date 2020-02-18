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
 * InlineResponse20010
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class InlineResponse20010   {
  @JsonProperty("candidateSelectionExchangeActionTaskReference")
  private String candidateSelectionExchangeActionTaskReference = null;

  @JsonProperty("candidateSelectionExchangeActionTaskRecord")
  private Object candidateSelectionExchangeActionTaskRecord = null;

  @JsonProperty("candidateSelectionExchangeActionResponse")
  private String candidateSelectionExchangeActionResponse = null;

  @JsonProperty("candidateSelectionInstanceStatus")
  private String candidateSelectionInstanceStatus = null;

  public InlineResponse20010 candidateSelectionExchangeActionTaskReference(String candidateSelectionExchangeActionTaskReference) {
    this.candidateSelectionExchangeActionTaskReference = candidateSelectionExchangeActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Candidate Selection instance exchange service call 
   * @return candidateSelectionExchangeActionTaskReference
  **/
  @ApiModelProperty(example = "CSEATR790034", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Candidate Selection instance exchange service call ")
  
    public String getCandidateSelectionExchangeActionTaskReference() {
    return candidateSelectionExchangeActionTaskReference;
  }

  public void setCandidateSelectionExchangeActionTaskReference(String candidateSelectionExchangeActionTaskReference) {
    this.candidateSelectionExchangeActionTaskReference = candidateSelectionExchangeActionTaskReference;
  }

  public InlineResponse20010 candidateSelectionExchangeActionTaskRecord(Object candidateSelectionExchangeActionTaskRecord) {
    this.candidateSelectionExchangeActionTaskRecord = candidateSelectionExchangeActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return candidateSelectionExchangeActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  
    public Object getCandidateSelectionExchangeActionTaskRecord() {
    return candidateSelectionExchangeActionTaskRecord;
  }

  public void setCandidateSelectionExchangeActionTaskRecord(Object candidateSelectionExchangeActionTaskRecord) {
    this.candidateSelectionExchangeActionTaskRecord = candidateSelectionExchangeActionTaskRecord;
  }

  public InlineResponse20010 candidateSelectionExchangeActionResponse(String candidateSelectionExchangeActionResponse) {
    this.candidateSelectionExchangeActionResponse = candidateSelectionExchangeActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return candidateSelectionExchangeActionResponse
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")
  
    public String getCandidateSelectionExchangeActionResponse() {
    return candidateSelectionExchangeActionResponse;
  }

  public void setCandidateSelectionExchangeActionResponse(String candidateSelectionExchangeActionResponse) {
    this.candidateSelectionExchangeActionResponse = candidateSelectionExchangeActionResponse;
  }

  public InlineResponse20010 candidateSelectionInstanceStatus(String candidateSelectionInstanceStatus) {
    this.candidateSelectionInstanceStatus = candidateSelectionInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Candidate Selection instance (e.g. accepted, rejected, verified) 
   * @return candidateSelectionInstanceStatus
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Candidate Selection instance (e.g. accepted, rejected, verified) ")
  
    public String getCandidateSelectionInstanceStatus() {
    return candidateSelectionInstanceStatus;
  }

  public void setCandidateSelectionInstanceStatus(String candidateSelectionInstanceStatus) {
    this.candidateSelectionInstanceStatus = candidateSelectionInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.candidateSelectionExchangeActionTaskReference, inlineResponse20010.candidateSelectionExchangeActionTaskReference) &&
        Objects.equals(this.candidateSelectionExchangeActionTaskRecord, inlineResponse20010.candidateSelectionExchangeActionTaskRecord) &&
        Objects.equals(this.candidateSelectionExchangeActionResponse, inlineResponse20010.candidateSelectionExchangeActionResponse) &&
        Objects.equals(this.candidateSelectionInstanceStatus, inlineResponse20010.candidateSelectionInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateSelectionExchangeActionTaskReference, candidateSelectionExchangeActionTaskRecord, candidateSelectionExchangeActionResponse, candidateSelectionInstanceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    candidateSelectionExchangeActionTaskReference: ").append(toIndentedString(candidateSelectionExchangeActionTaskReference)).append("\n");
    sb.append("    candidateSelectionExchangeActionTaskRecord: ").append(toIndentedString(candidateSelectionExchangeActionTaskRecord)).append("\n");
    sb.append("    candidateSelectionExchangeActionResponse: ").append(toIndentedString(candidateSelectionExchangeActionResponse)).append("\n");
    sb.append("    candidateSelectionInstanceStatus: ").append(toIndentedString(candidateSelectionInstanceStatus)).append("\n");
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
