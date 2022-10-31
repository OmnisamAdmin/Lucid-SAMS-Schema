package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.QuaterlyRecievedTransfer;

public class QuaterlyRecievedTransferResponse extends ApiResponse {

    private static final long serialVersionUID = 8266130819635345832L;

    private QuaterlyRecievedTransfer quaterlyRecievedTransfer;

    public QuaterlyRecievedTransfer getQuaterlyRecievedTransfer() {
        return quaterlyRecievedTransfer;
    }

    public void setQuaterlyRecievedTransfer(QuaterlyRecievedTransfer quaterlyRecievedTransfer) {
        this.quaterlyRecievedTransfer = quaterlyRecievedTransfer;
    }
}