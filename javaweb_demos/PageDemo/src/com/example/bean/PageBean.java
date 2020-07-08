package com.example.bean;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private int totalRecord;//总记录数，请求传过来的
    private int totalPage;//总页数
    private int  pageNum;//当前页
    private int  pageSize;//每页显示的记录数,自己设置
    private int  startIndex;//开始索引 (起始页)

    //分页显示的页数 1，2，3，4，5 start 1 end 5;计算得来
    private int  start;
    private int  end;
    private List<T> list;//每页显示的数据放到list集合中

    //构造方法
    public PageBean(int pageNum,int totalPage,int pageSize){
        //this.totalPage=totalPage;
        this.pageNum=pageNum;
        this.totalRecord=totalRecord;
        this.pageSize=pageSize;

        //总页数算法
        if (totalRecord%pageSize==0){
            this.totalPage=totalRecord/pageSize;//总记录数整除每一页的记录数
        }else{
            this.totalPage=totalRecord/pageSize+1;
        }
        //开始索引(前面浏览的页数全部减去)
        this.startIndex=(pageNum-1)*pageSize;
        this.start=1;
        this.end=5;
        //显示页数算法
        //显示5页
        if (totalPage<=5){
            this.end=totalPage;
        }else{
            //总页数大于5
            this.start=pageNum-2;
            this.end=pageNum+2;
            //pageNum始终处于居中位置，start和end是动态变化的
            if (start<0){
                //比如第1第2页,不符合当前条件
                this.start=1;
                this.end=5;
            }
            if (end>totalPage){
                this.end=totalPage;
                this.start=totalPage-5;//不是减4？

            }

        }

    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public List getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
