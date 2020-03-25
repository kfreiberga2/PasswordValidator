public class CalculatResult {
    public CalculatResult(float result, boolean isSuccess, String errorMessage) {
        this.result = result;
        this.isSuccess = isSuccess;
        this.errorMessage = errorMessage;
    }
    public float getResult() {
        return result;
    }
    public void setResult(float result) {
        this.result = result;
    }
    public boolean isSuccess() {
        return isSuccess;
    }
    public void setSuccess(boolean success) {
        isSuccess = success;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    private float result;
    private boolean isSuccess;
    private String errorMessage;
}
