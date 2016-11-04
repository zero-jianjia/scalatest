package org.zero.dao

import java.sql.{SQLException, ResultSet}
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataAccessException
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository
import javax.sql.DataSource

@Repository
class PersonDao extends BaseDao {
    @Autowired
    @Qualifier("dataSource") var ds: DataSource = _

    implicit lazy val dataSource = ds

    //    def findAllPerson: Seq[Person] = {
    //        def toPerson(rs: ResultSet, i: Int): Person = new Person(rs.getString(1), rs.getString(2))
    //        def rowMapper: (ResultSet, Int) => Person = toPerson(_,_)
    //        jdbcTemplate.query("select * from person", rowMapper).as
    //
    //    }

    @throws(classOf[DataAccessException])
    def queryAndMap[T](sql: String)(rowMapper: (ResultSet, Int) => T) {
        jdbcTemplate.query(sql,Array[AnyRef](),
            new RowMapper[T] {
                override def mapRow(rs: ResultSet, rowNum: Int): T = {
                    rowMapper(rs, rowNum)
                }
            })
    }

    //    def savePerson(person: Person) = {
    //        jdbcTemplate.updateWithSetter("insert into Person(firstName, LastName) values(?,?)")(ps => {
    //            ps.setString(1, person.firstName)
    //            ps.setString(2, person.lastName)
    //        })
    //    }

}