package org.nutz.dao.sql;

import java.io.Serializable;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SqlCallback extends Serializable {

    Object invoke(Connection conn, ResultSet rs, Sql sql) throws SQLException;

}
