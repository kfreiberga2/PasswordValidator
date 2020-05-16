package com.company.data;

import java.sql.ResultSet;

public abstract class EntityBase {

    public abstract String getSelectSql();

    public abstract EntityBase getEntity(ResultSet rs);

}
