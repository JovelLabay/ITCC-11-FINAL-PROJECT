/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITCC11DB;

/**
 *
 * @author Jovel Labay
 */
class Admin {
    
    private int id;
    private String q1, q2, q3, tools, comment, teacher;
    
    public Admin(int id, String q1, String q2, String q3, String tools, String comment, String teacher)
    {
        this.id=id;
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
        this.tools=tools;
        this.comment=comment;
        this.teacher=teacher;
    }
    public int getid(){
        return id;
    }
    public String getq1(){
        return q1;
    }
    public String getq2(){
        return q2;
    }
    public String getq3(){
        return q3;
    }
    public String gettools(){
        return tools;
    }
    public String getcomment(){
        return comment;
    }
     public String getteacher(){
        return teacher;
    }
}
