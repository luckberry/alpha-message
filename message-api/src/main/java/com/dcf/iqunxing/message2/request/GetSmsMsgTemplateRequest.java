package com.dcf.iqunxing.message2.request;

public class GetSmsMsgTemplateRequest extends BaseRequest {

    private static final long serialVersionUID = -5881563637406488234L;

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
