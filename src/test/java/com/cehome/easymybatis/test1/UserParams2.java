package com.cehome.easymybatis.test1;


import com.cehome.easymybatis.annotation.Query;
import com.cehome.easymybatis.annotation.QueryItem;
import lombok.Data;

import java.util.Date;

/**
 * @selectBase
 */
@Data
@Query(columns = "id,createTime",conditions = "1=1 and {createTime} is not null ")
public class UserParams2 extends User {

    @QueryItem("create_time>= #{createTime1} ")
    private Date createTime1;
}
