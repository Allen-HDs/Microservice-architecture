package com.gtstar.itoken.common.constants;

public enum  HttpStatusConstants {
    BAD_GATEWAY(502,"从上游服务器接收到无效的响应");
    private int status;
    private String contents;

    private HttpStatusConstants(int status, String contents) {
        this.status = status;
        this.contents = contents;
    }

    public int getStatus() {
        return status;
    }

    public String getContents() {
        return contents;
    }
}
