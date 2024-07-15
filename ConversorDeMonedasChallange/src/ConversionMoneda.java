import com.google.gson.annotations.SerializedName;

public class ConversionMoneda {

    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("target_code")
    private String targetCode;
    @SerializedName("conversion_result")
    private double conversionResult;
    private double value;


    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Su cantidad en la divisa es = " + conversionResult + "(" + targetCode + ")";
    }

    void mostrarMonedas(){
        System.out.println( value + " " +  baseCode + " equivalen a " + conversionResult + " " + targetCode);
    }

}


