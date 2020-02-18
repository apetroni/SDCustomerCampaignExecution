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
 * BQAnalysisRequestOutputModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRequestOutputModel   {
  @JsonProperty("analysisRequestActionTaskReference")
  private String analysisRequestActionTaskReference = null;

  @JsonProperty("analysisRequestActionTaskRecord")
  private Object analysisRequestActionTaskRecord = null;

  @JsonProperty("analysisRequestRecordReference")
  private String analysisRequestRecordReference = null;

  @JsonProperty("requestResponseRecord")
  private Object requestResponseRecord = null;

  public BQAnalysisRequestOutputModel analysisRequestActionTaskReference(String analysisRequestActionTaskReference) {
    this.analysisRequestActionTaskReference = analysisRequestActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance request service call 
   * @return analysisRequestActionTaskReference
  **/
  @ApiModelProperty(example = "ARATR746185", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance request service call ")
  
    public String getAnalysisRequestActionTaskReference() {
    return analysisRequestActionTaskReference;
  }

  public void setAnalysisRequestActionTaskReference(String analysisRequestActionTaskReference) {
    this.analysisRequestActionTaskReference = analysisRequestActionTaskReference;
  }

  public BQAnalysisRequestOutputModel analysisRequestActionTaskRecord(Object analysisRequestActionTaskRecord) {
    this.analysisRequestActionTaskRecord = analysisRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return analysisRequestActionTaskRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  
    public Object getAnalysisRequestActionTaskRecord() {
    return analysisRequestActionTaskRecord;
  }

  public void setAnalysisRequestActionTaskRecord(Object analysisRequestActionTaskRecord) {
    this.analysisRequestActionTaskRecord = analysisRequestActionTaskRecord;
  }

  public BQAnalysisRequestOutputModel analysisRequestRecordReference(String analysisRequestRecordReference) {
    this.analysisRequestRecordReference = analysisRequestRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis service request record 
   * @return analysisRequestRecordReference
  **/
  @ApiModelProperty(example = "ARRR754280", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Analysis service request record ")
  
    public String getAnalysisRequestRecordReference() {
    return analysisRequestRecordReference;
  }

  public void setAnalysisRequestRecordReference(String analysisRequestRecordReference) {
    this.analysisRequestRecordReference = analysisRequestRecordReference;
  }

  public BQAnalysisRequestOutputModel requestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response ")
  
    public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRequestOutputModel bqAnalysisRequestOutputModel = (BQAnalysisRequestOutputModel) o;
    return Objects.equals(this.analysisRequestActionTaskReference, bqAnalysisRequestOutputModel.analysisRequestActionTaskReference) &&
        Objects.equals(this.analysisRequestActionTaskRecord, bqAnalysisRequestOutputModel.analysisRequestActionTaskRecord) &&
        Objects.equals(this.analysisRequestRecordReference, bqAnalysisRequestOutputModel.analysisRequestRecordReference) &&
        Objects.equals(this.requestResponseRecord, bqAnalysisRequestOutputModel.requestResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisRequestActionTaskReference, analysisRequestActionTaskRecord, analysisRequestRecordReference, requestResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRequestOutputModel {\n");
    
    sb.append("    analysisRequestActionTaskReference: ").append(toIndentedString(analysisRequestActionTaskReference)).append("\n");
    sb.append("    analysisRequestActionTaskRecord: ").append(toIndentedString(analysisRequestActionTaskRecord)).append("\n");
    sb.append("    analysisRequestRecordReference: ").append(toIndentedString(analysisRequestRecordReference)).append("\n");
    sb.append("    requestResponseRecord: ").append(toIndentedString(requestResponseRecord)).append("\n");
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
