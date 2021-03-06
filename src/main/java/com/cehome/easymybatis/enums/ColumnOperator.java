package com.cehome.easymybatis.enums;

import com.cehome.easymybatis.core.Global;

public enum ColumnOperator{
        /* not include special operator such as REGEXP  <=>
           DEFAULT will replace with "=" or "in" (array property)
        * */
        DEFAULT(""),
        EQ("="),NOT_EQ(Global.OPER_NOT_EQ), GT(">"),GE(">="),LT(Global.OPER_LESS_THAN),LE(Global.OPER_LESS_EQUAL),
        BETWEEN("BETWEEN"),
        NOT_BETWEEN("NOT BETWEEN"),
        LIKE("LIKE"),
        IN("IN"),NOT_IN("NOT IN"),
       
        //must be Boolean value ,true means IS NULL , false means IS NOT NULL;
        NULL("IS NULL","IS NOT NULL"),
        //custom
        RANGE("RANGE");

        private String[] value;
         ColumnOperator(String... value){
             this.value=value;

        }

    public String[] getValue() {
        return value;
    }


}
