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
 * BQAnalysisRetrieveInputModelAnalysisInstanceReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRetrieveInputModelAnalysisInstanceReport   {
  @JsonProperty("analysisInstanceReportReference")
  private String analysisInstanceReportReference = null;

  public BQAnalysisRetrieveInputModelAnalysisInstanceReport analysisInstanceReportReference(String analysisInstanceReportReference) {
    this.analysisInstanceReportReference = analysisInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return analysisInstanceReportReference
  **/
  @ApiModelProperty(example = "738483", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  
    public String getAnalysisInstanceReportReference() {
    return analysisInstanceReportReference;
  }

  public void setAnalysisInstanceReportReference(String analysisInstanceReportReference) {
    this.analysisInstanceReportReference = analysisInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRetrieveInputModelAnalysisInstanceReport bqAnalysisRetrieveInputModelAnalysisInstanceReport = (BQAnalysisRetrieveInputModelAnalysisInstanceReport) o;
    return Objects.equals(this.analysisInstanceReportReference, bqAnalysisRetrieveInputModelAnalysisInstanceReport.analysisInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRetrieveInputModelAnalysisInstanceReport {\n");
    
    sb.append("    analysisInstanceReportReference: ").append(toIndentedString(analysisInstanceReportReference)).append("\n");
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
