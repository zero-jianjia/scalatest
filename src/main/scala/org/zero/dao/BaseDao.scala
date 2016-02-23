package org.zero.dao

import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

trait BaseDao {
    implicit def dataSource: DataSource
    
    lazy val jdbcTemplate = new JdbcTemplate(dataSource)
}