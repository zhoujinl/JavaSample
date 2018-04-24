package com.jalon.mybatis.entity;

/**
 * Created by Jalon on 17/04/2018.
 */
public class Params {
    private int offset;
    private int pagesize;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}
