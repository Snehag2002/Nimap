package Sneha.nimap.example.SnehaNimapApplication.Exception;


public class Response {

    private String message;
    private boolean success;

    public Response(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
