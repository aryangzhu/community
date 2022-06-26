package com.changzhu.community.entity;

import lombok.Data;

/**
 * @author leiliu
 * @date 22-6-25 下午2:58
 */
@Data
public class Page {

    //显示数量最大值,用于判断传参数是否超界
    private static final int MAX_LIMIT=100;

    //当前页码
    private int current=1;

    //显示上限
    private int limit=10;

    //数据总数
    private long rows;

    //查询路径,在thymleaf中分页链接复用,path在渲染时将会携带current参数
    private String path;

    public void setCurrent(int current){
        if(current>=1){
            this.current=current;
        }
    }


    public void setLimit(int limit){
        if(limit>=1 &&  limit<=MAX_LIMIT){
            this.limit=limit;
        }
    }

    public void setRows(long rows){
        if(rows>=0){
            this.rows=rows;
        }
    }

    //获取初始行行号
    public int getOffset(){
        return (current-1)*limit;
    }


    //获取总页数
    public int getTotal(){
        if(rows%limit==0){
            return (int)rows/limit;
        }else{
            return (int)rows/limit+1;
        }
    }

    //获取起始页码,在前端页面展示时使用
    public int getFrom(){
        int from=current-2;
        return from<1?1:from;
    }

    //获取末尾页码,作用和上面起始页码相同
    public int getTo(){
        int to=current+2;
        int total=getTotal();
        return to<total?to : total;
    }
}
