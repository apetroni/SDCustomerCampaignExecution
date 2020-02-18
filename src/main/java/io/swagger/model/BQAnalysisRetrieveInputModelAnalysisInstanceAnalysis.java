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
 * BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T00:24:46.166Z[GMT]")
public class BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis   {
  @JsonProperty("analysisInstanceAnalysisReference")
  private String analysisInstanceAnalysisReference = null;

  public BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis analysisInstanceAnalysisReference(String analysisInstanceAnalysisReference) {
    this.analysisInstanceAnalysisReference = analysisInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return analysisInstanceAnalysisReference
  **/
  @ApiModelProperty(example = "758317", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  
    public String getAnalysisInstanceAnalysisReference() {
    return analysisInstanceAnalysisReference;
  }

  public void setAnalysisInstanceAnalysisReference(String analysisInstanceAnalysisReference) {
    this.analysisInstanceAnalysisReference = analysisInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis bqAnalysisRetrieveInputModelAnalysisInstanceAnalysis = (BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis) o;
    return Objects.equals(this.analysisInstanceAnalysisReference, bqAnalysisRetrieveInputModelAnalysisInstanceAnalysis.analysisInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis {\n");
    
    sb.append("    analysisInstanceAnalysisReference: ").append(toIndentedString(analysisInstanceAnalysisReference)).append("\n");
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
